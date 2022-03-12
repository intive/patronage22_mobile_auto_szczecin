Feature: Automate Bottom bar

  Background:
    Given Application is opened

  @P2022-1171
  Scenario: Navigation icon test (boards)
    Given Main screen is open
    And Navigation drawer is opened
    And Boards screen is opened
    Then "Board screen" should be visible

  @P2022-1171
  Scenario: Navigation icon test (history)
    Given Main screen is open
    And Navigation drawer is opened
    And History screen is opened
    Then "History screen" should be visible