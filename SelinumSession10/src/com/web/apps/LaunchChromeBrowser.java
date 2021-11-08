package com.web.apps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
//
//		WebDriver driver = new FirefoxDriver();

	}

}