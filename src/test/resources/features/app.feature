Feature: Smoke test - check if application is open

  Background:
    Given Application is opened

  Scenario: Open application without issue
    Then "Email" text should be visible



