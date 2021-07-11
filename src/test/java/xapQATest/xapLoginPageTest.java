package xapQATest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.timeEntry.XAP.qaXAPLogin;

import qa.java.ExtentReportsUtility.com.WebDriverClassUtil;

public class xapLoginPageTest extends WebDriverClassUtil
{

	qaXAPLogin qa=null;
	
	public xapLoginPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setUp() throws Exception
	{
		
		WebDriverClassUtil.driverInitializaion();
		qa= new qaXAPLogin();
		//qaXAPLogin.loginXap();
	}
	
	@Test (priority=2)
	public void checkTitle()
	{
		String actualTile="XAP";
		
		Assert.assertEquals(actualTile, qaXAPLogin.validateTitle());
		
	}
	
	
	@Test (priority=1)
	public void checkWelcomeText()
	{
		String actualTile="Welcome.";
		
		Assert.assertEquals(actualTile, qaXAPLogin.validatetextWelcome());
		
	}
	
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
}
