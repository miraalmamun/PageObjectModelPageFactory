package com.qtpselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;

import com.qtpselenium.facebook.pom.base.BasePage;
//Common Function for the pages
//--->For overcome 'Common Function for the pages' this we are
//making 'BasePage' pages and all other Page class will extends
//this 'BasePage'


public class ProfilePage2 extends BasePage 
{   
	
	
    public ProfilePage2(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void verifyProfile()
    {
    	
    }
}
