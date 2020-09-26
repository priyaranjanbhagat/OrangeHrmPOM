package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	public static WebDriver driver;
	public static void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\Automation\\WebDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/orangehrm/login.php");
		Reporter.log("Opened Application");

	}
	
	public static void closeApp() {
		driver.quit();
		Reporter.log("Closed Application");	
	}
	
	

}
