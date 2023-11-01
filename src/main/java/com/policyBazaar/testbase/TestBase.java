package com.policyBazaar.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.policyBazaar.pageLayer.LoginPage;
import com.policyBazaar.pageLayer.MyAccountPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public LoginPage login;
	public MyAccountPage myacc;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) {
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		login = new LoginPage();
		myacc = new MyAccountPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
