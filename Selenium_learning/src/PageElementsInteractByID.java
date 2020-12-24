import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementsInteractByID {

	public static void main(String[] args) throws InterruptedException {
		// set the system variable path
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		// Upcasting the object of chromedriver with Webdiver interface
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maximize the browser window
		driver.manage().deleteAllCookies(); // delete all cookies
		
		// set a maximum timeout for searching out the webelements before throwing an exception
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
       // Invoking the browser with given url
		driver.get("http://demo.automationtesting.in/Index.html");
		//finding the webelement of searchbox of username field
		WebElement userNameField = driver.findElement(By.id("email"));
		// Entering Text into username field
		userNameField.sendKeys("test@gmail.com");
		//clicking on proceed button
		WebElement proceedbutton = driver.findElement(By.id("enterimg"));
		proceedbutton.click();
		// fetching the next page Title
		String nextPageTitle = driver.getTitle();
		System.out.println(nextPageTitle);
		Thread.sleep(2000);
		//closing the browser
		driver.quit();
	}

}
