Feature: Automate Retro screen

  Background:
    Given Application is opened
    And Main screen is open
    And Navigation drawer is opened
    And Boards screen is opened

  @P2022-1225
  Scenario: First retro board details screen
    When First retro board is opened
    Then "Board id: 1" retro board id is visible
    And Arrow back button is visible

  @P2022-1225
  Scenario: Second retro board details screen
    When Second retro board is opened
    Then "Board id: 2" retro board id is visible
    And Arrow back button is visible

  @P2022-1225
  Scenario: Third retro board details screen
    When Third retro board is opened
    Then "Board id: 3" retro board id is visible
    And Arrow back button is visible
