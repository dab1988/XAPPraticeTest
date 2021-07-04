package OutLookandGmail;

import org.testng.Assert;
import org.testng.annotations.*;

import qa.java.ExtentReportsUtility.com.WebDriverClassUtil;

public class OutlookTest extends WebDriverClassUtil
{

	String url="https://mail.telus.com/";
	OutLookLogin out=null;
	
	@BeforeClass
	public void setUp()
	{
		WebDriverClassUtil.initializaion1(url, "OutlookTest" );
		log.info("Driver SetUp");

		out=new OutLookLogin();
		log.info("Login Page Setup");

	}
	
	@Test
	public void loginOutLook()
	{
		//String title="Dabeer Haider - Outlook Web App";
		out.login();
		log.info("Login Clicked");		
	}

	@Test
	public void validateTitle() throws Exception
	{
		String expectedTitle="Dabeer Haider - Outlook Web App";
		
		out.acceptPop();
		log.info("Pop-Up Closed");
		//out.login();
		Thread.sleep(2000);
		Assert.assertEquals(out.validateTile(), expectedTitle);
		log.info("Login Title Validated");
		
	}
	
	@Test
	public void logOut() throws Exception
	{
		String expectedTitle="Outlook Web App";
		Thread.sleep(4000);
		out.logOut();
		log.info("Application LogOut");
		Assert.assertEquals(out.validateTile(), expectedTitle);
		log.info("LogOut Title Validated");
		
	}
	
	@AfterClass
	public void kill()
	{
		//driver.close();
		log.info("Browser Closed");
	}

}
