Feature: Logged user could filter with color

  Scenario: Logged user could filter with color

    #login


    Given User open browser and navigates to website

    And user navigate to login page

    When user enter valid email

    And user enter valid password

    And user click on login button

    Then user login successfully

    And go to the main page

     #select different Categories

    When user click on category

    And user click on sub-category

    Then category page will open

    # Filter

    When user click on color

    Then the products with same color will appear