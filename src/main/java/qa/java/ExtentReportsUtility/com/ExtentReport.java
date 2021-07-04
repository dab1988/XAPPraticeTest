package qa.java.ExtentReportsUtility.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import qa.java.commonUtil.com.screenShotLibrary;

public class ExtentReport extends TestListenerAdapter 
{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	WebDriver driver=WebDriverClassUtil.initializaion();
	
	public void onStart(ITestContext ctr)
	{
	
	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/DabeerExtentReport.html");
    // Create an object of Extent Reports
	extent = new ExtentReports();  
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host Name", "TelusInternational");
    extent.setSystemInfo("Environment", "Pre-Prod/QA");
	extent.setSystemInfo("User Name", "Dabeer Haider");
	htmlReporter.config().setDocumentTitle("QA Test Execution Report for Regression Testing"); 
            
	htmlReporter.config().setReportName("Regression Testing"); 
            
	htmlReporter.config().setTheme(Theme.DARK);			
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		logger = extent.createTest(result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case PASSED", ExtentColor.GREEN));
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		String ScreenshotPath=screenShotLibrary.captureScreenShot(driver, result);
		logger = extent.createTest(result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED)); 
		try {
			logger.fail("Test Case Failed"+ logger.addScreenCaptureFromPath(ScreenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

	
	public void onTestSkipped(ITestResult result)
	{
		logger = extent.createTest(result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));		
	}
	
	public void onFinish(ITestContext ctr)
	{
		//extent.config();
		extent.flush();
	}
	
	
}
