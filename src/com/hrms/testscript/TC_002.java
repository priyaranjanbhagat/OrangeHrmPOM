package com.hrms.testscript;

import org.testng.annotations.Test;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC_002 {
	
	@Test
	public static void tc_002() throws Exception
	{
	
	BaseClass.openApp();
	VerifyPage.verifyTitle("OrangeHrm");
	LoginPage.login("admin", "admin");
	LogoutPage.logout();
	BaseClass.closeApp();
	
	}
}
