package com.qa.timeEntry.XAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.java.ExtentReportsUtility.com.WebDriverClassUtil;
import qa.java.ExtentReportsUtility.com.javaScriptExecutorUtil;
import qa.java.ExtentReportsUtility.com.propertyConfigurator;

public class qaXAPLogin extends WebDriverClassUtil
{

	@FindBy (xpath="//input[contains(@name,'txtLoginName')]")
	@CacheLookup 
	static WebElement unameField;
	
   @FindBy (xpath="//input[contains(@name,'txtPassword')]")
   @CacheLookup 
   static WebElement passwordField;
   
   @FindBy (xpath="//input[contains(@name,'btnLogin')]")
   @CacheLookup 
   static WebElement loginButton;
   
   
    public qaXAPLogin() throws Exception
    {
    	super();
    	PageFactory.initElements(driver, this);
    }
   
    
    public static String validateTitle()
    {
    	return driver.getTitle();
    }
    
    public static String validatetextWelcome()
    {
    	return driver.findElement(By.xpath("//span[text()='Welcome.']")).getText();
    }
    
    public static XAPHomePage loginXap() throws Exception
    {
    	unameField.sendKeys(propertyConfigurator.readUserName());
    	
    	passwordField.sendKeys(propertyConfigurator.password());
    	
    	javaScriptExecutorUtil.clickButton(loginButton);
    	
    	return new XAPHomePage();
    }
 
}
