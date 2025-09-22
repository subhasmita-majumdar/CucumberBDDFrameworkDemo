Feature: Practice Test Automation Website
  Scenario: Verify Practice Test Automation Logo on Login Page
    Given I launch chrome browser
    When I open URL "https://practicetestautomation.com/practice-test-login/"
    Then I verify logo is present on login page
    And I close browser