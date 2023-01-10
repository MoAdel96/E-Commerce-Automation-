Feature: Create successful Order

  @smoke
  Scenario: Create successful Order

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

    #add to cart
    When user click on add to cart1
    And user select size
    And user click on add to cart2
    Then The product successfully added to your shopping cart

    # shopping cart
    When user click on shopping cart
    And mark terms of service check box
    And press check out

    #Billing address
    When user fill the form
    And  user press continue1

    #Shipping method
    When user choose Shipping method
    And press continue2

    #Payment method
    When user choose Payment method and continue

     #Payment information
    When user press confirm
    Then Your order has been successfully processed


