package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	private WebDriver driver;
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void enterCredentials(){
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("passwd")).sendKeys("");
		driver.findElement(By.id("SubmitLogin")).click();
	}

}
