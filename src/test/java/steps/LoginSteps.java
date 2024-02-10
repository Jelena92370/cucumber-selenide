package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("^User opens Saucedemo Login page$")
    public void userOpensSaucedemoLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("^User inputs \"([^\"]*)\" to username field$")
    public void userInputsToUsernameField(String usernameValue) {

        loginPage.usernameInputField.shouldBe(visible, ofSeconds(10))
                .setValue(usernameValue);
    }

    @And("^inputs \"([^\"]*)\" to password field$")
    public void inputsToPasswordField(String passwordValue) {

        loginPage.passwordInputField
                .setValue(passwordValue);
    }

    @When("^User pushes the Login button$")
    public void userPushesTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("^Error message \"([^\"]*)\" is displayed$")
    public void errorMessageIsDisplayed(String errorText) {
        loginPage.errorMessage.shouldHave(partialText(errorText));
    }
}
