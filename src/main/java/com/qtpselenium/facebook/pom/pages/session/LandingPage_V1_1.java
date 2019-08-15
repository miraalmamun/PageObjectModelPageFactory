package com.qtpselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_V1_1 
{   
	WebDriver driver;
    
    public LandingPage_V1_1(WebDriver driver)
    {
   	 this.driver = driver;
    }
    
    @FindBy(xpath = "//span[@class='_1qv9']")
    public WebElement profileLink;
    
    public ProfilePage goToProfilePage()
    {
    	profileLink.click();
    	return PageFactory.initElements(driver, ProfilePage.class);
    }
}
