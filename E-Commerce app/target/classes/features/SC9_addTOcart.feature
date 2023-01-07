Feature: Logged user could add different products to Shopping cart

  Scenario: Logged user could add different products to Shopping cart

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

    #add to cart

    When user click on add to cart1

    And user select size

    And user click on add to cart2

    Then The product successfully added to your shopping cart