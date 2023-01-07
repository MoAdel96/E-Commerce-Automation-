Feature: User could register

  #Test Scenario 1
  Scenario: User could register with valid data

    And User navigates to website
    And user navigate to register page
    When User fill the form
    And User Click on Register button
    Then User could register successfully
    And go to the main page
