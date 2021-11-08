package com.web.apps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApp {

	public static void main(String[] args) {

		double x = 10;

		int y = (int) x;
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.location='https://www.facebook.com'");
//		driver.get("https://www.flipkart.com");
		driver.navigate().to("https://www.redbus.com");

		driver.manage().window().maximize();
		driver.manage().window().minimize();

//		
//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		

		String currentTitle = driver.getTitle();

		System.out.println("Title of the  given URL" + currentTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url of the given app " + currentUrl);
	}

}
