package com.automation.cucumber.stepdefs;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.ShoppingCartPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoppingCartDelete {

    @When("^I click on 'Women' tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickOnWomenTab();
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String product)  {
        new WomenCategoryPage().selectProduct(product);
    }

    @And("^I select quantity \"([^\"]*)\", size \"([^\"]*)\" and colour \"([^\"]*)\"$")
    public void iSelectQuantitySizeAndColour(String qty, String size, String colour)  {
        new ProductPage().addProductAttribute(qty, size, colour);
    }

    @And("^I click on 'Add To Cart' button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("^I can see product has been 'Product successfully added to your shopping cart'$")
    public void iCanSeeProductHasBeenProductSuccessfullyAddedToYourShoppingCart() {
        new ProductPage().verifyProductAddedToCartMessage("Product successfully added to your shopping cart");
    }

    @And("^I click on 'Proceed To Checkout' button$")
    public void iClickOnProceedToCheckoutButton() {
        new ProductPage().clickOnProceedToCheckoutButton();
    }

    @And("^I click on 'Delete' icon to delete the product from shopping cart$")
    public void iClickOnDeleteIconToDeleteTheProductFromShoppingCart() {
        new ShoppingCartPage().clickOnDeleteButton();
    }

    @Then("^Product has been removed from shopping cart successfully$")
    public void productHasBeenRemovedFromShoppingCartSuccessfully() {
        new ShoppingCartPage().verifyShoppingCartEmptyMessage("Your shopping cart is empty.");
    }
}
