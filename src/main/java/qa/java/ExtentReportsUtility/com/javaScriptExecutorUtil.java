package qa.java.ExtentReportsUtility.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class javaScriptExecutorUtil extends WebDriverClassUtil
{

	
   public javaScriptExecutorUtil() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

public static void clickButton(WebElement button)
   {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	   
	   js.executeScript("arguments[0].click();", button);
   }

   public static void WindowScroll()
   {
	   JavascriptExecutor js1= (JavascriptExecutor)driver;
	   
	   js1.executeScript("window.scrollBy(0,150)");
   }

}
