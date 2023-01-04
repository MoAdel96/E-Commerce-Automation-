Feature: Logged user could select different tags

  Scenario: Logged user could select different tags

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

    # select dif tags
    When user click on tag

    Then the products with same tag will appear


