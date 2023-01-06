Feature: Logged user could filter with color

  Scenario: Logged user could filter with color

    #login
    Given User open Browser

    And User navigates to website

    And user navigate to login page

    When user enter valid email and password

    And user click on login button

    Then user login successfully

     #select different Categories

    When user hover on category

    And user click on sub-category

    Then category page will open

    # Filter

    When user click on color

    Then the products with same color will appear