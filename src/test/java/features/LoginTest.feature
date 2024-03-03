
@Login
Feature: Login


  @validdata
  Scenario: Success login with valid data

    When User inputs "standard_user" to username field
    And inputs "secret_sauce" to password field
    When User pushes the Login button
    Then User is on the page Inventory

  @invalid_data
  Scenario Outline: Login with invalid data

    When User inputs "<username>" to username field
    And inputs "<password>" to password field
    When User pushes the Login button
    Then Error message "<errorMessageText>" is displayed
    Examples:
      |username |password | errorMessageText                                                |
      |standard_user | secret_ |Username and password do not match any user in this service |
      |locked_out_user | secret_sauce| Sorry, this user has been locked out                 |
      |user123 | secret_sauce| Username and password do not match any user in this service  |


  @empty_value
    Scenario Outline: Login with empty values

    When User inputs "<username>" to username field
    And inputs "<password>" to password field
    When User pushes the Login button
    Then Error message "<errorMessageText>" is displayed

    Examples:
      |username |password    |errorMessageText|
      |         |secret_sauce|Username is required|
      | standard_user|       |Password is required|
      |         |            |Username is required|

  @empty_password
  Scenario: Password is empty

    When User inputs "" to username field
    When User pushes the Login button
    Then Error message "Password is required" is displayed


  @empty_creds
  Scenario: Credentials are empty
    Given User opens Saucedemo Login page
        When User pushes the Login button
    Then Error message "Username is required" is displayed