Feature: Practice Test Automation Login Feature
  Scenario: Successful Login with valid credentials
    Given User launch chrome browser
    When User opens URL "https://practicetestautomation.com/practice-test-login/"
    And User enters username as "student" and password as "Password123"
    And Click on Submit
    Then Page title should be "Logged In Successfully | Practice Test Automation"
    When User click on Logout Link
    Then Page title should be "Test Login | Practice Test Automation"
    And close Browser

  Scenario Outline: Login with invalid credentials
    Given User launch chrome browser
    When User opens URL "https://practicetestautomation.com/practice-test-login/"
    And User enters username as "<username>" and password as "<password>"
    And Click on Submit
    Then User should not be able to login successfully
    And close Browser

    Examples:
    | username | password |
    | incorrectUser | Password123 |
    | student | incorrectPassword |