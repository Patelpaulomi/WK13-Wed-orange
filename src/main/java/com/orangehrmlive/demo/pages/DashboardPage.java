package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dasBoard = By.xpath("//h6[normalize-space()='Dashboard']");
    By userProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']");
    By logoutButton = By.xpath("//a[normalize-space()='Logout']");


    public String dashboardText(){
        return getTextFromElement(dasBoard);
    }
    public void clickOnUserProfileLogo(){clickOnElement(userProfileLogo);}
    public void mouseHoverToElementAndClick(){clickOnElement(logoutButton);}

}
