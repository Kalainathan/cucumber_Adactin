package com.facebook.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.facebook.runner.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefnation_Class {
	
	static WebDriver driver=Runner_class.driver;
	
	@Given("launch Facebook Application Url")
	public void launch_facebook_application_url() {
	    driver.get("https://www.facebook.com/");
		
	}
	@When("enter Valid User Name")
	public void enter_valid_user_name() {
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8939596988");
	  
	}
	@When("enter Valid Password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Thiya$1804");
		
	}
	@Then("user Click Login Button And Navigate to Home Page")
	public void user_click_login_button_and_navigate_to_home_page() {
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	   
		
	}



}
