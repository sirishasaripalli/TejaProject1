package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	
	
	//Constructor
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip;
				ip = new FileInputStream("C:\\Users\\kollu\\eclipse-workspace\\TejaProject1\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				System.out.println("I am here....");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("I am here....");
				e.printStackTrace();
			}
	}
	public static void popupMessageCapture() {
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//1-Allow, 2-Block, 0-default
		options.setExperimentalOption("prefs",prefs);
		//ChromeDriver driver=new ChromeDriver(options);
	}
				
		public static void initializationDriver(){
			
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")) {
				ChromeOptions options=new ChromeOptions();
				Map<String, Object> prefs=new HashMap<String,Object>();
				prefs.put("profile.default_content_setting_values.notifications", 1);
				//1-Allow, 2-Block, 0-default
				options.setExperimentalOption("prefs",prefs);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
				//tlDriver.set(new ChromeDriver());
			}
			else if(browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				//tlDriver.set(new FirefoxDriver());
			}
			else if(browserName.equals("safari")) {
				WebDriverManager.safaridriver().setup();
				//tlDriver.set(new SafariDriver());
				
			}
			else if(browserName.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				//tlDriver.set(new EdgeDriver());
				
			}		
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	


