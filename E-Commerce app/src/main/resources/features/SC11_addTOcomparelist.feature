Feature: Logged user could add different products to compare list

  Scenario: Logged user could add different products to compare list

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

    #add to compare list

    When user click on add to compare list

    Then massage will appear" The product has been added to your product comparison "