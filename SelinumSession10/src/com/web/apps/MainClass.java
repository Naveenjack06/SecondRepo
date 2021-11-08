package com.web.apps;

public class MainClass {

	public static void main(String[] args) {

	OrangeHrmDemo orange = new OrangeHrmDemo();
	Orange.loginApp ("chrome", "https://opensource-demo.orangehrmlive.com/");
	Orange.sendData("xpath","//input[@id='txtUsername']","admin");
	Orange.sendDate("xpath","//input[@id='txtPassword']","admin123");
	Orange.clickbutton("xpath","//input[@id='btnLogin']");
			
		
		
		
		
		
		
		
	}

}
