package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurStoresPage extends Utility {

    private static final Logger log = LogManager.getLogger(OurStoresPage.class.getName());

    public OurStoresPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'OK')]")
    WebElement popUpOkButton;

    @CacheLookup
    @FindBy(id = "map")
    WebElement map;

    @CacheLookup
    @FindBy (xpath = "//button[@title='Zoom out']")
    WebElement zoomOutButton;

    public void clickOnOkButtonForPopUp() {
        doClickOnElement(popUpOkButton);
    }

    public void scrollThroughMap() throws InterruptedException {
        doClickOnElement(zoomOutButton);
        Thread.sleep(500);
        doClickOnElement(zoomOutButton);
        Thread.sleep(500);
        Actions builder = new Actions(driver);
        Action dragTheMap = builder.clickAndHold(map).moveByOffset(20, -200).moveToElement(map)
                .release(map)
                .build();
        dragTheMap.perform();

//        Action dragTheMap2 = builder.clickAndHold(map).moveByOffset(50, -600).moveToElement(map)
//                .release(map)
//                .build();
//        dragTheMap2.perform();
    }

    public void takeScreenshot() throws InterruptedException {
        Thread.sleep(1000);
        javaExecutorScriptExecuteScriptToPerformScroll();
        takeScreenShot();
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void javaExecutorScriptExecuteScriptToPerformScroll()
    {
        js.executeScript("window.scrollBy(0,300)");
    }

}
