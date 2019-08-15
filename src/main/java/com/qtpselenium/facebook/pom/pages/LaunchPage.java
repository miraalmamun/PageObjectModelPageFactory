package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaunchPage extends BasePage {
	/*
	 * Now I will remove 'ExtentTest test' line from all Page classes and I will put
	 * it in BasePage class then all Page classes can share this. Now BasePage class
	 * has a constructor which take two parameter to initialize the driver and
	 * ExtentTest.
	 */

	public LaunchPage(WebDriver driver, ExtentTest test) {

		super(driver, test);

	}

	public LoginPage goToLoginPage() {
		// log
		test.log(LogStatus.INFO, "Opening the url - " + FBConstants.getEnvDetails().get("url"));
		driver.get(FBConstants.getEnvDetails().get("url"));
		test.log(LogStatus.PASS, "URL Opened - " + FBConstants.getEnvDetails().get("url"));
		LoginPage loginPage = new LoginPage(driver, test);
		PageFactory.initElements(driver, loginPage);
		return loginPage;
	}

	/*
	 * public LoginPage goToLoginPage() 
	 * {
		test.log(LogStatus.INFO, "Opening the URL " + FBConstants.PROD_HOMEPAGE_URL);
		driver.get(FBConstants.PROD_HOMEPAGE_URL);
		test.log(LogStatus.PASS, "URL Opened " + FBConstants.PROD_HOMEPAGE_URL);
		LoginPage loginPage = new LoginPage(driver, test);
		PageFactory.initElements(driver, loginPage);
		return loginPage;

	    }
	 */

}
