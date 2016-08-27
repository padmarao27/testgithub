package com.ERP.Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webapplogin {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();

		 driver.get("http://webapp.qedgetech.com/login.php");
		 
	}

}
