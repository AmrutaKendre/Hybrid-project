import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementsInteractByClassname {

	public static void main(String[] args) throws InterruptedException {
		// set the system variable path
		System.setProperty("webdriver.chrome.driver ","./Drivers/chromedriver.exe ");
		
		// Craete the instance of chromedriver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Topcasting/Upcasting - object of chromedriver class with webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the browser window
		driver.manage().deleteAllCookies();//delete all cookies
		//Invoking a browser with given url
		
		driver.get("http://zero.webappsecurity.com/");
		System.out.println("The page Title before clicking on sign in button is: "+driver.getTitle());
		// finding the webelement for sign in button
		WebElement SignInButton = driver.findElement(By.className("signin"));
		SignInButton.click();
		// waiting for page to load
		Thread.sleep(4000);
		
		// fetching the title of the updated page
		System.out.println("The page Title before clicking on sign in button is: "+driver.getTitle());
         //closing the browser
		driver.quit();
	}

}
