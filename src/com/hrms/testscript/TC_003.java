package com.hrms.testscript;

import com.hrms.pages.AddEmpPage;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.BaseClass;
import org.testng.annotations.Test;

public class TC_003 {
	@Test
	public static void tc_003() throws Exception
	{
		BaseClass.openApp();
		VerifyPage.verifyTitle("OrangeHRM");
		LoginPage.login("admin", "admin");
		AddEmpPage.addEmp("Bhagat", "Priyaranjan", "Kumar");
		BaseClass.closeApp();
		
		
	}

}
