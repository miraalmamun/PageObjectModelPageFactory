/*
package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.pages.session.LandingPage;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginPage4 extends BasePage {
    ExtentTest test;
	public LoginPage4(WebDriver driver,ExtentTest test) {
		super(driver);
		this.test = test;
	}

	@FindBy(xpath = FBConstants.LOGIN_USERNAME)
	public WebElement email;
	@FindBy(xpath = FBConstants.LOGIN_PASSWORD)
	public WebElement passWord;

	public Object doLogin(String uName, String uPass) {
		email.sendKeys(uName);
		passWord.sendKeys(uPass);
		email.sendKeys(Keys.ENTER);

		boolean loginSuccess = true;

		if (loginSuccess)
		{  
			LandingPage landingPage = new LandingPage(driver,test);
			PageFactory.initElements(driver, landingPage);
			return landingPage;
		}
		else
			return PageFactory.initElements(driver, LoginPage4.class);

	}

}
*/