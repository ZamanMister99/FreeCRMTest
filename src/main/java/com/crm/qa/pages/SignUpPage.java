package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase{



		@FindBy (xpath = "//input [@name =\"email\"]")
		WebElement emailAddress;
		
		@FindBy (xpath = "//input [@name =\"phone\"]")
		WebElement phoneNumber ;
	
		
		@FindBy (xpath = "//input [@type=\"checkbox\"]")
		WebElement termsCheckbox;
		
		//Create CONSTRUCTOR to initialize all the element on this class.
		public SignUpPage () throws IOException{
			PageFactory.initElements(driver, this);
			
		}
		
		public String verifyPageHeader () {
			WebElement headerxpath = driver.findElement(By.xpath("//h2 [@class = \"ui blue header\"]"));
			return	headerxpath.getText();
			 
		}
		
		public String verifyPageTitle () {
			return driver.getTitle();
		}
		
		public void register (String email, String phNumber) {
			emailAddress.sendKeys(email);
			phoneNumber.sendKeys(phNumber);
			termsCheckbox.click();
		}
		
		
}
