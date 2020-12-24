package com.visionIT.internetBankingversion2.ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InternetBankingTest {
	WebDriver driver;
	@BeforeTest
    public void setup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//Topcasting/Upcasting - object of chromedriver class with webdriver interface
		driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the browser window
		driver.manage().deleteAllCookies();//delete all cookies
		//Invoking a browser with given url
		driver.get("http://demo.guru99.com/v4/");
		System.out.println("Page Title is : "+driver.getTitle());
		Thread.sleep(2000);
		
		String PageTitle = driver.getTitle();
		if(PageTitle.equals("Guru99 Bank Home Page")) {
			System.out.println("Page Title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
			
		}
	}
		@Test
		public void login() throws InterruptedException {
		WebElement UserID = driver.findElement(By.name("uid"));
		WebElement Password = driver.findElement(By.name("password"));
		
		
		//Entering text into UserID
		UserID.sendKeys("mngr301183");
		//Entering text into Password
		Password.sendKeys("unageta");
		
		
		// finding the webElement of google login button by name locator
		WebElement loginbutton = driver.findElement(By.name("btnLogin"));
		// clicking the login button
		loginbutton.click();
		// waiting the login button to appear after entering the click
		Thread.sleep(2000);
		//clicking on New_Customer
		
		WebElement Add_New_Customer = driver.findElement(By.linkText("New Customer"));
		Add_New_Customer.click();
		// waiting the click
		Thread.sleep(4000);
	    driver.quit();
		

	}

}
