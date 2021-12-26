package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy (xpath = "//i[@class='icon-trash']")
    WebElement deleteButton;

    @CacheLookup
    @FindBy (xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement cartEmptyMessage;


    public void clickOnDeleteButton(){
        log.info("Clicking on Delete Button " + deleteButton.toString());
        doClickOnElement(deleteButton);
    }

    public void verifyShoppingCartEmptyMessage(String message){
        log.info("Verifying Shopping Cart Empty Message  " + message.toString());
//        verifyThatTextIsDisplayed(cartEmptyMessage,message);
        System.out.println(doGetTextFromElement(cartEmptyMessage));
        doVerifyElements(cartEmptyMessage,"Your shopping cart is empty.","Your shopping cart is empty.");
    }

}
