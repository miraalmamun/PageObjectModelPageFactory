package com.qtpselenium.facebook.pom.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.pages.LaunchPage;
import com.qtpselenium.facebook.pom.pages.LoginPage;
import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.qtpselenium.facebook.pom.util.ExtentManager;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest2 extends BaseTest 
{
     @Test
     public void doLogin()
     {
    	ExtentReports extent = ExtentManager.getInstance();
    	 ExtentTest test = extent.startTest("Login Test");
    	 test.log(LogStatus.INFO, "Starting login test");
    	 test.log(LogStatus.INFO, "Opening browser");
    	 //openBrowser("chrome");
    	 init("Chrome");
    	 LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
    	 LoginPage loginPage = launchPage.goToLoginPage();
    	 test.log(LogStatus.INFO, "Logging in");
    	 loginPage.doLogin(FBConstants.PROD_USERNAME, FBConstants.PROD_PASSWORD);
    	 test.log(LogStatus.PASS, "Login test passed");
    	 extent.endTest(test);
    	 extent.flush();
     }
}
