package com.inetBanking.TestCases;

import org.testng.annotations.Test;

import com.inetBanking.PageObject.BaseClass;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
		LoginPage lp = new LoginPage(driver);
		
		
		lp.setuserName(username);
		lp.setpassword(password);
		String title =driver.getTitle();
		
		if(title.equalsIgnoreCase("Guru99 Bank")) {
			System.out.println("True");
			
		}
		else {
			System.out.println("true");
		}
		lp.clickSubmit();
		
	}
	

}
