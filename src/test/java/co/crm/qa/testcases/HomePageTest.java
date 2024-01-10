package co.crm.qa.testcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProductPackagePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoansPage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	ProductPackagePage productpackage;
	LoansPage loanpage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initializationDriver();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	
	@Test(priority=1)
	public void validateHomePageTitle() {
		String Title = homepage.VerifyHomePageTitle();
		Assert.assertEquals(Title, "Lightning Experience");
	}
	
	@Test(priority=2)
	public void ProductPackagesTest() {
					productpackage = homepage.ProductPackages();
							}
	@Test(priority=3)
	public void LoansPageTest() {
		loanpage= homepage.LoansPage();
							}
	

	@AfterMethod
	public void tearDown() {
		//driver.close();
	}

}
