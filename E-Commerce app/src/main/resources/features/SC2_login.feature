Feature: User could log in with valid email and password

  @Authentication
  @Search
  @switch
  @category
  @filter
  @tags
  @cart
  @wishlist
  @compare

  Scenario:User could log in with valid email and password

    Given User open browser and navigates to website
    And user navigate to login page
    When user enter valid email
    And user enter valid password
    And user click on login button
    Then user login successfully
    And go to the main page