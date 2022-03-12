Feature: Automate Retro screen

  Background:
    Given Application is opened
    Given User is logged in
    And Navigation drawer is opened
    And Boards screen is opened

  @P2022-1225
  Scenario: First retro board details screen
    And First retro board is opened
    Then "Board id: 1" retro board id is visible
    And Arrow back button is visible

  @P2022-1225
  Scenario: Second retro board details screen
    And Second retro board is opened
    Then "Board id: 2" retro board id is visible
    And Arrow back button is visible

  @P2022-1225
  Scenario: Third retro board details screen
    And Third retro board is opened
    Then "Board id: 3" retro board id is visible
    And Arrow back button is visible
