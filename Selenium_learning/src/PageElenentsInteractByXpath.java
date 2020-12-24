import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageElenentsInteractByXpath {

	public static void main(String[] args) {
		// set the system variable path
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		// create instance of chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// get the application url
		
		driver.get("http://demo.automationtesting.in/Register.html");
	
		
	}

}
