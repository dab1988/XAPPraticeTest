package qa.java.ExtentReportsUtility.com;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListner implements WebDriverEventListener
{

	public void beforeAlertAccept(WebDriver driver)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Before Alert Accept");
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Alert Accept");
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Alert Dismissed" + driver.toString());
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Alert Dismissed" + driver.toString());
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigation"+ url.toString());
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Afyer Navigation"+ url.toString());
	}

	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigation Back"+ driver.toString());
	}

	public void afterNavigateBack(WebDriver driver) 
	{
		// TODO Auto-generated method stub
	
		System.out.println("After Navigation Back"+ driver.toString());
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Find By"+ by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Find By" + by.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Click-->"+ " "+element.toString()+driver.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Click-->"+ " "+element.toString()+driver.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Switching to Window-->"+ script.toString());
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Switching to Window-->"+ script.toString());
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Switching to Window-->"+ windowName.toString());
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("After Switching to Window-->"+ windowName.toString());
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("On Exception->"+ throwable.getMessage());
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		System.out.println("Before Getting Screenshots-->");
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		System.out.println("After Getting Screen Shot-->"+ target.toString());
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Getting Text-->"+ element.toString());
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		System.out.println("After Getting Text-->"+ text.toString());
	} 

}
