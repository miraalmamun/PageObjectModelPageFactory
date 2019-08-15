package com.qtpselenium.facebook.pom.pages.session.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qtpselenium.facebook.pom.base.BasePage;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GeneralSettingsPage extends BasePage {
	@FindBy(xpath = FBConstants.SECURITY_LOGIN_LINK)
	public WebElement securityLogin;
	@FindBy(xpath = FBConstants.PASSWORD_CHANGE_LINK)
	public WebElement changePasswordLink;
	@FindBy(xpath = FBConstants.OLD_PASSWORD)
	public WebElement oldPassword;
	@FindBy(xpath = FBConstants.NEW_PASSWORD)
	public WebElement newPassword;
	@FindBy(xpath = FBConstants.CONFIRM_CHANGE)
	public WebElement confirmPassword;
	@FindBy(xpath = FBConstants.SAVE_CHANGES)
	public WebElement saveChanges;
	@FindBy(xpath = FBConstants.REVIEW_DEVICES)
	public WebElement reviewOtherDevies;
	@FindBy(xpath = FBConstants.CONTINUE_PASSWORD_CHANGE_BUTTON)
	public WebElement continuePasswdChange;

	// div[contains(text(),'Security and Login')]-->Security and login link
	// span[contains(text(),'Change password')]---->Change Password link
	// input[@id='password_old']---Current or oldPassword
	// input[@id='password_new']
	// input[@id='password_confirm']
	// input[@id='u_w_1']
	//div[contains(text(),'Stay logged in')]

	public GeneralSettingsPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void gotoPasswordChange() {
		test.log(LogStatus.INFO, "Clicking on Security Login");
		securityLogin.click();
		if (!isElementPresent(FBConstants.PASSWORD_CHANGE_LINK)) {
			test.log(LogStatus.FAIL, "Element not found " + FBConstants.PASSWORD_CHANGE_LINK);
			reportFailure("Element not found " + FBConstants.PASSWORD_CHANGE_LINK);
		}

		changePasswordLink.click();
		test.log(LogStatus.INFO, "On password change page");
	}

	public String doPasswordChange(String oPassword, String nPassword) {
		test.log(LogStatus.INFO, "Entering Current Password and New Password "+oPassword+"/"+nPassword);
		oldPassword.sendKeys(oPassword);
		newPassword.sendKeys(nPassword);
		confirmPassword.sendKeys(nPassword);
		saveChanges.click();
		test.log(LogStatus.INFO, "Successfully click on Save Changes link");
		if (!isElementPresent(FBConstants.PASSWORD_CHANGE_LINK)) {
			return "Unsuccessful";
		}
		reviewOtherDevies.click();
		continuePasswdChange.click();
		test.log(LogStatus.INFO, "Changed Password Successfully");
		return "Success";
	}

}
