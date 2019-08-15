package com.qtpselenium.facebook.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.pages.LaunchPage;
import com.qtpselenium.facebook.pom.pages.LoginPage;
import com.qtpselenium.facebook.pom.pages.session.LandingPage;
import com.qtpselenium.facebook.pom.pages.session.ProfilePage;
import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.qtpselenium.facebook.pom.util.FBConstants;



public class ProfileTest4 extends BaseTest {
	@Test
	public void testPrifile() {
		//Lets create another two TestCases
		//(1)--> ChangedPasswordTest
		//(2)-->LoginTest
		//We will make TestCases independent of each other
		//Our motive should run this TestCases on Grid
		//Parallel run of dependent TestCases become tough
		//Parallel run of independent TestCases become so easy
		//Every TestCases would be required to open Browser.
		//To launch the Browser I will make a new Package named as
		//'package com.qtpselenium.facebook.pom.testcases.base'
		//All of my Test class will extends this class 
		
		
		//REMOVING HARD CODING FROM THE PROJECT FOR THIS REASON I AM GOING TO CREATE 
		//ANOTHER CLASS CALLED 'FBCONSTANTS' 

		//openBrowser("Mozila");
		init("Chrome");
		LaunchPage launchPage = new LaunchPage(driver, test);
		PageFactory.initElements(driver, launchPage);
		LoginPage loginPage = launchPage.goToLoginPage();
		loginPage.verifyTitle("Facebook login");
		Object pages = loginPage.doLogin(FBConstants.LOGIN_USERNAME, FBConstants.LOGIN_PASSWORD);
		if (pages instanceof LoginPage)
			Assert.fail("Login failed");
		else if (pages instanceof LandingPage)
			System.out.println("Logged in successfully");
		LandingPage landingPage = (LandingPage) pages;
		landingPage.getMenu().search();
		landingPage.verifyTitle("xxxxxxxxxx");
		ProfilePage profilePage = landingPage.gotoProfilePage();
		profilePage.verifyProfile();
		
		profilePage.getMenu().logout();
		
		
		driver.quit();

	}
}
