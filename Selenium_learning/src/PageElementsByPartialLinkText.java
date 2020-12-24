import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementsByPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// set the system variable path
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		// create instance of chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		// get Application url
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
		// finding the web element having the link for text as "IDLocator in selenium"
		WebElement secondlink = driver.findElement(By.partialLinkText("Name locator"));
		//clicking on the link
		secondlink.click();
		// waiting for the next page to load
		Thread.sleep(5000);
		// close the window
		driver.quit();
		
		
		

	}

}
