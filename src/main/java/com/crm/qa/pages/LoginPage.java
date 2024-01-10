package com.crm.qa.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
//	//page Factory or Object repository
//	@FindBy(linkText = "My Account")
//	WebElement myAccountLnk;
	
	@FindBy(id="username")
	WebElement UsernameTxtBox;
	
	@FindBy(id = "password")
	WebElement passwordTxtBox;
	
	@FindBy(id = "Login")
	WebElement loginBtn;
	
	//Constructor or initializing the page objects
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	   	
	
	
	public HomePage login(String username, String password) {
		UsernameTxtBox.sendKeys(username);
		passwordTxtBox.sendKeys(password);
		loginBtn.click();
		return new HomePage();
		
	}

	

}
