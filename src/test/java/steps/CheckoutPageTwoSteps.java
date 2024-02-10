package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckoutStepTwoPage;

import static com.codeborne.selenide.Condition.visible;

public class CheckoutPageTwoSteps {
    CheckoutStepTwoPage checkoutStepTwoPage = new CheckoutStepTwoPage();

    @Then("^User is on the checkout-step-two page$")
    public void userIsOnTheCheckoutStepTwoPage() {
        checkoutStepTwoPage.pageTwoFirstItem.shouldBe(visible);
    }

    @When("^User clicks on Finish button$")
    public void userClicksOnFinishButton() {
        checkoutStepTwoPage.finishButton.click();
    }
}
