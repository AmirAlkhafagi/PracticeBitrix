Feature: Verify login for Bitrix project with correct credentials.

  @login
  Scenario: Login to Bitrix page with correct credentials
    Given user is on login page
    When user enters correct credentials
    Then user should be able to see landing page