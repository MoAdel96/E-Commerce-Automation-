Feature: Logged User could search for any product

  Scenario: Logged User could search for any product

    #log in
    Given User open browser and navigates to website
    And user navigate to login page
    When user enter valid email
    And user enter valid password
    And user click on login button
    Then user login successfully
    And go to the main page

    #Search Feature
    When user enter product's name
    And user click on search button
    Then the result page will open


