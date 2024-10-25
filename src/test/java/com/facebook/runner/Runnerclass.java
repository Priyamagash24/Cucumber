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
	@CucumberOptions(features="C:\\Users\\PC Corner\\Desktop\\Cucumber\\src\\test\\java\\com\\facebook\\feature\\Facebook.feature",
	glue= "com.facebook.stepdefinition",
	publish=true,
	plugin = {"pretty","html:Reports/cucumber_reports"})

	public class Runnerclass {
		
	public static WebDriver driver;
		
	@BeforeClass
		public static void  BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		@AfterClass
		
		public static void close() {
			driver.close();	
		}
		}

