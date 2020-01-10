@login
Feature: Login

  @login1
  Scenario: Authorized users should be able to login

    Given the user is on the login page
    When user enters "username" and "password" and clicks Sign in button
    Then the page title should be Account summary page
  @login2
  Scenario: Authorized users should not be able to login

    Given the user is on the login page
    When user enters "abc" and "def" and clicks Sign in button
    Then user should not be able to login
    And error message should be displayed