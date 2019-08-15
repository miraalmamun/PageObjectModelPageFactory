package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
//Common Function for the pages
//--->For overcome 'Common Function for the pages' this we are
//making 'BasePage' pages and all other Page class will extends
//this 'BasePage'
//Encapsulate common features of pages
//Build the Basetest class and common features
//Removing hard coding 
//Use Constant file
//Implementing report ExtentReports
//Suppose if I have to logout, logout feature in facebook such a feature
//which is available in every Page class--->Under the 'TopMenu'.
//TopMenu is the common for all the pages. Every Page class has the 'TopMenu'
//The relation between Page class and 'TopMenu'--> 'Has relation'
//TopMenu is encapsulated inside every Page -class. Lets make a new Package
//'package com.qtpselenium.facebook.pom.pages.common' and in it class
//'TopMenu'. Every Page class has a constructor which is called by driver Object
//This constructor will initialize the driver variable. Lets create a constructor inside
//the BasePage class which also initialize the driver variable.
//Another very Important Note: Lets declare a constructor which is 
//zero-arg and empty implementation. If you declare zero-arg and empty implementation
//constructor in the parent class then you do not need to call super(parent) class constructor
//inside child class otherwise Mandatory you have to call super/parent class constructor to the 
//child class. It is better programming practice to declare zero-arg constructor inside
//the parent class


public class LaunchPage2 extends BasePage 
{ 
	
	
	
	public LaunchPage2(WebDriver driver)
	{ 
		//Called BaseClass constructor is here
		this.driver = driver;
	}
	
	public LoginPage goToLoginPage()
	{   
		driver.get("https://www.facebook.com/");
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
