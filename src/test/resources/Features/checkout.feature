Feature: Testing Checkout Details

  Background:
    Given the login-page is open
    And the user fills the username with 'standard_user'
    And the user fills the password with 'secret_sauce'
    And the user clicks the login button
    And the cart page is opened

  Scenario: Valid Credentials
    Given User clicks on Checkout button
    And User enters their first name: 'Tanzeel'
    And User enters their last name: 'Khan'
    And User enter their zip code: '4028'
    When User clicks on Continue button
    Then The user is directed to the next checkout page

  Scenario Outline: Incorrect Credentials
    Given User clicks on Checkout button
    And  User enters their first name: '<FirstName>'
    And  User enters their last name: '<LastName>'
    And  User enter their zip code: '<PostCode>'
    When User clicks on Continue button
    Then User is prompted with the message: '<msg>'

    Examples:
      | FirstName | LastName | PostCode | msg |
      |  |  |  | Error: First Name is required |
      |  | Karma | 4028 | Error: First Name is required |
      | Karma |  | 4028 | Error: Last Name is required |
      | Karma | Pan |  | Error: Postal Code is required |
