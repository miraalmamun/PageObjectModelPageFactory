package com.qtpselenium.facebook.pom.testcases.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.qtpselenium.facebook.pom.util.ExtentManager;
import com.qtpselenium.facebook.pom.util.FBConstants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest4 {

	// REMOVING HARD CODING FROM THE PROJECT FOR THIS REASON I AM GOING TO CREATE
	// ANOTHER CLASS CALLED 'FBCONSTANT'

	public WebDriver driver;
	public ExtentReports extent = ExtentManager.getInstance();
	public ExtentTest test;

	public void openBrowser(String bType) {
		// This method will open the given Browser
		// test.log(LogStatus.INFO, "Opening browser " + bType);
		if (!FBConstants.GRID_RUN) {

			if (bType.equalsIgnoreCase("Mozila")) {

				// System.setProperty("webdriver.gecko.driver",
				// pro.getProperty("geckodriver_exe"));
				System.setProperty("webdriver.gecko.driver", FBConstants.GECKO_DRIVER_EXE);

				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, FBConstants.BROWSER_LOGFILE);
				// Turn off notification
				FirefoxProfile foxProfile = new FirefoxProfile();
				foxProfile.setPreference("dom.webnotifications.enabled", false);

				driver = new FirefoxDriver();

			} else if (bType.equalsIgnoreCase("Chrome")) {
				// System.setProperty("webdriver.chrome.driver",
				// pro.getProperty("chromedriver_exe"));
				System.setProperty("webdriver.chrome.driver", FBConstants.CHROME_DRIVER_EXE);

				ChromeOptions ops = new ChromeOptions();
				ops.addArguments("--disable-notifications");
				ops.addArguments("disable-infobars");
				ops.addArguments("--start-maximized");
				System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,
						FBConstants.CHROME_DRIVER_LOG_PROPERTY);
				System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
				driver = new ChromeDriver(ops);
			} else if (bType.equalsIgnoreCase("IE")) {

			} else if (bType.equalsIgnoreCase("Edge")) {

			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			// test.log(LogStatus.INFO, bType + " browser opened successfully");
		} else {
			DesiredCapabilities cap = null;

			if (bType.equalsIgnoreCase("Mozilla")) {
				cap = DesiredCapabilities.firefox();
				cap.setPlatform(Platform.WINDOWS);
				String hubUrl = "http://172.29.4.52:8090/wd/hub";
				try {
					driver = new RemoteWebDriver(new URL(hubUrl), cap);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				} catch (MalformedURLException e) {

					e.printStackTrace();
				}
			} else if (bType.equalsIgnoreCase("chrome")) {

				// 1. Define desire capability
				// In Grid we have to use 'ChromeOptions' and we have to merge
				// with DesiredCapabilities and we have to pass 'options' to RemoteWebDriver
				// options.merge(cap);
				cap = new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("disable-infobars");
				options.addArguments("--start-maximized");
				options.merge(cap);
				String hubUrl = "http://172.29.4.52:8090/wd/hub";
				try {
					driver = new RemoteWebDriver(new URL(hubUrl), options);
					driver.get("http://www.freecrm.com");
					System.out.println(driver.getTitle());
				} catch (MalformedURLException e) {

					e.printStackTrace();
				}

			}

		}
	}

	public void browserInit() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
		// Console log properties hold in this file
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,
				System.getProperty("user.dir") + "\\DriverLog\\mozila.log");
		// Turn off notification
		FirefoxProfile foxProfile = new FirefoxProfile();
		foxProfile.setPreference("dom.webnotifications.enabled", false);

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

}
