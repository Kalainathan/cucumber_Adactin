package com.AdactinStepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AdactinRunner.Adactin_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDefnition {
	
	 WebDriver driver=Adactin_Runner.driver;
	
	@Given("User Launch Application")
	public void user_launch_application() {
		driver.get("https://adactinhotelapp.com/");
		System.out.println(driver);
	   
	}
	@When("User Enters Username")
	public void user_enters_username() {
		driver.findElement(By.id("username")).sendKeys("kalainathan11");
	    
	}
	@When("User Enters Password")
	public void user_enters_password() {
		driver.findElement(By.id("password")).sendKeys("VMF1D9");
	    
	}
	@Then("Click On Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("login")).click();
	   
	}
	
	@When("User Select Location")
	public void user_select_location() {
		WebElement loc = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select s=new Select(loc);
		s.selectByValue("Adelaide");
		WebElement l = s.getFirstSelectedOption();
		System.out.println("Location is : "+l.getText());
	   
	}

	@When("User Select No Of Rooms")
	public void user_select_no_of_rooms() {
		WebElement room = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select s1=new Select(room);
		s1.selectByIndex(2);
		WebElement r = s1.getFirstSelectedOption();
		System.out.println("no of Rooms : "+r.getText());
		
	}

	@Then("Click On Search Button")
	public void click_on_search_button() {
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	}
	
	@When("User Select Hotel")
	public void user_select_hotel() {
	    WebElement hotel = driver.findElement(By.xpath("//input[@name=\"radiobutton_2\"]"));
	    hotel.click();
	}

	@Then("Click On Continue Button")
	public void click_on_continue_button() {
	    WebElement ho = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	    ho.click();
	}






}
