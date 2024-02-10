package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutStepTwoPage {

    public SelenideElement pageTwoFirstItem = $(byClassName("inventory_item_name"));
    public SelenideElement finishButton = $(byId("finish"));
}
