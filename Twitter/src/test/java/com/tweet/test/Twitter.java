package com.tweet.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Twitter {
	
	private WebDriver driver;
	By username = By.name("session[username_or_email]");
	
	
			
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String Url = "https://twitter.com/login";
		driver.get(Url);
	}

	@After
	public void tearDown() throws Exception {
		
		//driver.close();
	}

	@Test
	public void login() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 15); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("session[username_or_email]")));
	    driver.findElement(By.name("session[username_or_email]")).click();
	    driver.findElement(By.name("session[username_or_email]")).clear();
	    driver.findElement(By.name("session[username_or_email]")).sendKeys("andrea200606@gmail.com");
	    
	    driver.findElement(By.name("session[password]")).click();
	    driver.findElement(By.name("session[password]")).clear();
	    driver.findElement(By.name("session[password]")).sendKeys("Volley123*");
	    
	    driver.findElement(By.xpath("//*[@id='react-root']/div/div/div[2]/main/div/div/form/div/div[3]/div")).click();
	    
	   
	    
	    //tweet
	    
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[3]/a/div")));
//	    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div/div[3]/a/div")).click();
//	
//
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")));	  
//		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")).sendKeys("I really love and enjoy playing volleyball. I like to watch the professional games from Turkia, Brasil and USA.");
//	
	    
	 
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='tweet-text']/span[2]")));
		//driver.findElement(By.xpath("//div[@id='tweet-text']/span")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-901oao r-hkyrab r-1qd0xha r-a023e6 r-16dba41 r-ad9z0x r-bcqeeo r-bnwqim r-qvutc0\"])[1]")));
		driver.findElement(By.xpath("(//div[@class=\"css-901oao r-hkyrab r-1qd0xha r-a023e6 r-16dba41 r-ad9z0x r-bcqeeo r-bnwqim r-qvutc0\"])[1]")).click();
	
	
	

	   
		driver.findElement(org.openqa.selenium.By.xpath("(//div[@class=\"css-901oao r-1awozwy r-1re7ezh r-6koalj r-1qd0xha r-a023e6 r-16dba41 r-1h0z5md r-ad9z0x r-bcqeeo r-o7ynqc r-clp7b1 r-3s2u2q r-qvutc0\"])[2]")).click();
	
	    
		driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")).sendKeys("great player Kelsey Robinson!!");

	   
		//driver.findElement(org.openqa.selenium.By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/span/span")).click();
	
		driver.findElement(org.openqa.selenium.By.xpath("(//span[@class='css-901oao css-16my406 r-1qd0xha r-ad9z0x r-bcqeeo r-qvutc0'])[16]")).click();
	    
			
	}
	

}
