package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {

    public SelenideElement completedTitle = $(byClassName("title"));

    public SelenideElement messageText = $(byClassName("complete-header"));

    //
}
