package com.qtpselenium.facebook.pom.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class ChangedPasswordTest4 extends BaseTest {

	@Test
	public void changedPasswordTest() {
		test = extent.startTest("Change Password Test");
		test.log(LogStatus.INFO, "Starting test");
		// code here
		test.log(LogStatus.FAIL, "Test failed");

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
