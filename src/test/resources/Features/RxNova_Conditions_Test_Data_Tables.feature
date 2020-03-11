Feature: RxNova Condition Smoke Test With Test Data Table

  Scenario: Conditions Smoke Test
    Given User is on Login page
    When User enters username and password
      | username | password |
      | regtest  | Rxnova@2 |
    And Click on Login button
    Then Region selection page displays
    When click on region
      | region |
      | DR1    |
    Then Rxnova Landing page displays
