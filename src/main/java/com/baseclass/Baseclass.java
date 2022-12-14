package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static String type;

	public static WebDriver browserlaunch(String type) {
	
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return driver;
        
	}

	
	
 //2 geturl

	public static  void geturl(String url) {
		driver.get(url);

	}
//		
//	
//
//		// 4 getcurrenturl
//		public static void getCurrentUrl(String url) {
//
//			driver.get(url);
//
//		}
//		
//		//5 click method
//		public static  void clickelement(WebElement element) {
//
//			element.click();
//			
//		}
//		
		
		
		
			
		}
		
		
		
		
	
	
	
	
	


