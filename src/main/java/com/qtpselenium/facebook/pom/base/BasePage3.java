package com.qtpselenium.facebook.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.pages.common.TopMenu;

public class BasePage3 {
	// All common function here for all pages
	// Even we do not need to declare 'WebDriver driver' in all pages
	// I will declare in here

	public WebDriver driver;// -->It will be available for all classes
    public TopMenu menu;
    
	public BasePage3(WebDriver driver) {

		this.driver = driver;
		setMenu(PageFactory.initElements(driver, TopMenu.class));
		
		
		//All the initialization will be done in the BasePage constructor
		//The initialization of the driver is been done at the centralize location
		//for every Page. It is in the BasePage-->The constructor of the BasePage
		//When I initialize the driver,I initialize the 'TopMenu'
		//Run this program -->The output will be same-->just changed the flow
		//This is the common location for all Page classes.
	}

	public BasePage3() {
	}

	public String verifyTitle(String expTitle) {
		return "";
	}

	public String verifyText(String locator, String expTitle) {
		return "";
	}

	public boolean isElementPresent(String locator) {
		return false;
	}

	public TopMenu getMenu() {
		return menu;
	}

	public void setMenu(TopMenu menu) {
		this.menu = menu;
	}
}
