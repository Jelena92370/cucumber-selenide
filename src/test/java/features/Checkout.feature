Feature: Checkout

  Background:

    When User inputs "standard_user" to username field
    And inputs "secret_sauce" to password field
    When User pushes the Login button
    Then User is on the page Inventory

@Checkout
  Scenario: Success checkout with 3 items
    When User clicks on Add to Cart Button for the Backpack item
    And clicks on Add to Cart Button for the T-shirt item
    And clicks on Add to Cart Button for the Onesie item
    When User clicks on shopping basket icon
    Then User is on the shopping cart page
    And There are three items displayed
    When User clicks on Checkout button
    Then User is on the checkout-step-one page
    When User inputs "FirstName" in first name field
    When User inputs "LastName" in last name field
    And inputs "DE345643" in the postal code field
    When User clicks on Continue button
    Then User is on the checkout-step-two page
    When User clicks on Finish button
    Then User is on the checkout-complete page
    And Message "Thank you for your order!" is displayed




