package com.automation.cucumber.stepdefs;

import com.automation.pages.HomePage;
import com.automation.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummerDresses {
    @When("^I mouse hover on Women tab$")
    public void iMouseHoverOnWomenTab() {
       new HomePage().mouseHoverOnWomenTab();
    }

    @And("^I click on Summer Dresses$")
    public void iClickOnSummerDresses() {
        new HomePage().clickOnSummerDresses();
    }

    @Then("^I can navigate to Summer Dresses page$")
    public void iCanNavigateToSummerDressesPage() {
        new SummerDressesPage().verifySummserDressesText("Summer Dresses");
    }
}
