Feature: Verify login for Bitrix

  @login
  Scenario: Login to Bitrix page with correct credentials
    Given user is on login page
    When user enters correct credentials
    Then user should be able to see landing page


  @negative_login
  Scenario: Fail to login to Bitrix page when entering wrong credentials
    Given user is on login page
    When user enters the wrong "username" or "password"
    Then "Incorrect login or password" message should show up

    # Hello(This is for first commit)

#hi this is amir
  #comment 2






