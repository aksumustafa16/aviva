Feature: The user should able to go back to the main page

    @login @return
    Scenario: Go to main page from login page
      Given the user in on the main page
      When the user click the login button
      And the user click the aviva logo
      Then the user go back to the main page