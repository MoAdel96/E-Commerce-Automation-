Feature: Reset Password

  Scenario: user could reset his/her password successfully

    #login

    Given User open Browser

    And User navigates to website

    And user navigate to login page

    #Reset Feature

    And user click on forget password link

    When user fills his Email

    And user click on Recover button

    Then A message is Displayed to user