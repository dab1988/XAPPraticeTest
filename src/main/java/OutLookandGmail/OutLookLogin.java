package OutLookandGmail;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.java.ExtentReportsUtility.com.WebDriverClassUtil;

public class OutLookLogin extends WebDriverClassUtil
{

	@FindBy(id="username")
	@CacheLookup
	WebElement uName;
	

	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy (xpath="//span[contains(text(),'sign in')]")
	@CacheLookup
	WebElement clickLogin;
	
	@FindBy(id="_ariaId_48")

	WebElement clickpop;
	
	
	@FindBy(xpath="//span[text()='Dabeer Haider']//parent::div[contains(@class,'_hl')]")
	WebElement logOut;
	
	
	@FindBy(xpath="//div[@aria-label='Sign out']")
	
	WebElement clikcSignOut;
	
	public OutLookLogin()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void login()
	{
		uName.sendKeys("x212631");
		password.sendKeys("Telus@1999");
		clickLogin.click();
	}
	
	public String validateTile()
	{
	     	return driver.getTitle();
	}
	
	public void acceptPop()
	{
		clickpop.click();
	}
	
	public void logOut ()
	{
		logOut.click();
		clikcSignOut.click();
	}
	
	
}
