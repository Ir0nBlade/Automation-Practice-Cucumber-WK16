package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='category-name']")
    WebElement womenText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productsList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Blouse']")
    WebElement blouse;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Dress'][normalize-space()='Printed Dress'])[1]")
    WebElement printedDress;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Printed Chiffon Dress']")
    WebElement priChiDress;

    @CacheLookup
    @FindBy(xpath = "(//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress'])[2]")
    WebElement summerDress;

    @CacheLookup
    @FindBy (xpath = "(//a[@class='product_img_link']//img)[1]")
    WebElement faddedshortSleeveTShirt;

    public void verifyWomenText(String text) {
        log.info("Verifying Women Text " + womenText.toString());
        verifyThatTextIsDisplayed(womenText, text);
    }


    public void selectProduct(String proName) {
        if (proName.equalsIgnoreCase("Blouse")) {
            log.info("Clicking on Blouse " + blouse.toString());
            doClickOnElement(blouse);
        } else if (proName.equalsIgnoreCase("Printed Dress")) {
            log.info("Clicking on Printed Dress " + printedDress.toString());
            doMouseHoverAndClick(printedDress);
        } else if (proName.equalsIgnoreCase("Printed Chiffon Dress")) {
            log.info("Clicking on Printed Chiffon Dress " + priChiDress.toString());
            doClickOnElement(priChiDress);
        } else if (proName.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            log.info("Clicking on Summer Dress " + summerDress.toString());
            doClickOnElement(summerDress);
        }else if (proName.equalsIgnoreCase("Faded Short Sleeve T-shirts")){
            log.info("Clicking on Fadded Short Sleeve T-Shirt " + faddedshortSleeveTShirt.toString());
            doClickOnElement(faddedshortSleeveTShirt);

        }
    }
}
