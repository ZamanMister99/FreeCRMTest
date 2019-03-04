package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

	LandingPage landingpage;
	SignUpPage signuppage;
	
	public SignUpPageTest() throws IOException {
		super();
		//This is CONSTRUCTOR for this Class.
	}
	
	
	@BeforeTest
	public void setUp () throws IOException {
		TestBase.launchBrowser();
		
		landingpage = new LandingPage ();// LangingPage Object is created here 
											//so we can navigate to LandingPage first, then Move to SignUpPage
		landingpage.clickSignUpButton();// Click on the SignUp button from Landing Page, then execute the func on SignUpPage.
		
		signuppage = new SignUpPage(); // This allows to call methods in this SignUpPage class.
										//Without this, the test in this class wont be executed.
		
	}
	

	@Test (priority =1)
	public void signUpPageHeader () {		
		String pageHeaderTitle = signuppage.verifyPageHeader();
		Assert.assertEquals(pageHeaderTitle, "Register");
	
	}
	
	
	@Test (priority =2)
	public void signUpPageTitle () {
		String signUpTitle = signuppage.verifyPageTitle();
		Assert.assertEquals(signUpTitle, "CRM Sign Up");
		
	}
	
	
	@Test (priority =3)
	public void signUpNewUser () throws InterruptedException {
		signuppage.register("asbcefgf12@gmail.com", "1234567895");
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void teardown () {
		driver.quit();
	}
	
}
