package com.qtpselenium.facebook.pom.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pom.pages.session.LandingPage;

public class LoginPage_V1_1 {
	WebDriver driver;

	public LoginPage_V1_1(WebDriver driver) {
		this.driver = driver;
	}

	// In Page Object Model we have in build annotations called 'FindBy'
	//It makes our work easy. In Page Factory Framework we do not need to write 
	//driver.findElement(By), Instead we used @FindBy
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement email;
	@FindBy(xpath = "//*[@id=\"pass\"]")
	public WebElement passWord;

	public LandingPage doLogin(String uName, String uPass) {
		email.sendKeys(uName);
		passWord.sendKeys(uPass);
		email.sendKeys(Keys.ENTER);

		// boolean loginSuccess = true;

		return PageFactory.initElements(driver, LandingPage.class);
	}

}
