Feature: Automate Retro screen

  Background:
    Given Application is opened

  Scenario: Retro board details screen
    Given User is logged in
    And Navigation drawer is opened
    And Boards screen is opened
    And Retro board is opened
    Then "Board id: 1" retro board id is visible
    And Arrow back button is visible
