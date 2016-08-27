package com.ERP.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class BasicScript {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String Expval="Login";
		driver.get("http://webapp.qedgetech.com");
		String Actval=driver.findElement(By.id("btnsubmit")).getText();
		if(Expval.equalsIgnoreCase(Actval))
		{
			System.out.println("Application is launched");
		}
			else
			{
				System.out.println("Application does not launched");
		}
		
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		Sleeper.sleepTightInSeconds(2);
		
		
		driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("arjun");
		driver.findElement(By.id("x_Address")).sendKeys("Dharmavaram");
		driver.findElement(By.id("x_City")).sendKeys("Annavaram");
		driver.findElement(By.id("x_Country")).sendKeys("INDIA");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("pardhu");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("7396079798");
		driver.findElement(By.id("x__Email")).sendKeys("ronaldo73738@yahoo.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("99999999");
		driver.findElement(By.id("x_Notes")).sendKeys("This is new text");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		
		/*
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		//driver.findElement(By.name("glyphicon glyphicon-home ewIcon")).click();
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();*/
		
		
	}

}
