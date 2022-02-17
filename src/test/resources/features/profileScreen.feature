Feature: Automate Profile screen - test

  Background:
    Given Application is opened

    Scenario: Open application and check Profile screen
      When User send email
      And User send password
      And Navigation drawer is opened
      And Profile screen is opened
      And Bottom app is visible
      Then "Profile screen" should be visible