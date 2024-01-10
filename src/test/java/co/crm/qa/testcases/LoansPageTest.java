package co.crm.qa.testcases;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoansPage;
import com.crm.qa.pages.LoginPage;

public class LoansPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	LoansPage loanpage;
	
	@BeforeMethod
	public void setup() {
		initializationDriver();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	

	
	

	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	

}
