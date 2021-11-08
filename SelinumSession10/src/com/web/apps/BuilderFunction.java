package com.web.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuilderFunction {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe ");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("TITLE" + driver.getTitle());

		System.out.println("URL" + driver.getCurrentUrl());

		WebElement ele1 = driver.findElement(By.id("email"));
		
		ele1.sendKeys("naveenjack.naveen@gmail");
		ele1.sendKeys("Hello");

		WebElement ele2= driver.findElement(By.name("pass"));
         ele2.sendKeys("jackie123");
         ele2.clear();
         ele2.sendKeys("Hii");
         
         ele2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
         
         WebElement ele3 = driver.findElement(By.name("login"));
         ele3.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("login")).click();

		WebElement text = driver.findElement(By.className("_9ay7"));

		String innerText = text.getAttribute("innerText");

		System.out.println(innerText);

		String innerText1 = text.getText();

		System.err.println(innerText1);
		System.out.println(driver.findElement(By.className("_9axz")).getAttribute("innerText"));
		System.out.println(driver.findElement(By.className("_9axz")).getText());

	}

}
