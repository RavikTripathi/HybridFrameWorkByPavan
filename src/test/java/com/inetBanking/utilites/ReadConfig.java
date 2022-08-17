package com.inetBanking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		
		File src = new File("C:\\Users\\ravikris\\eclipse-workspace\\HybridFrameWorkByPavan\\src\\test\\resources\\Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
			
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());

		}
	}

			public String getChromepath() {
			String Chromepath =pro.getProperty("Chromepath");
			return Chromepath;
	
	}
				public String getApplicationURL() {
				String url =pro.getProperty("baseUrl");
				return url;
		
	
		
	}
	public String getusername() {
		String username =pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password =pro.getProperty("password");
		return password;
		
	
	}
	
	}

