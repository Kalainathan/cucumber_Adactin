package com.facebook.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\kalai\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\facebook\\feature\\facebook.feature",
monochrome = true,
glue="com.facebook.stepdefinition",

publish = true,//console log should be clear

plugin= {"pretty","html:Reports/Cucumber_Reports"})



public class Runner_class {


	public static WebDriver driver;
	
	
@BeforeClass
	public static void BrowserLaunch() {
System.out.println(driver);
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//	driver.get("https://www.facebook.com/");
	}
@AfterClass
public static	void close() {
		driver.close();

	}
}
