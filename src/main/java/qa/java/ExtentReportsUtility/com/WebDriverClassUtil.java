package qa.java.ExtentReportsUtility.com;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverClassUtil extends propertyConfigurator
{
	public WebDriverClassUtil() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	public static Logger log=null;
   // public static EventFiringWebDriver driver1=null;
	public static WebDriver driver;
				
		public static void driverInitializaion() throws Exception
		{		
			log= Logger.getLogger(Logger.class);
			PropertyConfigurator.configure("log4j.properties");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
			
			
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			EventFiringWebDriver eventDriver= new EventFiringWebDriver(driver);
			WebDriverListner listner= new WebDriverListner();
			eventDriver.register(listner);
			eventDriver.get(propertyConfigurator.readUrl());
			//return driver;
		}
		
	
	public static WebDriver initializaion() {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe"); 
		 driver= new ChromeDriver(); driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 //driver.get(url); 
		 return driver; 
	}
}

