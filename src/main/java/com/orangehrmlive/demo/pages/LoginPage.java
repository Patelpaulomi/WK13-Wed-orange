package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By HRLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
    By loginPanel = By.xpath("//div[@class='orangehrm-login-slot']");


    public void enterUserName(String UserName){
        sendTextToElement(userNameField,UserName);
    }
    public void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String HRForAll(){
        return getTextFromElement(HRLogo);
    }
    public String loginPanelText(){return getTextFromElement(loginPanel);}


}
