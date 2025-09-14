Feature: Practice Test Automation Website
  Scenario: Verify Practice Test Automation Logo on Login Page
    Given I launch chrome browser
    When I open Practice Test Automation login page
    Then I verify logo is present on login page
    And I close browser