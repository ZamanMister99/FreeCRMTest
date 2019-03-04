package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LandingPage extends TestBase {

		
		//In this Class, you have to define all the ELEMENTS that are present in Login Page.
		//Using PageFactory - @FindBy	
	
				
			
				@FindBy (xpath = "/html/body/div[1]/header/div/nav/div[2]/div/a")
				WebElement btn_login ;
				
				@FindBy (xpath = "/html/body/div[1]/main/section[1]/a")
				WebElement btn_signUp ;
			
				@FindBy (xpath = "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/div/a")
				WebElement crmLogo ;
			
		
		// Next is to INITIALIZE all the above ELEMENTS by creating CONSTRUCTOR of this current CLASS (LoginPage).
		// Initializing the Page Object with PageFactory.initElements 		
		public LandingPage() throws IOException {
			
			PageFactory.initElements(driver, this);
			
		}	
				
		// Now define all the functionalities that are available in LoginPage.
		
				public String validateLandingPageTitle () {
					
					return driver.getTitle();   //Since this is a string type, you replace 'void' with 'String'.		
				}
				
	
				public boolean validateCRMImage () {
					
					return crmLogo.isDisplayed(); // This will simply return True or False. Hence change return type to 'boolean'.
				}
				
				
				public void clickLoginButton () {
					btn_login.click();
									
				}
			
				public SignUpPage  clickSignUpButton () throws IOException {
				 	btn_signUp.click();
				 	return new SignUpPage () ;
					
				}

			
			

			

				
	
}
