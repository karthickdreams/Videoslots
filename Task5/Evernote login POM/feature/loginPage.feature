Feature: Login Page Feature
  This Feature is used to login to the Evernote

  Scenario Outline: Verify Login for Evernote Application
    Given Navigate to Login Page in Application
    When User can enter "<username>" and "<password>"
    And user can click the login button
    Then The home page will be displayed
    But The forgot password will be displayed

    Examples: {'datafile' : 'resources/testdatafiles/testdata.xls'}
