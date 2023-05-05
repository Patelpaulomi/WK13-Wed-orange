package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {
    By systemUser = By.xpath("//h5[normalize-space()='System Users']");
    By userNameField = By.xpath("(//label[normalize-space()='Username']))");
    By userRoleDropdown = By.xpath("//div[@class='oxd-select-wrapper']//following-sibling::div)");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropDown = By.xpath("//label[normalize-space()='Status']");
    By searchBtn = By.xpath("//button[normalize-space()='Search']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By deleteButton = By.xpath("//button[normalize-space()='Delete Selected']");
    By userList = By.xpath("//div[contains(text(),'Manoj')]");
    By checkbox = By.xpath("//div[@role='columnheader']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By noRecordFound = By.xpath("//span[normalize-space()='No Records Found']");

    public String systemUser(){
        return getTextFromElement(systemUser);
    }
    public void userName(String UserName){
        sendTextToElement(userNameField,UserName);
    }
    public void userRoleDropeDown(String UserRole){
        sendTextToElement(userRoleDropdown,UserRole);
    }
    public void employeeName(String EmployeeName){
        sendTextToElement(employeeNameField,EmployeeName);
    }
    public void statusDropDown(String StatusDropDown){
        sendTextToElement(statusDropDown,StatusDropDown);
    }
    public void searchButton(){
        clickOnElement(searchBtn);
    }
    public void resetButton(){
        clickOnElement(resetButton);
    }
    public void addButton(){
        clickOnElement(addButton);
    }
    public void deleteButton(){
        clickOnElement(deleteButton);
    }
    public String verifyUserName(String user){
        return getTextFromElement(userList);
    }

    public void clickOnCheckbox() {
        clickOnElement(checkbox);
    }
    public String verifyNoRecordFound(String text){
        return getTextFromElement(noRecordFound);
    }


}
