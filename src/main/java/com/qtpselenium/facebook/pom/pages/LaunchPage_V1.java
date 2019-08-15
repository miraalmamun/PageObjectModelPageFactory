package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage_V1 
{ 
	WebDriver driver;
	
	public LaunchPage_V1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage goToLoginPage()
	{   
		driver.get("https://www.facebook.com/");
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
