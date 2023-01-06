Feature: Logged User could switch between currencies

  Scenario: Logged User could switch between currencies US-Euro

    #login
    Given User open Browser

    And User navigates to website

    And user navigate to login page

    When user enter valid email and password

    And user click on login button

    Then user login successfully

        #Switch Feature

    When user clicks on currencies Dropdown

    And user click on currency

    Then the currency will change