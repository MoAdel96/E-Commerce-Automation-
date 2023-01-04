Feature: Logged User could search for any product

  Scenario: Logged User could search for any product

    #login
    Given User open Browser

    And User navigates to website

    And user navigate to login page

    When user enter valid email and password

    And user click on login button

    Then user login successfully

    #Search Feature

    When user enter product" name

    And user click on search button

    Then the result page will open


