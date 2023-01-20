package com.virgingames.cucumber.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Then("^I can see online Bingo tab on homepage$")
    public void iCanSeeOnlineBingoTabOnHomepage() {
    }

    @When("^I click on online Bingo tab$")
    public void iClickOnOnlineBingoTab() {
        new HomePage().clickOnOnlineBingo();

    }

    @Then("^I should able to click on tab successfully$")
    public void iShouldAbleToClickOnTabSuccessfully() {
    }

    @Given("^I accept cookies$")
    public void iAcceptCookies() {
        new LoginPage().acceptCookies();
    }
}
