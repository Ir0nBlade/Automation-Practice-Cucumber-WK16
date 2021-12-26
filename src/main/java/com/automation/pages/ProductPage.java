package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(id = "quantity_wanted")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "group_1")
    WebElement selectSize;

    @CacheLookup
    @FindBy(className = "attribute_list")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeButton;

    @CacheLookup
    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    WebElement proceedToCheckoutButton;

    public void addProductAttribute(String qty, String size, String colour) {
        log.info("Entering Quantity " + quantity.toString());
        doSendTextToElement(quantity, Keys.BACK_SPACE + qty);
        log.info("Selecting Size " + selectSize.toString());
        doSelectByVisibleTextFromDropDown(selectSize, size);
        log.info("Selecting Colour  " + color.toString());
        doClickOnElement(color, colour);
    }

    public void clickOnAddToCartButton(){
        log.info("Clicking on Add To cart button " + addToCartButton.toString());
        doClickOnElement(addToCartButton);
    }

    public void verifyProductAddedToCartMessage(String text){
        log.info("Verify message displayed on Pop Up  " + popUpDisplay.toString());
        verifyThatTextIsDisplayed(popUpDisplay, text);
    }

    public void clickOnCloseButton(){
        log.info("Click on Close button " + closeButton.toString());
        doClickOnElement(closeButton);
    }

    public void clickOnProceedToCheckoutButton(){
        log.info("Clicking on Proceed to Checkout Button " + proceedToCheckoutButton.toString());
        doClickOnElement(proceedToCheckoutButton);
    }

}
