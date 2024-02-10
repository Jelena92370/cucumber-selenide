package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CheckoutCompletePage;

public class CheckoutCompleteSteps {
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Then("^User is on the checkout-complete page$")
    public void userIsOnTheCheckoutCompletePage() {
        checkoutCompletePage.completedTitle.shouldHave(Condition.text("Checkout: Complete!"));
    }

    @And("^Message \"([^\"]*)\" is displayed$")
    public void messageIsDisplayed(String messageText) {
        checkoutCompletePage.messageText.shouldHave(Condition.text(messageText));
    }
}
