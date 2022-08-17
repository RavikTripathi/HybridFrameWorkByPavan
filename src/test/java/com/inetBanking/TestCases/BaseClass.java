package com.inetBanking.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.beust.jcommander.Parameter;
import com.inetBanking.utilites.ReadConfig;

public class BaseClass {
	
		ReadConfig readconfig = new ReadConfig();
	
		public String baseUrl= readconfig.getApplicationURL();
		public String username= readconfig.getusername();
		public String password= readconfig.getpassword();
		public  WebDriver driver;
		
		
		/*
		 * public String baseUrl= "https://demo.guru99.com/v3/index.php"; 
		 * public String username= "mngr430959"; 
		 * public String password= "ejatyme";
		 * 
		 */
	
		@Parameters("browser")

		@BeforeClass
		public void setup(String br) {
			if(br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
				driver = new ChromeDriver();	
			}
			
			else if(br.equals("firefox")) {
				System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
				driver = new FirefoxDriver();	
				
			}
	
			else if(br.equals("ie")) {
				//System.setProperty("webdriver.chrome.driver", readconfig.getiepath());
				//driver = new ie();	
				
			}
	 //WebDriver driver = WebDriverManager.chromedriver().create();
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
	//System.setProperty(password, \Users\ravikris\eclipse-workspace\HybridFrameWorkByPavan\src\test\resources\Driver\chromedriver.exe);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravikris\\eclipse-workspace\\HybridFrameWorkByPavan\\src\\test\\resources\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//logger =Logger.getLogger("ebanking");
	
	 //PropertyConfigurator.configure("log4j.properties");
	
	
	
}


@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}