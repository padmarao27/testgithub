package com.ERP.Masters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.servlet.annotation.WebListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Stocklib {
	public static Properties pr;
	public static FileInputStream Fis;
	
	public static WebDriver driver;
	public static String Expval,Actval;
    
	
	
	public static String OpenApp(String URL) throws IOException
    {
		pr=new Properties();
		Fis=new FileInputStream("C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Properties\\Rep.properties");
		
		pr.load(Fis);
		
    	Expval="Login";	
    	driver=new FirefoxDriver();
    	driver.get(URL);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	String Actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
		if(Expval.equalsIgnoreCase(Actval))
		{
			//System.out.println("Application is launched");
			return "PASS";
		}
			else
			{
				//System.out.println("Application does not launched");
				return "FAIL";
		}
    }
    
    
    public String AdmLogin(String UN,String Pswd){
    	Expval="Administrator";
    	driver.findElement(By.id(pr.getProperty("reset"))).click();
		driver.findElement(By.id(pr.getProperty("uname"))).sendKeys(UN);
		driver.findElement(By.id(pr.getProperty("pswd"))).sendKeys(Pswd);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		 Actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
		if(Expval.equalsIgnoreCase(Actval))
		{
			//System.out.println("Stock accounting home page is displayed");
			return "PASS";
		}
			else
			{
				//System.out.println("Stock accounting home page is not displayed");
				return "FAIL";		}
		
    }
		public String SupplyAdd(String SupplierName,String Address,String City,String Country,String ContactPerson,String PhoneNumber,String Email,String MobileNumber,String Notes)
		{
			Expval="Add succeeded";
			driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/.")).click();
			Sleeper.sleepTightInSeconds(10);
			driver.findElement(By.id("x_Supplier_Name")).sendKeys(SupplierName);
			driver.findElement(By.id("x_Address")).sendKeys(Address);
			driver.findElement(By.id("x_City")).sendKeys(City);
			driver.findElement(By.id("x_Country")).sendKeys(Country);
			driver.findElement(By.id("x_Contact_Person")).sendKeys(ContactPerson);
			driver.findElement(By.id("x_Phone_Number")).sendKeys(PhoneNumber);
			driver.findElement(By.id("x__Email")).sendKeys(Email);
			driver.findElement(By.id("x_Mobile_Number")).sendKeys(MobileNumber);
			driver.findElement(By.id("x_Notes")).sendKeys(Notes);
			driver.findElement(By.id("btnAction")).click();
			
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(5);
			Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			System.out.println(Actval);
			if(Expval.equalsIgnoreCase(Actval))
			{
				//System.out.println("Stock accounting home page is displayed");
				return "Supplier details added";
			}
				else
				
				
				{
					//System.out.println("Stock accounting home page is not displayed");
					return "Supplier details does not add";		
					
				}
		}
		public String stockCat(String categoryName)
		{
			Expval="Add succeeded";
			Actions ac=new Actions(driver);
			Sleeper.sleepTightInSeconds(5);
			ac.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
			Sleeper.sleepTightInSeconds(1);
		   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		   driver.findElement(By.id("x_Category_Name")).sendKeys(categoryName);
		   driver.findElement(By.id("btnAction")).click();
		   Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   Sleeper.sleepTightInSeconds(2);
		   Actval=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		   Sleeper.sleepTightInSeconds(3);
		   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		   System.out.println(Actval);
		   if(Expval.equalsIgnoreCase(Actval))
			{
				//System.out.println("Stock accounting home page is displayed");
				return "Stock category is added";
			}
				else
				
				
				{
					//System.out.println("Stock accounting home page is not displayed");
					return "Stock category does not added";		
					
				}
		}
		
		
		public String UomMea(String UOMid,String UOMdes)
		{
			Expval="Add succeeded";
			Actions ac=new Actions(driver);
			Sleeper.sleepTightInSeconds(5);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			
		driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("x_UOM_ID")).sendKeys(UOMid);
		driver.findElement(By.id("x_UOM_Description")).sendKeys(UOMdes);
		driver.findElement(By.id("btnAction")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(3);
		Actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		System.out.println(Actval);
		 if(Expval.equalsIgnoreCase(Actval))
			{
				//System.out.println("Stock accounting home page is displayed");
				return "Data successed";
			}
				else
				
				
				{
					//System.out.println("Stock accounting home page is not displayed");
					return "Data unsuccessed";		
					
				}
		}
		
		public String Purchases(String Supplierid,String Notes,String TotalAmount,String TotalPayment)
		{
			Expval="Add succeeded";
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='mi_a_purchases']/a")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.id("x_Supplier_ID")).sendKeys(Supplierid);
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.id("x_Notes")).sendKeys(Notes);
			driver.findElement(By.id("x_Total_Amount")).sendKeys(TotalAmount);
			driver.findElement(By.id("x_Total_Payment")).sendKeys(TotalPayment);
			//driver.findElement(By.id("x_Total_Balance")).sendKeys(TotalBalance);
			driver.findElement(By.id("btnAction")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(4);
			Actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			System.out.println(Actval);
			 if(Expval.equalsIgnoreCase(Actval))
				{
					//System.out.println("Stock accounting home page is displayed");
					return "Data passed";
				}
					else
					
					
					{
						//System.out.println("Stock accounting home page is not displayed");
						return "Data failed";		
						
					}
			}
		
		
		//Customer details 
		public String Customer(String CustomerName,String Address,String City,String Country,String ContactPerson,String PhoneNumber,String Email,String MobileNumber,String Notes)
		{
			Expval="Add succeeded";
			driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			Sleeper.sleepTightInSeconds(4);
			driver.findElement(By.id("x_Customer_Name")).sendKeys(CustomerName);
			driver.findElement(By.id("x_Address")).sendKeys(Address);
			driver.findElement(By.id("x_City")).sendKeys(City);
			driver.findElement(By.id("x_Country")).sendKeys(Country);
			driver.findElement(By.id("x_Contact_Person")).sendKeys(ContactPerson);
			driver.findElement(By.id("x_Phone_Number")).sendKeys(PhoneNumber);
			driver.findElement(By.id("x__Email")).sendKeys(Email);
			driver.findElement(By.id("x_Mobile_Number")).sendKeys(MobileNumber);
			driver.findElement(By.id("x_Notes")).sendKeys(Notes);
			driver.findElement(By.id("btnAction")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			Sleeper.sleepTightInSeconds(5);
			Actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
			Sleeper.sleepTightInSeconds(5);
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			System.out.println(Actval);
			if(Expval.equalsIgnoreCase(Actval))
			{
				//System.out.println("Stock accounting home page is displayed");
				return "Customer details added";
			}
				else
				
				
				{
					//System.out.println("Stock accounting home page is not displayed");
					return "Customer details does not added";		
					
				}
			
		}
		
		
		//Log out 
		public static String Logout()
		{
			Expval="Login";	
			driver.findElement(By.id("logout")).click();
			Sleeper.sleepTightInSeconds(2);
			//WebElement d=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
			//System.out.println(d.getText());
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"), "OK!"));
			
			WebElement d=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
			System.out.println("after waiy");
			
			List<WebElement> els=driver.findElements(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]"));
			for (int i = 0; i<=els.size(); i++) 
			{
				System.out.println(els.get(i).getText());
				if (els.get(i).getText().equalsIgnoreCase("OK!"))
				{
					
					els.get(i).click();
					break;
					
				}
			}
			
			System.out.println(" afetr click");
			Sleeper.sleepTightInSeconds(2);
			String Actval=driver.findElement(By.xpath(".//*[@id='btnsubmit']")).getText();
			Sleeper.sleepTightInSeconds(3);
			
			if(Expval.equalsIgnoreCase(Actval))
			{
				//System.out.println("Stock accounting home page is displayed");
				return "Logout is Successed";
			}
			else
				{
					//System.out.println("Stock accounting home page is not displayed");
					return "Logout is UnSuccessed";		
					
				}
		}
		
		public static void Appclose()
		{
			driver.close();
		}
	
	}
		
		
		   

		


    

