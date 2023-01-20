package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement cookies;
    public void acceptCookies(){
        clickOnElement(cookies);

    }


    @CacheLookup
    @FindBy(xpath = "//a[@title='Login']")
    WebElement loginButton;
    public void clickOnLoginLink(){
        clickOnElement(loginButton);
    }
//    @CacheLookup
//    @FindBy(xpath = "//div[@aria-label='Click to verify']")
//    WebElement verifyMsg;
//    public void clickOnVerifyMessage(){
//        clickOnElement(verifyMsg);
//    }
//

}


////span[@data-tracking='{"label":"Online Slots","mvtVariant":"","mvtCampaign":""}']
