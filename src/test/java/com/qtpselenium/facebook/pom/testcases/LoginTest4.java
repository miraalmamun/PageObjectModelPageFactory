package com.qtpselenium.facebook.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.pages.LaunchPage;
import com.qtpselenium.facebook.pom.pages.LoginPage;
import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest4 extends BaseTest {
	@Test
	public void doLogin() {
		/*
		 * I am writing the log inside the Test class what if I want to write log Page
		 * Class also. Logging in the Pages classes We have to pass 'test' Object to the
		 * Page classes. This is same concept share the driver with all classes. In this
		 * class I want to share 'test' inside LaunchPage also or inside LoginPage How
		 * to do that? For this reason we have to use PageFactory in a different way.
		 */
		test = extent.startTest("Login Test");
		test.log(LogStatus.INFO, "Starting login test");
		test.log(LogStatus.INFO, "Opening browser");
		//openBrowser("chrome");
		init("Chrome");
		// Here we need create to LaunchPage Object in a regular way
		LaunchPage launchPage = new LaunchPage(driver,test);
		PageFactory.initElements(driver, launchPage);
		LoginPage loginPage = launchPage.goToLoginPage();
		test.log(LogStatus.INFO, "Logging in");
		loginPage.doLogin(FBConstants.PROD_USERNAME, FBConstants.PROD_PASSWORD);
		test.log(LogStatus.PASS, "Login test passed");

	}

	@AfterMethod
	public void quit() {
		if (extent != null) {
			extent.endTest(test);
			extent.flush();
		}
		if (driver != null) {
			driver.quit();
		}
	}

}
