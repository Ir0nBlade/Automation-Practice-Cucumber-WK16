package com.automation.cucumber.stepdefs;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccountPageTest extends Utility {

    @When("^I click on Sign In link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @And("^I enter 'Email Address' in email address field to create account$")
    public void iEnterEmailAddressInEmailAddressFieldToCreateAccount() {
        new SignInPage().inputEmailToCreateAccount(doGetRandomEmail());
    }

    @And("^I click on 'Create an account' button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateAccountButton();
    }

    @And("^I enter all mandatory personal information 'Title', 'First name', 'Last name', 'Email', 'Password'$")
    public void iEnterAllMandatoryPersonalInformationTitleFirstNameLastNameEmailPassword() {
        new CreateAccountPage().enterPersonalInformation("Harry","Potter","Mr.","Harry123");
    }

    @And("^I enter all mandatory Address details 'First name', 'Last name', 'Email', 'Password', 'Address', 'City', 'State', 'Postal code', 'country', 'mobile'$")
    public void iEnterAllMandatoryAddressDetailsFirstNameLastNameEmailPasswordAddressCityStatePostalCodeCountryMobile() {
        new CreateAccountPage().enterAddressDetails("Harry", "Potter", "10 Downing Street",
                "London", "California", "36401", "01234859674");
    }

    @And("^I click on 'Register' button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @Then("^My account was created successfully$")
    public void myAccountWasCreatedSuccessfully() {
        new CreateAccountPage().verifyMyAccountText("My Account");
    }
}
