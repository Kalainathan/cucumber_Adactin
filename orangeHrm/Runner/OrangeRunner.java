package com.orangeHrm.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\kalai\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\orangelogin.feature",
monochrome = true,
publish = true,
glue="com.OrangeStepDefnition",
plugin= {"pretty","html:Reports/cucumber_reports"})
	
public class OrangeRunner {
	public static WebDriver driver;
	
	
	@BeforeClass
		public static void BrowserLaunch() {
	System.out.println(driver);
		WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		}
	@AfterClass
	public static	void close() {
			driver.close();

		}



}


