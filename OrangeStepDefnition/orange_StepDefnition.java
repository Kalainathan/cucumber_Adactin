package com.OrangeStepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.runner.Runner_class;
import com.orangeHrm.Runner.OrangeRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orange_StepDefnition {
	
	static WebDriver driver=OrangeRunner.driver;

	@Given("launch Url")
	public void launch_url() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	Assert.assertTrue(driver.findElement(By.id("welcome"))).isDisplayed();

	   
	}

	@When("Enter UserName And Password")
	public void enter_user_name_and_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
	}

	@Then("user Navigate to Home Page")
	public void user_navigate_to_home_page() {
	    
	}

	
}
