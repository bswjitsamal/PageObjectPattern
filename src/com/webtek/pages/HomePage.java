package com.webtek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	private WebDriver driver;
	
	@FindBy(how = How.CSS, using = ".login")
	public WebElement SignInLink;

	// creating constructor

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickOnSignInButton(){
		//driver.findElement(By.cssSelector(".login")).click();
		SignInLink.click();
	}

}
