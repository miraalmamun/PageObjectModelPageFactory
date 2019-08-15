/*
package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.pages.session.LandingPage;
//Common Function for the pages
//--->For overcome 'Common Function for the pages' this we are
//making 'BasePage' pages and all other Page class will extends
//this 'BasePage'

public class LoginPage3 extends BasePage {

	public LoginPage3(WebDriver driver) {
		super(driver);
	}

	// In Page Object Model we have in build annotations called 'FindBy'
	// It makes our work easy. In Page Factory Framework we do not need to write
	// driver.findElement(By), Instead we used @FindBy

	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement email;
	@FindBy(xpath = "//*[@id=\"pass\"]")
	public WebElement passWord;

	// One action taking to multiple pages-multiple return types
	//
	public Object doLogin(String uName, String uPass) {
		email.sendKeys(uName);
		passWord.sendKeys(uPass);
		email.sendKeys(Keys.ENTER);

		boolean loginSuccess = true;

		if (loginSuccess)
			return PageFactory.initElements(driver, LandingPage.class);
		else
			return PageFactory.initElements(driver, LoginPage3.class);

	}

}
*/