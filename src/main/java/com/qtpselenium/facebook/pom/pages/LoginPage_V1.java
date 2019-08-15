package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.pages.session.LandingPage;

public class LoginPage_V1 
{
     WebDriver driver;
     
     public LoginPage_V1(WebDriver driver)
     {
    	 this.driver = driver;
     }
     
     
     
     public LandingPage doLogin(String uName,String uPass)
     {   
    	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uName);
    	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(uPass);
    	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Keys.ENTER);
    	 
    	 
    	 //login.click();
    	 //boolean loginSuccess = true;
    	 
    	 return PageFactory.initElements(driver, LandingPage.class);
     }
     
}
