package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CheckoutStepOnePage;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class CheckoutPageOneSteps extends BaseSteps{


    @Then("^User is on the checkout-step-one page$")
    public void userIsOnTheCheckoutStepOnePage() {
        checkoutStepOnePage.pageOneTitle.shouldHave(Condition.text("Checkout: Your Information"));
    }

    @When("^User inputs \"([^\"]*)\" in first name field$")
    public void userInputsInFirstNameField(String firstNameValue) {

        checkoutStepOnePage.firstNameInputField.shouldBe(visible, ofSeconds(10))
                .setValue(firstNameValue);
        ;
    }

    @When("^User inputs \"([^\"]*)\" in last name field$")
    public void userInputsInLastNameField(String lastNameValue) {
        checkoutStepOnePage.lastNameInputField
                .setValue(lastNameValue);
    }

    @And("^inputs \"([^\"]*)\" in the postal code field$")
    public void inputsInThePostalCodeField(String postalCodeValue) {
        checkoutStepOnePage.postalCodeInputField
                .setValue(postalCodeValue);
    }

    @When("^User clicks on Continue button$")
    public void userClicksOnContinueButton() {
        checkoutStepOnePage.continueButton.click();
    }
}
