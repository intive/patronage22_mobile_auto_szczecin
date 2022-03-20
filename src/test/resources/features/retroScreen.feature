Feature: Automate Retro screen

  Background:
    Given Application is opened
    And Main screen is open
    And Navigation drawer is opened
    And Boards screen is opened

    @P2022-1225
  Scenario: Retro boards details screen
    When Retro boards contains arrow back buttons