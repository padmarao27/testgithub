package com.ERP.Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepagePom 
{
@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
WebElement suppliers;

@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
WebElement purchases;

public void suppliers()
{
	suppliers.click();
	
}

public void plink() {
	purchases.click();
	
}
}
