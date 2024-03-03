package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InventoryPage;

import static com.codeborne.selenide.Condition.visible;

public class InventorySteps extends BaseSteps {



    @Then("^User is on the page Inventory$")
    public void userIsOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible);
    }


    @When("^User clicks on Add to Cart Button for the Backpack item$")
    public void userClicksOnAddToCartButtonForTheBackpackItem() {
        inventoryPage.addToCartBackpack.click();
    }

    @And("^clicks on Add to Cart Button for the T-shirt item$")
    public void clicksOnAddToCartButtonForTheTShirtItem() {
        inventoryPage.addToCartTSkirt.click();
    }

    @And("^clicks on Add to Cart Button for the Onesie item$")
    public void clicksOnAddToCartButtonForTheOnesieItem() {
        inventoryPage.addToCartOnesie.click();
    }

    @When("^User clicks on shopping basket icon$")
    public void userClicksOnShoppingBasketIcon() {
        inventoryPage.shopppingBasket.click();
    }


}
