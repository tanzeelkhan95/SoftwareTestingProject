Feature: Check different category

  Background:
  Given the login-page is open
  And the user fills the username with 'standard_user'
  And the user fills the password with 'secret_sauce'
  And the user clicks the login button

  Scenario: Testing About Category
    Given the product page is opened
    And the user clicks on 3 stripe icon
    When the user clicks on ABOUT category
    Then The user is directed to ABOUT webpage

  Scenario: Testing All Item Option Category
    Given the cart page is opened
    And  the user clicks on 3 stripe icon
    When the user clicks on ALL ITEMS category
    Then  the product page is opened

  Scenario: Logout option test
    Given the product page is opened
    And the user clicks on 3 stripe icon
    When Logout category is clicked
    Then The user login screen is open

  Scenario: Reset App State option test
    Given first item is added to cart
    And the cart item is there
    And the user clicks on 3 stripe icon
    When Reset App State Categoty is Clicked
    Then the cart item is not there
