package com.qtpselenium.facebook.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.pages.LaunchPage;
import com.qtpselenium.facebook.pom.pages.LoginPage;
import com.qtpselenium.facebook.pom.pages.session.LandingPage;
import com.qtpselenium.facebook.pom.pages.session.ProfilePage;
import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.LogStatus;

public class ProfileTest extends BaseTest {
	@Test
	public void testPrifile() {
       test = extent.startTest("Profile Test");
       test.log(LogStatus.INFO, "Starting Profile Test");
		//openBrowser("Mozila");
       init("Chrome");
		LaunchPage launchPage = new LaunchPage(driver, test);
		PageFactory.initElements(driver, launchPage);
		LoginPage loginPage = launchPage.goToLoginPage();
		loginPage.verifyTitle("Facebook login");
		Object pages = loginPage.doLogin(FBConstants.PROD_USERNAME, FBConstants.PROD_PASSWORD);
		if (pages instanceof LoginPage)
			Assert.fail("Login failed");
		else if (pages instanceof LandingPage)
			System.out.println("Logged in successfully");
		LandingPage landingPage = (LandingPage) pages;
		landingPage.getMenu().search();
		landingPage.verifyTitle("xxxxxxxxxx");
		ProfilePage profilePage = landingPage.gotoProfilePage();
		profilePage.verifyProfile();
		profilePage.takeScreenShot();
         test.log(LogStatus.INFO, "Test Passed");
         
		//profilePage.getMenu().logout();

		

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
