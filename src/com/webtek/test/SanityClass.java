package com.webtek.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webtek.pages.HomePage;
import com.webtek.pages.SignInPage;

public class SanityClass extends SelTestCase {

	@Test
	public void signInPage(){
		//driver.findElement(By.cssSelector(".login")).click();
		HomePage Hp = PageFactory.initElements(driver, HomePage.class);
		
		Hp.clickOnSignInButton();
		SignInPage Sp = new SignInPage(driver);
		Sp.enterCredentials();
		
	}

	
}
