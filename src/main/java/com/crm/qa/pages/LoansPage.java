package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoansPage extends TestBase {
	
	
	
	
	public LoansPage() {
		PageFactory.initElements(driver, this);
	}


}
