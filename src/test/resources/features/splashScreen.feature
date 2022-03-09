Feature: Automate Splash Screen

  Background:
    Given Application is opened

  @P2022-782
  Scenario: Splash Screen
    When The app is restarted
    Then Splash screen is visible