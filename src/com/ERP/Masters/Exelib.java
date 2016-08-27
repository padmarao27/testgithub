package com.ERP.Masters;

import java.io.IOException;

public class Exelib {
	public static void main(String[] args) throws IOException {
		Stocklib SL=new Stocklib();
     String Res;
     SL.OpenApp("http://webapp.qedgetech.com");
 
     	SL.AdmLogin("admin","master");
     
    /* Res=SL.SupplyAdd("Lenovo","Hyd","Hyd","INDIA","padmarao3","73960373960","ronaldo@yahoo.com","8121353534","New issue");
     System.out.println(Res);*/
  //  Res= SL.UomMea("someid132", "des123");
     //	System.out.println(Res);
     	//Res=SL.stockCat("Glass");
     
  // Res=SL.Purchases("Lenovo", "testing", "10000", "6000");
    // System.out.println(Res);
     
     SL.Logout();
     SL.Appclose();
	}
}
