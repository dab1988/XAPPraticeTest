package qa.java.commonUtil.com;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.*;

public class screenShotLibrary 
{

	
	public static String captureScreenShot(WebDriver driver, ITestResult result)
	{
		
		
		String dateName = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\ScreenShots\\"+result.getName()+dateName+".png");
	  
		String filePath= destination.getAbsolutePath();
		
		try
	   {
		FileHandler.copy(source, destination);
	    } catch (IOException e)
	   
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
    	}
     	return filePath;
	
	}
	
	
	public static void captureScreenShot1(WebDriver driver)
	{
		
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("C:\\Users\\dabeer.haider\\eclipse-workspace\\Java_Programming\\ScreenShots\\XAP\\"+dateName+".png");
	  
		//String filePath= destination.getAbsolutePath();
		
		try
	   {
		FileHandler.copy(source, destination);
	    } catch (IOException e)
	   
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
    	}
     //	return filePath;
	
	}
}
