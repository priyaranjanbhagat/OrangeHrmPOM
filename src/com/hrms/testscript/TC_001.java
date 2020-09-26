package com.hrms.testscript;	
import com.hrms.pages.*;
import com.hrms.utility.BaseClass;

import org.testng.annotations.Test;



public class TC_001 {
	@Test
	public static void tc_001() throws Exception
	{
		BaseClass.openApp();
		LoginPage.login("admin", "admin");
		LogoutPage.logout();
		BaseClass.closeApp();
	}

}
