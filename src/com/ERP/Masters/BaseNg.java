package com.ERP.Masters;

import java.io.IOException;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.ERP.Masters.Stocklib;

     

public class BaseNg {
	public static Stocklib SL=new Stocklib();
	
  @BeforeTest
  public void beforeTest() {
	  SL.AdmLogin("admin","master");
  }

  @AfterTest
  public void afterTest()
  {
	  SL.Logout();
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  SL.OpenApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() {
	  SL.Appclose();
  }

}
