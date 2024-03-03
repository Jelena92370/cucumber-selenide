Feature: Sorting Items

  Background:

    When User inputs "standard_user" to username field
    And inputs "secret_sauce" to password field
    When User pushes the Login button
    Then User is on the page Inventory

  @SortingItemsByNameAToZ
  Scenario: Sorting items by name A to Z
    When User clicks on Sorting Dropdown Icon
    Then Four options appear
    When User chooses option Name A to Z
    Then All items are sorted in the A to Z order


  @SortingItemsByNameZToA
  Scenario: Sorting items by name Z to A
    When User clicks on Sorting Dropdown Icon
     And chooses option Name Z to A
    Then All items are sorted in the Z to A order

  @SortingItemsByPriceLowToHigh
  Scenario: Sorting items by price Low to High
    When User clicks on Sorting Dropdown Icon
    And chooses option Price Low to High
    Then All items are sorted in the Price Low to High order

  @SortingItemsByPriceHighToLow
  Scenario: Sorting items by price High To Low
    When User clicks on Sorting Dropdown Icon
    And chooses option Price High To Low
    Then All items are sorted in the Price High To Low order