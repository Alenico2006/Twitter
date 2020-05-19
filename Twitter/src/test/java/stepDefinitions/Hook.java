package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook
{

	private BaseUtil baseUtil;

    public Hook(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

    }
	
	//WebDriver driver;
	@Before
	public void SetUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		this.baseUtil.driver = new ChromeDriver();
		this.baseUtil.driver.manage().window().maximize();
		String Url = "https://twitter.com/login";
		this.baseUtil.driver.get(Url);
		//this.baseUtil.driver.deleteAllCookies();
		
		
	}



	@After
	public void finish()
	{
		this.baseUtil.driver.quit();
	}

	}

	
	



	

			
