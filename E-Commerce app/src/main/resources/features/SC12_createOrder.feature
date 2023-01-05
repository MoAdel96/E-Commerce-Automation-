Feature: Create successful Order

  Scenario: Create successful Order

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

    When user click on add to cart

    And user select size

    And user click on add to cart

    Then The product successfully added to your shopping cart

    # shopping cart

    When user click on shopping cart

    And mark terms of service check box

    And press check out

    Then Billing address form will open

    #Billing address

    When user fill the form

    And  user press continue1

    #Shipping method

    When user choose Shipping method

    And press continue2

    #Payment method

    When user choose Payment method

    And press continue3

     #Payment information

     When user press continue4

      #Confirm order

    When user press confirm

    Then Your order has been successfully processed


