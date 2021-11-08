package com.web.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		System.out.println("Title of the web page" + driver.getTitle());

		System.out.println("URL of the given app" + driver.getCurrentUrl());

		WebElement username = driver.findElement(By.id("email"));

		username.sendKeys("naveenjack.naveen@gmail.com");

		String email = username.getAttribute("value");

		String ph = username.getAttribute("placeholder");

		System.out.println("PH " +ph);

		System.out.println("Email" + email);

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("Oranium@123");
		
		String id = password.getAttribute("data -testid");
		
		System.out.println("ID" + id);

		String pass = password.getAttribute("value ");

		System.out.println("password" + pass);

		WebElement login = driver.findElement(By.name("login"));
		
		String type = login.getAttribute("type");

		System.out.println("TYPE" + type);
		
		login.click();

	}

}
