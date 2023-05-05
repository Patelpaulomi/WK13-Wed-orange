package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropDown = By.xpath("//div[@class='oxd-select-text-input']");
    By userRole = By.xpath("//select[@id='systemUser_userType']");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("//label[normalize-space()='Username']");
    By statusDropDown = By.xpath("//div[contains(text(),'-- Select --')]");
    By password = By.xpath("//input[@fdprocessedid='bcvsx']");
    By confirmPassword = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    By successfullySavedText = By.cssSelector("div:nth-child(2) div.box.noHeader:nth-child(1) div.inner form:nth-child(1) > script:nth-child(3)");
    By admin = By.xpath("//div[@class='oxd-select-text-input']/div");
    //div[@class='oxd-select-wrapper']//following-sibling::div

    public String  addUserText(){return getTextFromElement(addUserText);}
    public void selectUserRoleByValue(String Value){
        clickOnElement(userRoleDropDown);
        selectByValueFromDropDown(userRoleDropDown,Value);
    }
    public void uRoleDropDown() {
        clickOnElement(userRoleDropDown);
        mouseHoverToElementAndClick(admin);
        selectByVisibleTextFromDropDown(admin, "Admin");
        selectByValueFromDropDown(admin,"0");

    }
    public void eName(String empName){
        sendTextToElement(employeeName,empName);
    }
    public void UserName(String Uname){
        sendTextToElement(userName,Uname);
    }
    public void StatusDropDown(String Statusdropdown){
        sendTextToElement(statusDropDown,Statusdropdown);
    }
    public void Password(String Password){
        sendTextToElement(password,Password);
    }
    public void confirmPassword(String ConfirmPassword){
        sendTextToElement(confirmPassword,ConfirmPassword);
    }
    public void saveButton(){
       clickOnElement(saveButton);
    }
    public void cancelButton(){
        clickOnElement(cancelButton);
    }
    public String verifyTextOfSuccessfullySaved(){
        return getTextFromElement(successfullySavedText);

    }
}
