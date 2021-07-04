package qa.java.ExtentReportsUtility.com;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClassUtil 
{
	public static Logger log=null;

	public static WebDriver driver;
				
		public static void initializaion1(String url, String testCaseName)
		{		
			log= Logger.getLogger(testCaseName);
			PropertyConfigurator.configure("log4j.properties");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			//return driver;
		}
		
		public static WebDriver initializaion()
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get(url);
			return driver;
		}
}

