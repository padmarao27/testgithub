package com.ERP.Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PomExecute {
	@Test
	public void Exe()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		Loginpage lp=PageFactory.initElements(driver,Loginpage.class);
		lp.AdmLogin("admin","master");
		
		//HomepagePom hp=PageFactory.initElements(driver,HomepagePom.class);
		//hp.suppliers();
		//hp.plink();
		
		
	//supplier details
		supplier sp=PageFactory.initElements(driver,supplier.class);
		sp.SupplyAdd("RedMe", "new hyderabad", "hyderabad", "America", "obama", "9866959043", "obama@us.com", "040669966", "Data is added");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
