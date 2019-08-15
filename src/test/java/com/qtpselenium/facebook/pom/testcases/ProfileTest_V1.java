package com.qtpselenium.facebook.pom.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.pages.LaunchPage;
import com.qtpselenium.facebook.pom.pages.LoginPage;

public class ProfileTest_V1 {
	@Test
	public void testPrifile() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
		// Console log properties hold in this file
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
				System.getProperty("user.dir") + "\\DriverLog\\mozila.log");
		// Turn off notification
		FirefoxProfile foxProfile = new FirefoxProfile();
		foxProfile.setPreference("dom.webnotifications.enabled", false);

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage loginPage = launchPage.goToLoginPage();
		loginPage.doLogin("9176356542", "Mimo949658@Sarfina");
		

	}
}
