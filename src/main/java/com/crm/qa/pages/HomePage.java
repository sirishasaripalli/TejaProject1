package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[text()='Product Packages']")
	WebElement productPackages;
	
	@FindBy(xpath = "//span[text()='Loans']")
	WebElement LoansBtn;
	

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomePageTitle() {
		return driver.getTitle();
	}

	public ProductPackagePage ProductPackages() {
				//productPackages.click();
	     // WebElement element = driver.findElement(By.xpath("//span[text()='Product Packages']"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", productPackages);
		return new ProductPackagePage();
	}
	
	public LoansPage LoansPage() {
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", LoansBtn);
        return new LoansPage();
}
	

}
