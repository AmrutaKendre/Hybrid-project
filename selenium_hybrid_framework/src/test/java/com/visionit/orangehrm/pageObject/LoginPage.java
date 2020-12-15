package com.visionit.orangehrm.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// find a webelement using findby methods
	@FindBy(name = "txtUsername")
	WebElement username;

	@FindBy(name = "txtPassword")
	WebElement userpass;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;
	// create a web Element repository at page level

	// create a login constructor..constructor name and login name must be same.
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// By using page factory class we are going to initialise all webelements
		PageFactory.initElements(driver, this);
	}

	// This is the action method
	public HomePage loginOrangeHrm(String uname,String upass) {
		//username.sendKeys("Admin");
		//userpass.sendKeys("admin123");
		username.sendKeys(uname);
		userpass.sendKeys(upass);
		loginBtn.click();
	    return new HomePage(driver);

	}
}
