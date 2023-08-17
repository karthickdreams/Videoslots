Feature: Evernote_Login_Check
  		The functionality of the feature is to perform login check in Evernote
      Upon successful login Evernote home page will be displayed
      Upon failure Reset password screen will be displayed

  Scenario Outline: Evernote Login Check
    When user can click Login button
    And user can enter the username as "<username>"
    And user can enter the password as "<password>"
    And user can click the login button
    Then The home page will be displayed
    But The forgot password will be displayed

    Examples: 
      | username                          | password   |
      | karthicksoundararajan02@gmail.com | Karthick@6 |
      | karthickmonishraj@gmail.com       | Karthick@6 |
