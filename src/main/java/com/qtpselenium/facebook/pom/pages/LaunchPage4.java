/*
package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaunchPage4 extends BasePage {

	// REMOVING HARD CODING FROM THE PROJECT FOR THIS REASON I AM GOING TO CREATE
	// ANOTHER CLASS CALLED 'FBCONSTANTS' and implementing ExtentReports
	//ALSO Logging in the reports
	
	ExtentTest test;

	public LaunchPage4(WebDriver driver, ExtentTest test) {

		super(driver);
		this.test = test;
	}

	public LoginPage goToLoginPage() {
		test.log(LogStatus.INFO, "Opening the URL "+ FBConstants.PROD_HOMEPAGE_URL);
		driver.get(FBConstants.PROD_HOMEPAGE_URL);
		test.log(LogStatus.PASS, "URL Opened "+ FBConstants.PROD_HOMEPAGE_URL);
		LoginPage loginPage = new LoginPage(driver, test);
		PageFactory.initElements(driver, loginPage);
		return loginPage;

	}

}
*/