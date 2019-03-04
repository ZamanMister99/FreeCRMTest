package com.crm.qa.rough;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class RoughPractice extends TestBase {

	public RoughPractice() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public static void testruns () throws IOException, InterruptedException {
		//launchBrowser();
		
		//xpath for Sign-Up button
		//driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/a")).click();
		//driver.navigate().back();
		//Thread.sleep(2000);
		//Click Login Button
	//	driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/a")).click();
		
		/*Thread.sleep(5000);
		landingpage.clickLoginButton();
		Thread.sleep(5000);*/
		
	//	driver.findElement(By.xpath ("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/div/a")).isDisplayed();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zaman\\eclipse-workspace 01\\Practices\\driver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://ui.cogmento.com");
		
		String uname = "//input[@type = \"text\"]";
		//String name_xpath = "//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input";
		String pwd_xpath = "//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input" ;
		
		driver.findElement(By.xpath(uname)).sendKeys("zamzamdev321@gmail.com");
		driver.findElement(By.xpath(pwd_xpath)).sendKeys("TestingCRM1!");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text() = \"Forgot your password?\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}

}
