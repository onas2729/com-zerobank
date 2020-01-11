@login
Feature: Login

Feature: Login
  @login
  Scenario: Authorized user should be able to login
    Given The user is on the login page
    When the user enters valid credentials
    And clicks on sign in button
    And the page title should be "Zero - Account Summary"