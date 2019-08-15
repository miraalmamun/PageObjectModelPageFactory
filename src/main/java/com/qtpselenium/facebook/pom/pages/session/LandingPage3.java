/*
package com.qtpselenium.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
//Common Function for the pages
//--->For overcome 'Common Function for the pages' this we are
//making 'BasePage' pages and all other Page class will extends
//this 'BasePage'

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;

public class LandingPage3 extends BasePage {

	public LandingPage3(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class='_1qv9']")
	public WebElement profileLink;

	public ProfilePage goToProfilePage() {
		profileLink.click();
		return PageFactory.initElements(driver, ProfilePage.class);
	}
}
*/