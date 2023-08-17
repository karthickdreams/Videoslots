Feature: Enter and checking the textNote in evernote
  		By this Feature user can able create the new note 
  		and user can check the note content

  Background: 

  Scenario Outline: Evernote Login Check
    When user can enter input credentials
    And user can enter the username as "<username>"
    And user can enter the password as "<password>"
    And user can click the login button
    Then The home page will be displayed
    But The forgot password will be displayed

    Examples: 
      | username                          | password   |
      | karthicksoundararajan02@gmail.com | Karthick@6 |
      | karthickmonishraj@gmail.com       | Karthick@6 |

  Scenario: Entering the TextNote
    When user able to login
    And user can click new note
    And user can enter new note
    And user can able to logout
    Then user can able to see the logout message

  Scenario: validate the TextBox
    When user can able to login
    And user can click the recent note
    And validate the Textnote
    Then user can able to logout
