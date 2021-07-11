package qa.java.ExtentReportsUtility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyConfigurator
{

	public static String fileName="C:\\Users\\dabeer.haider\\Desktop\\Selenium\\ExtendedWarratny\\config.properties";
   
    public static File file= null;
    
    public static FileInputStream fis=null;
    
    public static Properties pro=null;
    
    
    
    public static String readUrl() throws Exception
    {
    	
    if(file == null & fis==null || pro==null)
    {
    	
     file= new File(fileName);
     fis= new FileInputStream(file);
     pro= new Properties();
    }
       pro.load(fis);
     return pro.getProperty("url");
    }
    
    public static String readUserName() throws Exception
    {
    	
    if(file == null & fis==null || pro==null)
    {
    	
     file= new File(fileName);
     fis= new FileInputStream(file);
     pro= new Properties();
    }
       pro.load(fis);
     return pro.getProperty("uname");
    }

    public static String password() throws Exception
    {
    	
    if(file == null & fis==null || pro==null)
    {
    	
     file= new File(fileName);
     fis= new FileInputStream(file);
     pro= new Properties();
    }
       pro.load(fis);
     return pro.getProperty("password");
    }
    
}
