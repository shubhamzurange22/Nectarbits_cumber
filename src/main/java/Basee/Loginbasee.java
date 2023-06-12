package Basee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginbasee 
{
	WebDriver ldriver;
	 public Loginbasee(WebDriver rdriver) 
{
	 ldriver = rdriver;
	 PageFactory.initElements(rdriver, this);
}
	   
		
		@FindBy(xpath = "//input[@name='username']")
		@CacheLookup
		WebElement User;

		@FindBy(xpath =  "//input[@name='password']")
		@CacheLookup
		WebElement Pass;
		
		@FindBy(xpath =  "//button[@id='submit']")
		@CacheLookup
		WebElement Btn;
		
		

		public void setUsername(String uname)
		{
			User.clear();
			User.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			Pass.clear();
			Pass.sendKeys(pwd);
		}
		public void setLoginButton(String But)
		{
			Btn.click();
			
		}
		
		

}
