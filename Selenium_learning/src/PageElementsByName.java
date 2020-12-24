import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElementsByName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Topcasting/Upcasting - object of chromedriver class with webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the browser window
		driver.manage().deleteAllCookies();//delete all cookies
		//Invoking a browser with given url
		driver.get("http://www.google.co.in");
		//finding the webelement of searchbox by name locator
		WebElement searchbox = driver.findElement(By.name("q"));
		//Entering text into search box
		searchbox.sendKeys("Selenium");
		// waiting the google search button to appear after entering the search keyword
		Thread.sleep(4000);
		// finding the webElement of google search button by name locator
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		// clicking the google search button
		searchbutton.click();
		//waiting for the next page to load
		Thread.sleep(5000);
		//fetching the pagetitle and printing it
		System.out.println("The page Title is: "+driver.getTitle());
		//closing the browser
		driver.quit();
		
		

	}

}
