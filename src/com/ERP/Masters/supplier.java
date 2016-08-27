package com.ERP.Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class supplier {

	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement supply;
	
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement add;
	
	@FindBy(id="x_Supplier_Name")
	WebElement suppliername;
	
	@FindBy(id="x_Address")
	WebElement address;
	
	@FindBy(id="x_City")
	WebElement city;
	
	@FindBy(id="x_Country")
	WebElement country;
	
	@FindBy(id="x_Contact_Person")
	WebElement contactperson;
	
	@FindBy(id="x_Phone_Number")
	WebElement phonenum;
	
	@FindBy(id="x__Email")
	WebElement email;
	
	@FindBy(id="x_Mobile_Number")
	WebElement mobilenum;
	
	@FindBy(id="x_Notes")
	WebElement notes;
	
	@FindBy(id="btnAction")
	WebElement addbutton;
	
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement ok;
	
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement successok;
	
	public void SupplyAdd(String SupplierName,String Address,String City,String Country,String ContactPerson,String PhoneNumber,String Email,String MobileNumber,String Notes)
	{
		
		supply.click();
		Sleeper.sleepTightInSeconds(4);
		add.click();
		Sleeper.sleepTightInSeconds(5);
		suppliername.sendKeys(SupplierName);
		address.sendKeys(Address);
		city.sendKeys(City);
		country.sendKeys(Country);
		contactperson.sendKeys(ContactPerson);
		phonenum.sendKeys(PhoneNumber);
		email.sendKeys(Email);
		mobilenum.sendKeys(MobileNumber);
		notes.sendKeys(Notes);
		
	}
	
}
