package com.inetBanking.TestCases;

import org.testng.annotations.Test;

import com.inetBanking.PageObject.BaseClass;

public class TC_LoginDDT_002 extends BaseClass{
	
@Test
public void loginDDT() {
	
	
}

@DataProvider(name="LoginData"){
	getData(){
		String  path= System.getProperty("user.dir")+"";
		int rownum=XLUtils.getRowCount(Path,"Sheet1");
		int colcount=XLUtils.getcellCount(Path,"Sheet1",1);
		
	
	
}

}
