package com.ERP.Masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ERP.Masters.BaseNg;

public class Uomng extends BaseNg{
 // @Test
 // public void Uom() 
 // {
	//  SL.UomMea("id454t","Newt5t5");
 // }
  @Test(priority=1,dataProvider="Udata")
  
//UOm data
  public void UomMea(String UOMid,String UOMdes)
  {	  
	  SL.UomMea(UOMid, UOMdes);  
  }
  @DataProvider
 public Object[][] Udata()
  {
   Object[][] obj=new Object[3][2];
   
  		obj[0][0]="uomid11";
  		obj[0][1]="first description1";
   
  		obj[1][0]="uomid22";
  		obj[1][1]="second description2";
  		
  		obj[2][0]="uomid33";
  		obj[2][1]="third description3";
  		return obj;
  }
  
  
  
  
  //stock category data
  @Test(priority=0,dataProvider="Stockdata")
  public void stockCat(String categoryName)
  {
	  SL.stockCat(categoryName);
  }
  	@DataProvider
  public Object[][] Stockdata()
  {
	  Object[][] obj=new Object[1][1];
	  
	  	obj[0][0]="cat22";
	  	
  		 return obj;
}
  	
  	//Supplier data
  	@Test(dataProvider="")
  			public void SupplyAdd(String SupplierName,String Address,String City,String Country,String ContactPerson,String PhoneNumber,String Email,String MobileNumber,String Notes)
  	{
  		SL.SupplyAdd(SupplierName, Address, City, Country, ContactPerson, PhoneNumber, Email, MobileNumber, Notes);
  	}
  //	@DataProvidre
  //	public Object
}

