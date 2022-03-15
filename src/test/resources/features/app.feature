Feature: Smoke test - check if application is open

  Background:
    Given Application is opened

  Scenario: Open application without issue
    Then "Email" text should be visible

  @P2022-1237
  Scenario: Login using existing account
    When User write email
    And User write password
    Then Navigation drawer is opened

  @P2022-1237 @skip
  Scenario: Register new user
    When Write login for new account
    And Write name for new account
    And Write password for new account
    And Click on save button
    Then Navigation drawer is opened
