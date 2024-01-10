package com.crm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class ProductPackagePage extends TestBase{
	
	@FindBy(xpath = "//a/div[@title='New']")
	WebElement NewBtn;
	@FindBy(xpath = "//input[@id='input-191']")
	WebElement ProductPackageName;
	@FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
	WebElement SaveBtn;
	@FindBy(xpath="//a[@data-recordid='a2PHp000004HAgoMAG']")
	WebElement RecordClick;
	@FindBy(xpath="//button[@name='Action:Edit']")
	WebElement EditBtn;
	
	@FindBy(xpath="//iframe[@title='Loan Compliance']")
	WebElement iFrame;
	
	@FindBy(xpath="//label[text()='Relationship']/../../..//input")
	WebElement RelationshipBtn;
	
	//@FindBy(xpath="//td[text()='Coastal Wave Company, Inc.']")
	@FindBy(xpath="//label[text()='Relationship']/../../..//input/following::table[1]//tr[.//td][2]")
	WebElement CoastalSelection;
	@FindBy(xpath="//button[@name='Action:Save']")
	WebElement PPSaveBtn;
	
	
	
	
	public ProductPackagePage() {
		PageFactory.initElements(driver, this);
	}
	public String ProductPackagePageTitle() {
		return driver.getTitle();
	}
	public void ClickOnNew() {
		NewBtn.click();
	}
	public void PPName() {
		ProductPackageName.sendKeys("Deal_Ravi_0109_1");
	}
	public void ClickSave() {
		SaveBtn.click();
	}
	public void RecordClick() {
		RecordClick.click();
	}
	public void EditBtnClick() {
		EditBtn.click();
	}
	public void RelationshipTxtBoxClick() {
		driver.switchTo().frame(iFrame);
        
        RelationshipBtn.click();
		RelationshipBtn.sendKeys("Coastal");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(100,350)", "");
		iFrame.sendKeys(Keys.PAGE_DOWN);
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOf(CoastalSelection));

		CoastalSelection.click();
//		driver.switchTo().defaultContent();
//		PPSaveBtn.click();
	}
	
}
