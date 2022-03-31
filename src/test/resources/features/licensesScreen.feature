Feature: Automate Open source license from More screen

  Background:
    Given Application is opened
    And User is logged in
    And Navigation drawer is opened

  @P2022-1238
  Scenario: License button functionality
    Given More screen is opened
    When Screen with licences is opened
    Then Title "Open source licenses" is visible