package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InventoryPage;
import pages.ShoppingCartPage;

public class CartSteps {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Then("^User is on the shopping cart page$")
    public void userIsOnTheShoppingCartPage() {
        shoppingCartPage.cardTitle.shouldHave(Condition.text("Your Cart"));
    }


    @When("^User clicks on Checkout button$")
    public void userClicksOnCheckoutButton() {
        shoppingCartPage.checkoutButton.click();
    }

    @Then("^There are three items displayed$")
    public void thereAreThreeItemsDisplayed() {
shoppingCartPage.itemsList.shouldHave(CollectionCondition.size(3));
    }
}
