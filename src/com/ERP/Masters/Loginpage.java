package com.ERP.Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(id="username")
	WebElement Uname;
	
	@FindBy(id="password")
	WebElement paswd;
	
	@FindBy(id="btnsubmit")
	WebElement login;
	
	//@FindBy(id="btnreset")
	//WebElement reset;
	
	public void AdmLogin(String UN,String Pswd)
	{
		//reset.click();
		Uname.click();
		paswd.click();
		login.click();
	}

}
