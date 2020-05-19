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
//public class Steps {
//	
//	
//	
//	//Browser browser;
//
//	WebDriver driver;
//	//WebDriverWait wait = new WebDriverWait(driver, 15); 
//	
//	@Before
//	public void SetUp()  {
//		
//
//		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String Url = "https://twitter.com/login";
//		driver.get(Url);
//		driver.manage().deleteAllCookies();
//		//Thread.sleep(30000);
//		
//	}
//	
//	@After
//	public void finish()
//	{
//		//driver.quit();
//	}
////		
////	@Given("^Open the browser and start application$")
////		
////		public void open_the_browser_and_start_application() throws Exception {
////	  
////			browser = new Browser();
////			driver = browser.open();
////			
////			
////		}
////		
//	    
////login 
//	@Given("an username {string} and password {string}")
//	public void i_enter_valid_username_and_valid_password(String userName, String passWord){
//	
//		WebDriverWait wait = new WebDriverWait(driver, 15); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("session[username_or_email]")));
//	
//				
//	    driver.findElement(By.name("session[username_or_email]")).click();
//	    driver.findElement(By.name("session[username_or_email]")).clear();
//	    driver.findElement(By.name("session[username_or_email]")).sendKeys(userName);
//	    
//	    driver.findElement(By.name("session[password]")).click();
//	    driver.findElement(By.name("session[password]")).clear();
//	    driver.findElement(By.name("session[password]")).sendKeys(passWord);
//	    
//	}
//	
//	
//	@Then("^user should be able to login successfully$")
//	public void user_should_be_able_to_login_successfully() throws Exception {
//		driver.findElement(By.xpath("//*[@id='react-root']/div/div/div[2]/main/div/div/form/div/div[3]/div")).click();    
//	
//	}
//	
//	
//	
//	
//	//post
//	@Given("Open Tweet to post")
//	public void open_Tweet_to_post() {
//	   
//		WebDriverWait wait = new WebDriverWait(driver, 10);	  
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0\"])[1]")));
//		driver.findElement(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0\"])[1]")).click();
//	}
//
//	@When("I enter only text on my Tweet")
//	public void i_enter_only_text_on_my_Tweet() {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);	  
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notranslate public-DraftEditor-content']")));	  
//		driver.findElement(By.xpath("//div[@class='notranslate public-DraftEditor-content']")).sendKeys("I started playing volleyball when I was twelve years old. I fell in love with volleyball the second I got in the court, everything about it makes it amazing.");
//	
//	}
//
//	@Then("I should be able to Tweet my post")
//	public void i_should_be_able_to_Tweet_my_post() {
//		
//		  
//		driver.findElement(org.openqa.selenium.By.xpath("(//span[@class=\"css-901oao css-16my406 r-1qd0xha r-ad9z0x r-bcqeeo r-qvutc0\"])[3]")).click();
//	}
//	
//	
//	
//	
//	//characters limit
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
//	
//	//comment
//	@Given("Open the post you want to comment")
//	public void open_the_post_you_want_to_comment() {
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-1dbjc4n r-1habvwh r-18u37iz r-1wtj0ep\"])[1]")));
//		driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-1habvwh r-18u37iz r-1wtj0ep\"])[1]")).click();
//	
//	}
//	
//
//	@When("I select the comment icon")
//	public void i_select_the_comment_icon() {
//	   
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"css-901oao r-1awozwy r-1re7ezh r-6koalj r-1qd0xha r-a023e6 r-16dba41 r-1h0z5md r-ad9z0x r-bcqeeo r-o7ynqc r-clp7b1 r-3s2u2q r-qvutc0\"])[2]")));
//		driver.findElement(org.openqa.selenium.By.xpath("(//div[@class=\"css-901oao r-1awozwy r-1re7ezh r-6koalj r-1qd0xha r-a023e6 r-16dba41 r-1h0z5md r-ad9z0x r-bcqeeo r-o7ynqc r-clp7b1 r-3s2u2q r-qvutc0\"])[2]")).click();
//	}
//
//	@When("I tweet my reply on the post")
//	public void i_tweet_my_reply_on_the_post() {
//	    
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"])[1]")));
//		driver.findElement(org.openqa.selenium.By.xpath("(//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"])[1]")).sendKeys("Always motivated to play volleyball. I really miss my volleyball game");
//	}
//
//	@Then("I should be able to Tweet my comment")
//	public void i_should_be_able_to_Tweet_my_comment() {
//	   
//		WebDriverWait wait = new WebDriverWait(driver, 10); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1n0xq6e r-1vuscfd r-1dhvaqw r-1fneopy r-o7ynqc r-6416eg r-lrvibr\"]")));
//		driver.findElement(org.openqa.selenium.By.xpath("//div[@class=\"css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij r-1phboty r-rs99b7 r-1w2pmg r-1n0xq6e r-1vuscfd r-1dhvaqw r-1fneopy r-o7ynqc r-6416eg r-lrvibr\"]")).click();
//	}
//      
//
//}
