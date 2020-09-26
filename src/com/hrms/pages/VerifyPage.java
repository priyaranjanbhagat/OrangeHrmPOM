package com.hrms.pages;

import org.testng.Reporter;
import com.hrms.utility.*;

public class VerifyPage extends BaseClass{
	public static void verifyTitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			Reporter.log("Title Matched");
		}
		else
		{
			Reporter.log("Title not matched and expected title is " + driver.getTitle());
		}
	}
	

}
