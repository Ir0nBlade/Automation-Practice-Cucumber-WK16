package com.automation.cucumber.stepdefs;

import com.automation.pages.HomePage;
import com.automation.pages.OurStoresPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OurStores {
    @When("^I click on 'Our Stores' link$")
    public void iClickOnOurStoresLink() {
        new HomePage().clickOnOurStoresLink();
    }

    @And("^I accept Pop Up message$")
    public void iAcceptPopUpMessage() {
        new OurStoresPage().clickOnOkButtonForPopUp();
    }

    @And("^I scroll Through Map to West Palm Beach$")
    public void iScrollThroughMapToWestPalmBeach() throws InterruptedException {
        new OurStoresPage().scrollThroughMap();
    }

    @And("^I take Screenshot of the page$")
    public void iTakeScreenshotOfThePage() throws InterruptedException {
        new OurStoresPage().takeScreenshot();
    }
}
