package com.webtek.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.webtek.pages.HomePage;
import com.webtek.pages.SignInPage;

public class SelTestCase {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		
		driver = new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
		
	}
	
		
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}

}
