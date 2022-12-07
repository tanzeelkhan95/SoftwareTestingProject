Feature:Testing Log-in Functionality.

  Background:
    Given the login-page is open

  Scenario Outline: Correct Login
    Given the user fills the username with '<username>'
    And the user fills the password with '<password>'
    When the user clicks the login button
    Then the user is directed to the product page
    Examples:
    | username | password |
    | standard_user | secret_sauce |
    | problem_user | secret_sauce |
    | performance_glitch_user | secret_sauce |

  Scenario Outline: Invalid Login
    Given the user fills the username with '<username>'
    And  the user fills the password with '<password>'
    When the user clicks the login button
    Then the following message: '<msg>' is seen
    Examples:
      | username | password | msg |
      | standard_user| | Epic sadface: Password is required |
      | | secret_sauce|  Epic sadface: Username is required |
      | | | Epic sadface: Username is required  |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.|



  Scenario Outline: Incorrect Login
    Given the user fills the username with '<username>'
    And  the user fills the password with '<password>'
    When the user clicks the login button
    Then incorrect message shown

    Examples:
      | username | password |
      | khansaab | super |
      | mynameiskhan | stapakhaza |
      | tanhayee | jaduterinazar |
      | sunrahahainatu | tujhedekha |