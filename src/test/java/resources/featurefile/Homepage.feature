Feature: Homepage tabs
  As user I want click on onlineBingo tab on virgingames website


  Background: I am on virgin homepage
    Given I accept cookies
    Then I can see online Bingo tab on homepage

    Scenario: user should able to click on online Bingo tan
Given I am on homepage
      When I click on online Bingo tab
      Then I should able to click on tab successfully