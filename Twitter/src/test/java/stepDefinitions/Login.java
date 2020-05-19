package stepDefinitions;

//import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseUtil;
//import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import net.serenitybdd.core.annotations.findby.By;


//
//
public class Login  {

	private BaseUtil baseUtil;

    public Login(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;

    }
	 
//login 
	@Given("an username {string} and password {string}")
	public void i_enter_valid_username_and_valid_password(String userName, String passWord) throws Exception {
	
		
		//WebDriver driver = hook.getDriver(); 
		WebDriverWait wait = new WebDriverWait(this.baseUtil.driver, 15); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("session[username_or_email]")));
	
				
	    this.baseUtil.driver.findElement(By.name("session[username_or_email]")).click();
	    this.baseUtil.driver.findElement(By.name("session[username_or_email]")).clear();
		this.baseUtil.driver.findElement(By.name("session[username_or_email]")).sendKeys(userName);
	    
	    this.baseUtil.driver.findElement(By.name("session[password]")).click();
	    this.baseUtil.driver.findElement(By.name("session[password]")).clear();
	    this.baseUtil.driver.findElement(By.name("session[password]")).sendKeys(passWord);
	    
	}
	
	
	@Then("^user should be able to login successfully$")
	
	public void user_should_be_able_to_login_successfully() throws Exception {
		//WebDriver driver = hook.getDriver();
		this.baseUtil.driver.findElement(By.xpath("//*[@id='react-root']/div/div/div[2]/main/div/div/form/div/div[3]/div")).click();    
	
	}
}
	


