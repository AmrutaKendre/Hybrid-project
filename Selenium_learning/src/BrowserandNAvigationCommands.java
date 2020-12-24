import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserandNAvigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//Topcasting/Upcasting - object of chromedriver class with webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the browser window
		driver.manage().deleteAllCookies();//delete all cookies
		//Invoking a browser with given url
		driver.get("http://www.google.co.in");
		System.out.println("Page Title is : "+driver.getTitle());
		Thread.sleep(2000);
		
		String PageTitle = driver.getTitle();
		if(PageTitle.equals("Google")) {
			System.out.println("Page Title is correct");
		}
		else {
			System.out.println("Page Title is incorrect");
		}
		
	
		// Navigating the browser with different url
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Page Title is :"+driver.getTitle());
		Thread.sleep(2000);
		//Navigating to back page
		driver.navigate().back();
		System.out.println("Page Title is :"+driver.getTitle());
		//Navigating to forward 
		driver.navigate().forward();
		System.out.println("Page Title is :"+driver.getTitle());
		Thread.sleep(2000);
		//refreshing the current page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
