Feature: Verify login for Bitrix

  Background:
    Given user is on login page

  @login
  Scenario: Login to Bitrix page with correct credentials

    When user enters correct credentials
    Then user should be able to see landing page


  @negative_login
  Scenario: Invalid password
    When user logs in with "helpdesk15@cybertekschool.com" username and "wrong" password
    Then user verifies that "Incorrect login or password" message is displayed


  @negative_scenario_out
  Scenario Outline: Invalid login with "username" and "password"
    When user logs in with "<username>" username and "<password>" password
    Then user verifies that "<message>" message is displayed

    Examples: data set
      | username | password | message                     |
      | wrong    | bad      | Incorrect login or password |
      | wrong213 | bad      | Incorrect login or password |
      | wrong32  | bad      | Incorrect login or password |
      | wrong12  | bad      | Incorrect login or password |



