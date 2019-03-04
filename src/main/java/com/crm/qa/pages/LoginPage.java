package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
		
	}
	
	
	@FindBy (name = "email")
	WebElement txt_username ;

	@FindBy (name = "password")
	WebElement txt_password ;
	
	@FindBy (xpath = "//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement login_btn ;
	
	
	public HomePage login (String u_name, String pwd ) throws IOException  {
		txt_username.sendKeys(u_name);
		txt_password.sendKeys(pwd);
		login_btn.click();
		return new HomePage();

	}
	
}
