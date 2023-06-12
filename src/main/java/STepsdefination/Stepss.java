package STepsdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Basee.Loginbasee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepss 
{
	WebDriver driver;
	Loginbasee ba;
	
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() 
	{
		System.setProperty("webdriver.chrome.driver","/Users/icoderz_06/Downloads/chromedriver_mac64/chromedriver"); 
		driver= new ChromeDriver(); 
		driver.get("https://practicetestautomation.com/practice-test-login/");
		ba = new Loginbasee(driver);


	}
	
	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() 
	{
	 System.out.println("Url has start to open");
	  
	}
	@Then("user enters {string} and {string}")
	public void user_enters_and(String uname, String password)
	{
	    ba.setUsername(uname);
	    ba.setPassword(password);
	    
	}
	@Then("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		ba.setLoginButton(null);
	    
	}
	@Then("user is on home page")
	public void user_is_on_home_page() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Logged In Successfully | Practice Test Automation", title);
		driver.close();
	}
	@Then("Close the browser")
	public void close_the_browser() 
	{
	
	}

}
