package xapQATest;

import org.testng.annotations.BeforeClass;

import qa.java.ExtentReportsUtility.com.WebDriverClassUtil;

public class xapHomePageTest extends WebDriverClassUtil
{

	public xapHomePageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setUp() throws Exception
	{
		WebDriverClassUtil.driverInitializaion();
	}
	
	
}
