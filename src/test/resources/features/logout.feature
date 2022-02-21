Feature: logout feature

  Scenario: Logout
    Then Input mail "xyz@wp.pl"
    And Click next button
    And Input password "Xyzabc"
    And Click SIGN IN button
    And Open navigation drawer
    And Click profile
    And Click three dots button
    And Click Logout

