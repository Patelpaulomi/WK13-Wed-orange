package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyUserShouldLoginSuccessFully(){
        //Enter username
        loginPage.enterUserName("Admin");
       // Enter password
        loginPage.enterPassword("admin123");
       // Click on Login Button
        loginPage.clickOnLoginButton();
       // Verify "Dashboard" Message
        dashboardPage.dashboardText();
    }
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage(){
        //Launch the application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        // Verify Logo is Displayed
      dashboardPage.dashboardText();

    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully(){
        //Login To The application
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
       // Click on User Profile logo
       dashboardPage.clickOnUserProfileLogo();
       //Mouse hover on "Logout" and click
        dashboardPage.mouseHoverToElementAndClick();
        //Verify the text "Login Panel" is displayed
        loginPage.loginPanelText();
    }

}
