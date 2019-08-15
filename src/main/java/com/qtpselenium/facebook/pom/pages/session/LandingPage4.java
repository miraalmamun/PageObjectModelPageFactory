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
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;

public class LandingPage4 extends BasePage {
	// REMOVING HARD CODING FROM THE PROJECT FOR THIS REASON I AM GOING TO CREATE
	// ANOTHER CLASS CALLED 'FBCONSTANT'

	ExtentTest test;
	
	public LandingPage4(WebDriver driver, ExtentTest test) {
		super(driver);
		this.test = test;
	}

	@FindBy(xpath = FBConstants.PROFILEPAGE_LINK)
	public WebElement profileLink;

	public ProfilePage goToProfilePage() {
		profileLink.click();
		ProfilePage profilePage = new ProfilePage(driver,test);
		PageFactory.initElements(driver, profilePage);
		return profilePage;
	}
}
*/