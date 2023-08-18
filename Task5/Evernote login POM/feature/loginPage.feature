Feature: Login Page Feature
  This Feature is used to login to the Evernote
  The script enters the username and password
  Upon successful login the script will check the Create note option existence
  Upon failure the script will validate the header text and exists
  Data are fetched from the external excel file

  Scenario Outline: Verify Login for Evernote Application
    Given Navigate to Login Page in Application
    When User can enter "<username>" and "<password>"
    And user can click the login button
    Then The home page will be displayed
    But The forgot password will be displayed

    Examples: {'datafile' : 'resources/testdatafiles/testdata.xls'}
