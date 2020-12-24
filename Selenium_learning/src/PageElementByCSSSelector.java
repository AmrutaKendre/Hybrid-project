import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementByCSSSelector {

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
				driver.get("https://www.google.co.in/");
				// finding the webelement of google search button with class name attribute
				WebElement searchBox= driver.findElement(By.cssSelector("input.gLFyf"));
				//Entering text into textbox
				searchBox.sendKeys(" Automation Testing");
				//waiting for the google search button
				Thread.sleep(4000);
				// finding the webelement of google search button with  name attribute
				WebElement searchButton = driver.findElement(By.cssSelector("input[name=btnK]"));
				//clicking the google search button
				searchButton.click();
				//waiting for the next page to load
				Thread.sleep(5000);
				
				// close the browser
				driver.quit();
				

	}

}
