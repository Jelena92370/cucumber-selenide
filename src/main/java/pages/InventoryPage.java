package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));


    public SelenideElement addToCartBackpack = $(byId("add-to-cart-sauce-labs-backpack"));

    public SelenideElement addToCartTSkirt = $(byId("add-to-cart-sauce-labs-bolt-t-shirt"));

    public SelenideElement addToCartOnesie = $(byId("add-to-cart-sauce-labs-onesie"));

    public SelenideElement shopppingBasket = $(byClassName("shopping_cart_link"));

    public SelenideElement sortingDropdownMenu = $(byClassName("product_sort_container"));

    public ElementsCollection sortingOptionsList = $$(byTagName("option"));

    public SelenideElement optionAToZ = $(byValue("az"));

    public ElementsCollection itemNames = $$(byClassName("inventory_item_name"));

    public SelenideElement optionZToA = $(byValue("za"));
    public SelenideElement optionPriceLowToHigh = $(byValue("lohi"));
    public SelenideElement optionPriceHightToLow = $(byValue("hilo"));

    public ElementsCollection itemPrices = $$(byClassName("inventory_item_price"));

    //az

}
