package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	public static WebDriver driver;

	public static void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void launchURL(String url){
		driver.get(url);
	}
	public static void browserClose(){
		driver.quit();
	}
}
