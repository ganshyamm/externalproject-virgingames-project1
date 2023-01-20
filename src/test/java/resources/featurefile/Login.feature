Feature: LoginTest
  As user I want to click on login test on virgingames website


  Background: I am on virgin homepage
  Given I accepted cookies
    Then I can see virgin games homepage


  Scenario:user should navigate to login page successfully
    Given I am on homepage
    When I click on Login link
   Then I should navigate to login page successfully
