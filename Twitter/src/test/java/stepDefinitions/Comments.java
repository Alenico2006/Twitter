package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;


public class Comments {
	
	WebDriver driver;
		
	//comment
	@Given("Open the post you want to comment")
	public void open_the_post_you_want_to_comment() throws Throwable {
        
		
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-1dbjc4n r-1habvwh r-18u37iz r-1wtj0ep\"])[1]")));
		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1habvwh r-18u37iz r-1wtj0ep\"])[1]")).click();
		
	
	}
	

	@When("I select the comment icon")
	public void i_select_the_comment_icon() {
	   
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-1re7ezh r-6koalj r-1qd0xha r-a023e6 r-16dba41 r-1h0z5md r-ad9z0x r-bcqeeo r-o7ynqc r-clp7b1 r-3s2u2q r-qvutc0\"])[2]")));
		driver.findElement(org.openqa.selenium.By.xpath("(//div[@class=\"css-901oao r-1awozwy r-1re7ezh r-6koalj r-1qd0xha r-a023e6 r-16dba41 r-1h0z5md r-ad9z0x r-bcqeeo r-o7ynqc r-clp7b1 r-3s2u2q r-qvutc0\"])[2]")).click();
	}

	@When("I tweet my reply on the post")
	public void i_tweet_my_reply_on_the_post() {
	    
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"])[1]")));
		driver.findElement(org.openqa.selenium.By.xpath("(//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"])[1]")).sendKeys("Always motivated to play volleyball. I really miss my volleyball game");
	}

	@Then("I should be able to Tweet my comment")
	public void i_should_be_able_to_Tweet_my_comment() {
	   
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1n0xq6e r-1vuscfd r-1dhvaqw r-1fneopy r-o7ynqc r-6416eg r-lrvibr\"]")));
		driver.findElement(org.openqa.selenium.By.xpath("//div[@class=\"css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1n0xq6e r-1vuscfd r-1dhvaqw r-1fneopy r-o7ynqc r-6416eg r-lrvibr\"]")).click();
	}
      

}
