package com.qtpselenium.facebook.pom.util;

import java.util.Hashtable;

public class FBConstants {
	/*
	 * This is the centralize location for all paths,locators
	 */
	public static final boolean GRID_RUN = false;

	// paths
	public static final String CHROME_DRIVER_EXE = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
	public static final String GECKO_DRIVER_EXE = System.getProperty("user.dir") + "\\Driver\\geckodriver.exe";
	public static final String BROWSER_LOGFILE = System.getProperty("user.dir") + "\\DriverLog\\mozila.log";
	public static final String CHROME_DRIVER_LOG_PROPERTY = System.getProperty("user.dir") + "\\DriverLog\\chrome.log";
	// locators
	public static final String LOGIN_USERNAME = "//*[@id='email']";
	public static final String LOGIN_PASSWORD = "//*[@id='pass']";
	public static final String PROFILEPAGE_LINK = "//span[@class='_1qv9']";
	public static final String NAVIGATION_LABEL = "//*[@id=\"userNavigationLabel\"]";
	public static final String SETTINGS_LINK = "//span[text()='Settings']";
	public static final String SECURITY_LOGIN_LINK = "// div[contains(text(),'Security and Login')]";
	
	public static final String PASSWORD_CHANGE_LINK = "//span[contains(text(),'Change password')]";
	public static final String OLD_PASSWORD = "//*[@id='password_old']";
	public static final String NEW_PASSWORD = "//*[@id='password_new']";
	public static final String CONFIRM_CHANGE = "//*[@id='password_confirm']";
	public static final String SAVE_CHANGES = "//label[@class='submit uiButton uiButtonConfirm']";
	public static final String REVIEW_DEVICES = "//div[contains(text(),'Review other devices')]";
	public static final String CONTINUE_PASSWORD_CHANGE_BUTTON = "//button[text()='Continue']";
	

	// URLs-prod
	public static final String PROD_HOMEPAGE_URL = "https://www.facebook.com/";
	public static final String PROD_USERNAME = "9176356542";
	public static final String PROD_PASSWORD = "Mimo949658@Sarfina";

	// URLs-uat
	public static final String UAT_HOMEPAGE_URL = "https://www.uat.facebook.com/";
	public static final String UAT_USERNAME = "uat_its.9176356542";
	public static final String UAT_PASSWORD = "uat_Mimo949658@Sarfina";

	public static final String ENV = "PROD"; // PROD, UAT,SAT

	// paths
	public static final String REPORTS_PATH = System.getProperty("user.dir") + "\\ExtentReports\\";
	public static final String REPORTSCONFIG = System.getProperty("user.dir") + "\\ReportsConfig.xml";
	public static final String DATA_XLS_PATH = System.getProperty("user.dir") + "\\Excel\\Data.xlsx";
	public static final String TESTDATA_SHEET = "TestData";
	public static final Object RUNMODE_COL = "Runmode";
	public static final String TESTCASES_SHEET = "TestCases";

	public static final String LOG_OUT = "//span[text()='Log Out']";

	

	
	public static Hashtable<String, String> table;

	public static Hashtable<String, String> getEnvDetails() {
		if (table == null) {
			table = new Hashtable<String, String>();
			if (ENV.equals("PROD")) {
				table.put("url", PROD_HOMEPAGE_URL);
				table.put("username", PROD_USERNAME);
				table.put("password", PROD_PASSWORD);
			} else if (ENV.equals("UAT")) {
				table.put("url", UAT_HOMEPAGE_URL);
				table.put("username", UAT_USERNAME);
				table.put("password", UAT_PASSWORD);
			}

		}
		return table;

	}
	
	//div[contains(text(),'Security and Login')]-->Security and login link
	//span[contains(text(),'Change password')]---->Change Password link
	//input[@id='password_old']---Current or oldPassword
	//input[@id='password_new']
	//input[@id='password_confirm']
	//input[@id='u_w_1']-->Save change
}
