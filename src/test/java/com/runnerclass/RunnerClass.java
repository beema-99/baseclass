package com.runnerclass;

import org.openqa.selenium.WebDriver;
import com.baseclass.Baseclass;

public class RunnerClass extends Baseclass {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	browserlaunch("chrome");
	geturl("www.amazon.com");
	
	
}
}