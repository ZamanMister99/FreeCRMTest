package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
		//TestBase class will be the PARENT CLASS for all other classes.
	
		public static WebDriver driver;   //Make this driver PUBLIC so the child class can access it.
		public static Properties prop;
		
	
		public TestBase () throws IOException {		
				
				 prop = new Properties (); //This class is already available in JAVA. Just need to import from Java.Util package. 
				
						//This is also in Java Package. Inside this we have to tell where exactly properties file available.
						//On FileInputStream, you tell which file to read.
				FileInputStream ip = new FileInputStream ("/Users/zaman/eclipse-workspace 01/FreeCRMTest/config.properties"); 
				
				prop.load(ip);	
		}
								
		
		public static void launchBrowser () throws IOException {	
			/*
			prop = new Properties (); //This class is already available in JAVA. Just need to import from Java.Util package. 
			
			//This is also in Java Package. Inside this we have to tell where exactly properties file available.
			//On FileInputStream, you tell which file to read.
			FileInputStream ip = new FileInputStream ("/Users/zaman/eclipse-workspace 01/FreeCRMTest/config.properties");
					
					//("/Users/zaman/eclipse-workspace 01/FreeCRMTest/src/main/java/config.properties");
					
					//("C:\\Users\\zaman\\eclipse-workspace 01\\Practices\\src\\config\\config.properties"); 
				//("/Users/zaman/eclipse-workspace 01/Practices/src/config/config.properties"); 
			prop.load(ip);	
			
			*/	
				String browserName = prop.getProperty("Browser");				
				if (browserName.equalsIgnoreCase("Chrome")) {
						//Launch Chrome
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\zaman\\eclipse-workspace 01\\Practices\\driver\\chromedriver.exe");
					driver = new ChromeDriver ();
									
				} else if (browserName.equalsIgnoreCase("firefox")) {
					
					//Launch Firefox
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\zaman\\eclipse-workspace 01\\Practices\\driver\\geckodriver.exe");
					driver = new FirefoxDriver () ; 
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.freecrm.com");   		//(prop.getProperty("test_url"));
			
		}
		
		
}
