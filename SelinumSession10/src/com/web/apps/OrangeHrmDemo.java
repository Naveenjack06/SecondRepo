package com.web.apps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe ");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
//		System.out.println("TITLE" + driver.getTitle());
//
//		System.out.println("URL" + driver.getCurrentUrl());

//		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
//
//		username.sendKeys("Admin");
//
//		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		password.sendKeys("admin123");
//
//		WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		login.sendKeys(Keys.ENTER);
//
//		driver.findElement(By.xpath("login")).click();

		WebElement linkedIn = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));

		linkedIn.click();
		WebElement Facebook = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));

		Facebook.click();

		WebElement Twitter = driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));

		Twitter.click();

		WebElement Youtube = driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));

		Youtube.click();

		String parentid = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		for (String s : allids)

		{

			if (!parentid.equals(s)) {
				driver.switchTo().window(s);
				List<String> list = new ArrayList<>(allids);
				for (int i = 0; i < allids.size(); i++) {

					String window = driver.switchTo().window(list.get(i)).getTitle();
					System.out.println(window);
					if (window.equals("Login to Facebook"))
						;
					{

						WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
						email.sendKeys("naveenjack.naveen");

					}
				}

			}

		}

	}

}
