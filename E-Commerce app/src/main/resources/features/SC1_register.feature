Feature: User could register
@Register
  #Test Scenario 1
  Scenario: User could register with valid data

    Given User open browser and navigates to website
    And user navigate to register page
    When User fill the form
    And User Click on Register button
    Then User could register successfully
    And go to the main page
