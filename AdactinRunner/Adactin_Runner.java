package com.AdactinRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)// we can run this class using junit
@CucumberOptions(
		features="C:\\Users\\kalai\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\Adactinlogin.feature",
		glue="com.AdactinStepDefnition",
		publish=true,
		plugin= {"pretty","html:Reports/Cucumber_Reports"}
	
		)
public class Adactin_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println(driver);
		
	}
	@AfterClass
	public static void close() {
	//	driver.close();
		
	}

}
