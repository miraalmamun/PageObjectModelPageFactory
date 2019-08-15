package com.qtpselenium.facebook.pom.testcases;

import org.testng.annotations.Test;

import com.qtpselenium.facebook.pom.testcases.base.BaseTest;
import com.qtpselenium.facebook.pom.util.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ChangedPasswordTest2 extends BaseTest  
{  
	/*
	 * This version of test run it and see the extent reports
	 * observed that same line of code writing all test cases
	 * In next version I will remove 'ExtentReports extent = ExtentManager.getInstance();'
	 * line of code and put it in BaseTest so it will be available for all test class.
	 * I will also 'ExtentTest test' this line of code put in BaseTest class but I will not
	 * initialize it
	 */
	
	@Test
   public void changedPasswordTest()
   {
	   ExtentReports extent = ExtentManager.getInstance();
  	   ExtentTest test = extent.startTest("Change Password Test");
  	   test.log(LogStatus.INFO, "Starting test");
  	   //code here
  	   test.log(LogStatus.FAIL, "Test failed");
  	   extent.endTest(test);
  	   extent.flush();
   }
}
