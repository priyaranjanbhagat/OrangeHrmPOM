package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.*;
public class AddEmpPage extends BaseClass {
	static By btn_addEmp = By.xpath("//input[@value='Add'][@type='button']");
	static By txt_last_name = By.xpath("//input[@id='txtEmpLastName']");
	static By txt_first_name = By.xpath("//input[@id='txtEmpFirstName']");
	static By txt_middle_name = By.xpath("//input[@id='txtEmpMiddleName']");
	static By btn_save = By.xpath("//input[@id='btnEdit']");
	
	public static void addEmp(String ln, String fn, String mn) throws Exception
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(btn_addEmp).click();
		Thread.sleep(4000);
		driver.findElement(txt_last_name).sendKeys(ln);
		driver.findElement(txt_first_name).sendKeys(fn);
		driver.findElement(txt_middle_name).sendKeys(mn);
		driver.findElement(btn_save).click();
		Thread.sleep(4000);
		Reporter.log("Employee Added successfull");
	}
	
	
	

}
