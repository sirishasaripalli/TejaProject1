package co.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.ProductPackagePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.base.TestBase;

public class ProductPackageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	ProductPackagePage productpackage;
	
	public ProductPackageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initializationDriver();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		productpackage = new ProductPackagePage();
	}
	@Test(priority=1)
	public void verifyproductpackageTest() {
		String Title = productpackage.ProductPackagePageTitle();
		Assert.assertEquals(Title, "Lightning Experience");
		System.out.println("Title of the productpackage is :"+Title);
	}
	@Test(priority=2)
	public void ClickOnNewLinkTest() {
		homepage.ProductPackages();
		productpackage.ClickOnNew();
	}
	@Test(priority=3)
	public void ProductPackageNameTest() {
		homepage.ProductPackages();
		productpackage.ClickOnNew();
		productpackage.PPName();
	}
	@Test(priority=4)
	public void ClickSaveTest() {
		homepage.ProductPackages();
		productpackage.ClickOnNew();
		productpackage.PPName();
		productpackage.ClickSave();
	}
	@Test(priority=5)
	public void ClickRecordTest() {
		homepage.ProductPackages();
		productpackage.RecordClick();
	}
	
	@Test(priority=6)
	public void ClickEditBtnTest() {
		homepage.ProductPackages();
		productpackage.RecordClick();
		productpackage.EditBtnClick();
	}
	@Test(priority=7)
	public void RelationshipTxtBoxTest() {
		homepage.ProductPackages();
		productpackage.RecordClick();
		productpackage.EditBtnClick();
		productpackage.RelationshipTxtBoxClick();
		
	}
		
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

	
	
	
	
	
	
	
}
