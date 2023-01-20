package com.virgingames.cucumber.steps;

import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {
    @Given("^I accepted cookies$")
    public void iAcceptedCookies() {
        new LoginPage().acceptCookies();


    }

    @Then("^I can see virgin games homepage$")
    public void iCanSeeVirginGamesHomepage() {

    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Login link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {

    }
}
