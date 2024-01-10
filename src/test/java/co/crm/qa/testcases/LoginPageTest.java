package co.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initializationDriver();
		loginPage = new LoginPage();
		
	}
//	
//	@Test(priority=1)
//	public void loginPageTestTitle() {
//	String title= loginPage.validLoginPageTitle();
//	Assert.assertEquals(title, "Account Login");	
//			
//		}
	@Test(priority=2)
	public void loginTest() {
		//loginPage.ClickAccountLinkPage();
		homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}


	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
