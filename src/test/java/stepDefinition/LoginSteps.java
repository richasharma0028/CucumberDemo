package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	
	
	
	@Given("the user is on the nopComerce login Page")
	public void the_user_is_on_the_nop_comerce_login_page() {
	  driver=  new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@When("the user enters valid credentials\\(username: {string}, password:{string})")
	public void the_user_enters_valid_credentials_username_password(String email, String password) {
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    driver.findElement(By.className("login-button")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("the user should be redirected to the my account page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	    boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	    Assert.assertEquals(status,true);
	}

	@SuppressWarnings("deprecation")
	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
		boolean welcomeStatus = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).isDisplayed();
	    Assert.assertEquals(welcomeStatus,true);
	    driver.quit();
	}

}
