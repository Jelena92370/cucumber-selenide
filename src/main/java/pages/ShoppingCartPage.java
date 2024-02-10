package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCartPage {
    public SelenideElement cardTitle = $(byClassName("title"));
    public SelenideElement checkoutButton = $(byId("checkout"));
    public ElementsCollection itemsList = $$(byClassName("inventory_item_name"));
}
