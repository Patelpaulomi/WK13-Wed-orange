package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    AdminPage adminPage = new AdminPage();
    ViewSystemUserPage viewSystemUserPage = new ViewSystemUserPage();
    AddUserPage addUserPage = new AddUserPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void adminShouldAddUserSuccessFully() {
        //Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        homePage.adminButton();
        // Verify "System Users" Text
        viewSystemUserPage.systemUser();
        //click On "Add" button
        viewSystemUserPage.addButton();
        //Verify "Add User" Text
        addUserPage.addUserText();
        //Select User Role "Admin"
        addUserPage.selectUserRoleByValue("1");
        //enter Employee Name "Ananya Dash"
        addUserPage.eName("Peter Anderson");
        //enter Username
        addUserPage.UserName("Ananya1");
        //Select status "Disable"
        addUserPage.StatusDropDown("Disable");
        //enter psaaword
        addUserPage.Password("Ananya@123");
        //enter Confirm Password
        addUserPage.confirmPassword("Ananya@123");
        //click On "Save" Button
      addUserPage.saveButton();
        // verify message "Successfully Saved"
       String actualText = addUserPage.verifyTextOfSuccessfullySaved();
       String expectedText = "Successfully Saved";
       Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        //click On "Admin" Tab
        homePage.adminButton();
        // Verify "System Users" Text
        viewSystemUserPage.systemUser();
        //Enter Username
       viewSystemUserPage.userName("Ram");

        // Select User Role
        viewSystemUserPage.userRoleDropeDown("Admin");
        //Select Satatus
       viewSystemUserPage.statusDropDown("Disable");
        //Click on "Search" Button
        viewSystemUserPage.searchButton();
        //Verify the User should be in Result list.
        String expectedText = "Manoj";
       String actualText = viewSystemUserPage.verifyUserName("Manoj");
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        homePage.adminButton();
        // Verify "System Users" Text
        viewSystemUserPage.systemUser();
        // Enter Username
        viewSystemUserPage.userName("Alice.Duval");
        //Select User Role
        viewSystemUserPage.userRoleDropeDown("Admin");
        // Select Status
        viewSystemUserPage.statusDropDown("Disable");
        // Click on "Search" Button
        viewSystemUserPage.searchButton();
        // Verify the User should be in Result list.

        // Click on Check box
        //adminPage.checkBoxButton();
        // Click on Delete Button
       // viewSystemUserPage.deleteButton();
        // Popup will display

        // Click on Ok Button on Popup

        // verify message "Successfully Deleted"


    }

    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        // Login to Application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // click On "Admin" Tab
        homePage.adminButton();
        // Verify "System Users" Text
        viewSystemUserPage.systemUser();
        // Enter Username
        viewSystemUserPage.userName("Alice.Duval");
        // Select User Role
        viewSystemUserPage.userRoleDropeDown("Admin");
        //  Select Status
        viewSystemUserPage.statusDropDown("Disable");
        //  Click on "Search" Button
        viewSystemUserPage.searchButton();
        // verify message "No Records Found"
        String expectedText = "No Records Found";
        String actualText = viewSystemUserPage.verifyNoRecordFound("No Records Found");
        Assert.assertEquals(actualText,expectedText);

    }

}