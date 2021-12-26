package com.automation.cucumber.stepdefs;

import com.automation.pages.HomePage;
import com.automation.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePriceRange {
    @When("^I mouse hover on 'Women' tab$")
    public void iMouseHoverOnWomenTab() {
        new HomePage().mouseHoverOnWomenTab();
    }

    @And("^I click on 'Summer Dresses'$")
    public void iClickOnSummerDresses() {
        new HomePage().clickOnSummerDresses();
    }

    @And("^I move price range slider$")
    public void iMovePriceRangeSlider() throws InterruptedException {
        new SummerDressesPage().moveSlider();
    }

    @Then("^I can see products from expected price range$")
    public void iCanSeeProductsFromExpectedPriceRange() {
    }

}
