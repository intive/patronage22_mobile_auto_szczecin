Feature: Automate Profile screen

  Background:
    Given Application is opened

  Scenario: Open application and check Profile screen
    When User write email
    And User write password
    And Navigation drawer is opened
    And Profile screen is opened
    And Bottom app is visible
    Then "Profile screen" should be visible

  @P2022-782
  Scenario: Logout
    Given User is logged in
    And Navigation drawer is opened
    And Profile screen is opened
    And Click three dots button
    Then Click Logout