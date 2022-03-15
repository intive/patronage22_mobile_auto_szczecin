Feature: Smoke test - check if application is open

  Background:
    Given Application is opened

  Scenario: Open application without issue
    Then "Email" text should be visible

  @P2022-1237
  Scenario: Login using existing account
    And Provide login: "patronage.szczecin22@gmail.com"
    And Provide password: "AndroidPatronage"
    And Click on sign in button
    Then Navigation drawer is opened

  @P2022-1237
  Scenario: Register new user
    And Provide login for new account
    And Provide name for new account
    And Provide password for new account
    And Click on save button
    Then Navigation drawer is opened
