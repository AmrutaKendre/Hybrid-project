package com.visionit.orangehrm.testBase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.visionit.orangehrm.utilities.ConfigDataProvider;
import com.visionit.orangehrm.utilities.XLXSDataProvider;

public class TestBase {

	public static WebDriver driver = null;
	public  ConfigDataProvider configData;
	//create instance at class level
	public XLXSDataProvider xlsxData;
	
	@BeforeSuite
	public void setupSuite() {
		 configData = new ConfigDataProvider();
		 xlsxData = new XLXSDataProvider();
	}
	@Parameters("Browser")
	@BeforeMethod
	public void setUp(@Optional("Chrome")String browserName) {
		
		if(browserName.equals("Chrome")) {
			
			// if we want to execute test cases on different browser
			// set up the System variable path
			// set the System variable path
			// if you dont want to use system variable path you can download driver manager
			// dependencies
			// it will automatically check browser version.
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			// create the driver instance of chromedriver.
			driver = new ChromeDriver();
			// navigate to the application
		} else if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			
			

		// set the System variable path
		// if you dont want to use system variable path you can download driver manager
		// dependencies
		// it will automatically check browser version.
		//driver.get(url);
		driver.get(configData.getAppUrl());

		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

	@AfterMethod
	public void tearDown() {
		// quit the browser
		driver.quit();
	}

}
