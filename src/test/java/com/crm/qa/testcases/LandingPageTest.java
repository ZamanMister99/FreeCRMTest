package com.crm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.IOException;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LandingPage;
import com.crm.qa.pages.SignUpPage;


public class LandingPageTest extends TestBase{
	
	
	LandingPage landingpage; //Create Object of LandingPage class 
	SignUpPage signuppage ;  // At the end of this class, it will return to Next SignUpPage class.
	
	public LandingPageTest() throws IOException {
		super(); 
		//Constructor is being used cuz we are using all the function of config properties file.
		// SUper() keyowrd will also bring in the Config properties as well.
	}

	
	@BeforeTest
	public void setUp() throws IOException {
		TestBase.launchBrowser();
		landingpage = new LandingPage (); // You have to create Object of LandingPage class.
											//This will allow to call methods in LandingPage class
	}
	
	
	@Test (priority = 1)
	public void landingPageTitleTest () throws InterruptedException {				
		String title = landingpage.validateLandingPageTitle() ; //This will be titlle, hence capture it in variable for assertion. 
		Assert.assertEquals(title, "Free CRM software in the cloud for sales and service");
		Thread.sleep(3000);
		System.out.println(title);
	}
	
	
	@Test (priority = 2)
	public void crmLogoImageTest () {
		boolean logocheck = landingpage.validateCRMImage() ;
		Assert.assertTrue(logocheck);
	}
	
	
	/*@Test (priority = 2)
	public void loginTest () throws IOException, InterruptedException {
		Thread.sleep(5000);
		landingpage.clickLoginButton();
		Thread.sleep(5000);
	}*/
	
	@Test (priority = 3)
	public void signUpTest () throws InterruptedException, IOException {
		Thread.sleep(2000);
		signuppage = landingpage.clickSignUpButton();
		Thread.sleep(2000);
	}
	
		
	
	@AfterTest 
	public void tearDown () {
		driver.quit();
	}
	

}
