Feature: Logged User could switch between currencies

  Scenario: Logged User could switch between currencies US-Euro

    #login

    Given User open browser and navigates to website

    And user navigate to login page

    When user enter valid email

    And user enter valid password

    And user click on login button

    Then user login successfully

    And go to the main page

        #Switch Feature

    When user clicks on currencies Dropdown

    And user click on currency

    Then the currency will change