package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class StepDefination 
{
	WebDriver driver;
	@Given ("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","G:\\Javaprogramming\\Selenium\\Selenium Setup\\geckodriver.exe");
		driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com");
	}

	@When("^Title of login page is facebook$")
	public void title_of_login_page_is_facebook()  
	{
		String Actual= driver.getTitle();
		System.out.println(Actual);
	 String Expected= "Facebook – log in or sign up";
	 Assert.assertEquals(Expected, Actual);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() 
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("paragborawake81@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("borawake81");
	  	   
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
		WebElement login=  driver.findElement(By.xpath("//input[@id='u_0_3']"));
		login.click();
		  System.out.println("Login button is enabled"+ login.isEnabled());
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() 
	{
		 String Actual= driver.getTitle();
		   System.out.println(Actual);
		    
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() 
	{
	    driver.quit();
	}


	
	
	

}
