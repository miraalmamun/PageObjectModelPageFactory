package com.qtpselenium.facebook.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.pages.common.TopMenu;

public class BasePage4 {

	// REMOVING HARD CODING FROM THE PROJECT FOR THIS REASON I AM GOING TO CREATE
	// ANOTHER CLASS CALLED 'FBCONSTANT'

	public WebDriver driver;
	public TopMenu menu;

	public BasePage4(WebDriver driver) {

		this.driver = driver;
		setMenu(PageFactory.initElements(driver, TopMenu.class));

	}

	public BasePage4() {
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
