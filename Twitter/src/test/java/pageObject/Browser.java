package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser {
	//private Object WebDriverManager;

	/**
	 * Open the browser 
	 */
	
	WebDriver driver;
	public WebDriver open() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://twitter.com/login";
		driver.get(Url);
		return driver;
		
	}
	
	
}