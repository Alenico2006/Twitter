//package stepDefinitions;
//
//import static org.junit.Assert.assertTrue;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import net.serenitybdd.core.annotations.findby.By;
//
//
//
//
//public class Char_Lim {
	
	
	
	//Browser browser;

	//WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, 15); 
	
	
//	@Given("^Open the browser and start application$")
//		
//		public void open_the_browser_and_start_application() throws Exception {
//	  
//			browser = new Browser();
//			driver = browser.open();
//			
//			
//		}
//		
	    
	//characters limit
//	@When("I enter text on my Tweet with characters limit")
//	public void i_enter_text_on_my_Tweet_with_characters_limit() {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);	
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notranslate public-DraftEditor-content']")));	  
//		driver.findElement(By.xpath("//div[@class='notranslate public-DraftEditor-content']")).sendKeys("I started playing volleyball when I was twelve years old. I fell in love with volleyball the second I got in the court, everything about it makes it amazing. I think the best gift the sport has given me are the friendships and good times that will last forever. Every game is a new experience, and every team has different skills to learn. There are several reasons why volleyball is my favorite sport. Basically, one cannot go wrong with playing volleyball. Win or lose, it is always fun. If you have played it before you will understand. If you have not played it before, what are you waiting for? Go out there and try this amazing game. Experience the endorphins from smacking a volleyball around with your friends.");
//		
//		WebElement count = driver.findElement(By.xpath("//div[contains(@class,\"css-901oao r-daml9f r-n6v787 r-19jlu03 r-285fr0 r-q4m81j\")]"));
//		
//		System.out.println("THIS IS THE NUMBER----->" + count.getText());
//	
//		assertTrue(Integer.parseInt(count.getText()) <= 0);
//		
//		System.out.println("EXCEEDS CHARACTER LIMIT");
//		
//		WebElement button = driver.findElement(By.xpath("//div[@data-testid='tweetButton']"));
//		
//		System.out.println("BUTTON IS SELECTED----->" + button.isSelected());
//		
//		assertTrue(button.isSelected()==false);
//	}
//
//
//	@Then("I should not be able to Tweet my post")
//	public void i_should_not_be_able_to_Tweet_my_post() {
//	    driver.findElement(org.openqa.selenium.By.xpath("(//span[@class=\"css-901oao css-16my406 r-1qd0xha r-ad9z0x r-bcqeeo r-qvutc0\"])[3]")).click();
//	}
//	
//	
//	
//}