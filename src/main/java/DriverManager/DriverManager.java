package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	   public WebDriver driver;
	   
	   //https://community.jaspersoft.com/blog/uncategorized/cucumber-scenarios-parallel-execution-threadlocal-driver-and-dynamic-dataproviderthreadcount/
	   /**A ThreadLocal webdriver refers to an instance of a WebDriver object that is stored in a ThreadLocal variable. 
	   Each thread running a Cucumber scenario or step can have its own WebDriver instance, isolated from other threads.
	   This approach ensures thread safety and prevents conflicts when executing scenarios in parallel.**/
	   
	   public static ThreadLocal<WebDriver> threadlocaldriver=  new ThreadLocal<>();
	   
	   //public static ThreadLocal<Webdriver> threadlocaldriver1= new ThreadLocal<>();
	   
	   /**
	    * This method to initialize the driver in Threadlocal mode
	    * @param browser
	    * @return ThreadLocaldriver
	    */
	   public WebDriver initDriver(String browser)
	   {
		   //   Browser type value initialized at before scenario in Hooks
			   if (browser.equalsIgnoreCase("chrome"))
			   {
				   WebDriverManager.chromedriver().setup();
				   	threadlocaldriver.set(new ChromeDriver());
			   }
			   else if (browser.equalsIgnoreCase("firefox"))
			   {
				   WebDriverManager.firefoxdriver().setup();
				   	threadlocaldriver.set(new FirefoxDriver());
			   }
			   else if (browser.equalsIgnoreCase("edge"))
			   {
				   WebDriverManager.edgedriver().setup();
				   	threadlocaldriver.set(new EdgeDriver());
			   }	   
			   else {
				   
				     System.out.println("pls select correct browser EDGE |  CHROME |  FIREFOX");
			   	}
			   
			   getDriver().manage().deleteAllCookies();
			   getDriver().manage().window().maximize();
			    return getDriver();	   
	   }   
	   
	   
	   public WebDriver launchBrowser()
	   {
		   //   Browser type value initialized at before scenario in Hooks
			   if (System.getProperty("browser").equalsIgnoreCase("chrome"))
			   {
				   WebDriverManager.chromedriver().setup();
				   	threadlocaldriver.set(new ChromeDriver());
			   }
			   else if (System.getProperty("browser").equalsIgnoreCase("firefox"))
			   {
				   WebDriverManager.firefoxdriver().setup();
				   	threadlocaldriver.set(new FirefoxDriver());
			   }
			   else if (System.getProperty("browser").equalsIgnoreCase("edge"))
			   {
				   WebDriverManager.edgedriver().setup();
				   	threadlocaldriver.set(new EdgeDriver());
			   }	   
			   else {
				   
				     System.out.println("pls select correct browser EDGE |  CHROME |  FIREFOX");
			   	}
			   
			   getDriver().manage().deleteAllCookies();
			   getDriver().manage().window().maximize();
			    return getDriver();	   
	   }   


	   /**
	    * This method returm a single driver 
	    * @return-Driver
	    */
	   public static synchronized WebDriver getDriver()
	   {
		   return threadlocaldriver.get();
	   }

  
		   
 }
	   


