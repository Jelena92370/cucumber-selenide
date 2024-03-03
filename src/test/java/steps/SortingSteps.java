package steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.InventoryPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertEquals;

public class SortingSteps extends BaseSteps {



    @When("^User clicks on Sorting Dropdown Icon$")
    public void userClicksOnSortingDropdownIcon() {
        inventoryPage.sortingDropdownMenu.click();
    }

    @Then("^Four options appear$")
    public void fourOptionsAppear() {
        inventoryPage.sortingOptionsList.shouldHave(CollectionCondition.size(4));
    }

    @When("^User chooses option Name A to Z$")
    public void userChoosesOptionNameAToZ() {
        inventoryPage.optionAToZ.click();
    }

    @Then("^All items are sorted in the A to Z order$")
    public void allItemsAreSortedInTheAToZOrder() {


        List<String> actualNames = new ArrayList<>();
        for (int i = 0; i < inventoryPage.itemNames.size(); i++) {
            actualNames.add(inventoryPage.itemNames.get(i).getText());
        }


        List<String> sortedNames = new ArrayList<>(actualNames);
        Collections.sort(sortedNames);

inventoryPage.itemNames.shouldHave(exactTexts(sortedNames));


    }

    @And("^chooses option Name Z to A$")
    public void choosesOptionNameZToA() {
        inventoryPage.optionZToA.click();
    }

    @Then("^All items are sorted in the Z to A order$")
    public void allItemsAreSortedInTheZToAOrder() {

        List<String> actualNames = new ArrayList<>();
        for (int i = 0; i < inventoryPage.itemNames.size(); i++) {
            actualNames.add(inventoryPage.itemNames.get(i).getText());
        }

        List<String> sortedNamesZToA = new ArrayList<>(actualNames);
        Collections.sort(sortedNamesZToA, Collections.reverseOrder());

        inventoryPage.itemNames.shouldHave(exactTexts(sortedNamesZToA));
    }

    @And("^chooses option Price Low to High$")
    public void choosesOptionPriceLowToHigh() {
        inventoryPage.optionPriceLowToHigh.click();
    }

    @Then("^All items are sorted in the Price Low to High order$")
    public void allItemsAreSortedInThePriceLowToHighOrder() {

        // Извлечение реальных цен и добавление их в список
        List<Double> prices = new ArrayList<>();
        for (int i = 0; i < inventoryPage.itemPrices.size(); i++) {
            String priceText = inventoryPage.itemPrices.get(i).getText().substring(1);
            double priceValue = Double.parseDouble(priceText);
            prices.add(priceValue);
        }

// Создание копии списка и сортировка его
        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);

// Сравнение отсортированной копии с реальным списком
        for (int i = 0; i < prices.size(); i++) {
            inventoryPage.itemPrices.get(i).shouldHave(text(String.valueOf(sortedPrices.get(i))));
        }
    }

    @And("^chooses option Price High To Low$")
    public void choosesOptionPriceHighToLow() {
        inventoryPage.optionPriceHightToLow.click();
    }

    @Then("^All items are sorted in the Price High To Low order$")
    public void allItemsAreSortedInThePriceHighToLowOrder() {
        // Извлечение реальных цен и добавление их в список
        List<Double> prices = new ArrayList<>();
        for (int i = 0; i < inventoryPage.itemPrices.size(); i++) {
            String priceText = inventoryPage.itemPrices.get(i).getText().substring(1);
            double priceValue = Double.parseDouble(priceText);
            prices.add(priceValue);
        }

// Создание копии списка и сортировка его
        List<Double> sortedPricesReverse = new ArrayList<>(prices);
        Collections.sort(sortedPricesReverse, Collections.reverseOrder());

// Сравнение отсортированной копии с реальным списком
        for (int i = 0; i < prices.size(); i++) {
            inventoryPage.itemPrices.get(i).shouldHave(text(String.valueOf(sortedPricesReverse.get(i))));
        }
    }
    }




