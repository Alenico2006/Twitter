package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;


public class Post_Text {
	

	private BaseUtil baseUtil;

    public Post_Text(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

    }
	//post
	@Given("Open Tweet to post")
	public void open_Tweet_to_post() {
	   
		//WebDriver driver = hook.getDriver(); 
		WebDriverWait wait = new WebDriverWait(this.baseUtil.driver, 10);	  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0\"])[1]")));
		this.baseUtil.driver.findElement(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0\"])[1]")).click();
	}

	@When("I enter only text on my Tweet")
	public void i_enter_only_text_on_my_Tweet() {
		//WebDriver driver = hook.getDriver(); 
		WebDriverWait wait = new WebDriverWait(this.baseUtil.driver, 10);	  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notranslate public-DraftEditor-content']")));	  
		this.baseUtil.driver.findElement(By.xpath("//div[@class='notranslate public-DraftEditor-content']")).sendKeys("I started playing volleyball when I was twelve years old. I fell in love with volleyball the second I got in the court, everything about it makes it amazing.");
	
	}

	@Then("I should be able to Tweet my post")
	public void i_should_be_able_to_Tweet_my_post() {
		
		//WebDriver driver = hook.getDriver();  
		this.baseUtil.driver.findElement(org.openqa.selenium.By.xpath("(//span[@class=\"css-901oao css-16my406 r-1qd0xha r-ad9z0x r-bcqeeo r-qvutc0\"])[3]")).click();
	}
	
}