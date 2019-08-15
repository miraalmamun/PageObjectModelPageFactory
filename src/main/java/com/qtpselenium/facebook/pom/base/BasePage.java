package com.qtpselenium.facebook.pom.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qtpselenium.facebook.pom.pages.common.TopMenu;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage {

	public WebDriver driver;
	public TopMenu menu;
	public ExtentTest test;
  /*
	public BasePage(WebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;
		setMenu(PageFactory.initElements(driver, TopMenu.class));

	}
	*/
	public BasePage(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		menu = new TopMenu(driver, test);
		PageFactory.initElements(driver, menu);
	}

	public BasePage() {
	}

	public String verifyTitle(String expTitle) {
		test.log(LogStatus.INFO, "Varifying the title " + expTitle);
		return "";
	}

	public String verifyText(String locator, String expTitle) {
		return "";
	}

	public TopMenu getMenu() {
		return menu;
	}

	public void setMenu(TopMenu menu) {
		this.menu = menu;
	}

	public void takesScreenShot() {
		test.log(LogStatus.INFO,
				"Adding picture-->" + test.addScreenCapture("C:\\Users\\Mir\\Pictures\\Camera Roll\\IMG_2878.JPG"));

	}

	public void takeScreenShot() {

		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		String imgPath = ".\\screenshots\\" + screenshotFile;

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {

			File path = new File(imgPath);

			FileUtils.copyFile(scrFile, path);

		} catch (IOException e) {

			e.printStackTrace();
		}

		test.log(LogStatus.INFO, "Screenshot-> "
				+ test.addScreenCapture(System.getProperty("user.dir") + "\\screenshots\\" + screenshotFile));

	}
	
	public void takeScreenShot2(){
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		String filePath=FBConstants.REPORTS_PATH+"screenshots//"+screenshotFile;
		// store screenshot in that file
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO,test.addScreenCapture(filePath));
	}

	public boolean isElementPresent(String locator) {
		test.log(LogStatus.INFO, "Trying to find element -> " + locator);
		int s = driver.findElements(By.xpath(locator)).size();
		if (s == 0) {
			test.log(LogStatus.INFO, "Element not found");
			return false;
		} else {
			test.log(LogStatus.INFO, "Element found");
			return true;
		}

	}
	
	public void reportFailure(String failureMessage){
		test.log(LogStatus.FAIL, failureMessage);
		takeScreenShot();
		Assert.fail(failureMessage);
	}

}






