package com.qtpselenium.facebook.pom.pages.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_V1 
{   
	WebDriver driver;
    
    public LandingPage_V1(WebDriver driver)
    {
   	 this.driver = driver;
    }
    
    public ProfilePage goToProfilePage()
    {
    	driver.findElement(By.xpath("//span[@class='_1qv9']")).click();
    	return PageFactory.initElements(driver, ProfilePage.class);
    }
}
