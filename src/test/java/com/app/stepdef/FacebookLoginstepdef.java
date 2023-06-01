package com.app.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class FacebookLoginstepdef {
	
		WebDriver driver;
		
	
		@Given("^user needs to be on facebook login page$")
		public void user_needs_to_be_on_facebook_login_page()
		{
		
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
		
		}
		@When("^User enters user first name$")
		public void User_enters_user_first_name()
		{
			
			driver.findElement(By.xpath("(//div[@class='_6lux']//input)[1]")).sendKeys("David");
		}
		@Then("^User checks user first name is available$")
		public void User_checks_user_first_name_is_available()
		{
			
			String actulName=driver.findElement(By.xpath("(//div[@class='_6lux']//input)[1]")).getAttribute("value");
			Assert.assertEquals("David", actulName);
			
		}
		@When("^user clicks the create new user button$")
		public void user_clicks_the_create_new_user_button()
		{
			driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		}
		@And("^user enter user surname$")
		public void user_enter_user_surname()
		{	
			//WebElement iframelement=driver.findElement(By.xpath("//*[@title='reCAPTCHA']"));
			driver.switchTo().frame("captcha-recaptcha");
			driver.findElement(By.xpath("(//div[@id='fullname_field']//input)[2]")).sendKeys("Rayan");
		}
		@But("^the user mobile field should be blank$")
		public void the_user_mobile_field_should_be_blank()
		{
			String mobActual=driver.findElement(By.xpath("(//div[@class='mbm _a4y']//input)[1]")).getAttribute("value");
			Assert.assertEquals("", mobActual);
		}
		@Then("^close the browser$")
		public void close_the_browser()
		{
			
			driver.quit();
		}
}
