package CommonUtils;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.sjavac.Log;

import DriverManager.DriverManager;

public class Utils {
	
public WebDriver driver;


    			public Utils() 
    				{
    	  				driver=DriverManager.getDriver();
    	  				org.apache.logging.log4j.Logger log=LogManager.getLogger();
    	  				
    	  				//System.out.println("Utils driver initialized  from DriverManager");
    				}
      
    	
    			public void click_Webelement(By WebElement_sLocator,int DurationinSeconds)
    				{
						WebElement ele=null;
						WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
	    				ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
    					ele.click();
    					//Log.info(ele.getText() +"clicked successsfully");;
    				}
    		
    					
    			public void type_Webelement(By WebElement_sLocator, String Value, int DurationinSeconds)
	    			{
    						WebElement ele=null;
    						WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
    	    				ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
						 	ele.sendKeys(Value);	
						 	//Log.info(ele.getText() +"value typed successsfully");
	    			}
    			
    			
    			public WebElement findElement(By WebElement_sLocator,int DurationinSeconds)
    				{		
		    			WebElement ele=null;
						WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
						 ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
						return ele;
						
    				}
    			
    			
    			public List<WebElement> findElements(By WebElement_sLocator,int DurationinSeconds)
					{		
		    			WebElement ele=null;
						WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
						ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
						List<WebElement> totalElements = driver.findElements(WebElement_sLocator);
						return totalElements;
					}
				
    			
    			
    			public String get_PageTitle()
	    			{
	    				System.out.println("title");
						String pageTitle = driver.getTitle();
	    				System.out.println("title****************************************"+pageTitle);
	    				//Log.info(pageTitle+"---page tile retrievd");
						return pageTitle;
	    			}
	    		
    			
	    		public String get_WebElementText(By WebElement_sLocator,int DurationinSeconds)
					{
								WebElement ele=null;
	    						WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
	    	    				ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
								String textOnElement = ele.getText();	
			    				//Log.info(ele.getText()+"---get the element");

								return textOnElement;
					}
		    		
		    		
	    		
	    	public boolean IsWebElement_Enabled(By WebElement_sLocator, int DurationinSeconds)
	    		{
						WebElement ele=null;
	    				WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
	    				ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
		    			if (ele.isEnabled())
		    			{
		    				//Log.info(ele.getText()+"---is enabled");
		    				return true;
		    			}
		    			else
		    			{ 
		    				//Log.error(ele.getText()+"---is not enabled");
		    				return false;
		    			}

	    		}

	    	
	    	
             public int countOfElement(By WebElement_sLocator, int DurationinSeconds)
                   {
                		WebElement ele=null;
	    				WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(DurationinSeconds));
	    				ele=wait.until(ExpectedConditions.elementToBeClickable(WebElement_sLocator));
	    				List <WebElement> totalElement = driver.findElements(WebElement_sLocator);
	    				//Log.info(totalElement+"---count of element");

						return totalElement.size();
                   }
                   
    		
             
    		public WebElement locate_Webelement(String Locatorvalue)
    	    {
    			
    			System.out.println("******************************-->"+Locatorvalue);
	    	    	WebElement e=null;
		    	    	if (Locatorvalue.endsWith("_xpath"))
		    	    		{
		    	    			e=driver.findElement(By.xpath(Locatorvalue));
		    	    		}
		    	    			
		    	    	else if (Locatorvalue.endsWith("_id"))
		    	    		{
		    	    			e=driver.findElement(By.id(Locatorvalue));
		    	    		}
		    	    	else if (Locatorvalue.endsWith("_className"))
		    	    		{
		    	    		e=driver.findElement(By.className(Locatorvalue));
		    	    		}
		    	    		
		    	    	else if (Locatorvalue.endsWith("_tagName"))
		    	    		{e=driver.findElement(By.tagName(Locatorvalue));
		    	    		}
		    	    		
		    	    	else if (Locatorvalue.endsWith("_linkText"))
		    	    		{
		    	    			e=driver.findElement(By.linkText(Locatorvalue));
		    	    		}
		    	    	else if (Locatorvalue.endsWith("_name"))
		    	    		{	
		    	    			e=driver.findElement(By.name(Locatorvalue));
		    	    		}
		    	    	else if (Locatorvalue.endsWith("_cssSelector"))
		    	    		{	
		    	    			e=driver.findElement(By.cssSelector(Locatorvalue));
		    	    		}
		    	    	else if (Locatorvalue.endsWith("_partialLinkText"))
		    	    		{	
		    	    			e=driver.findElement(By.partialLinkText(Locatorvalue));
		    	    		}
		    	    	else if (Locatorvalue.endsWith("_partialLinkText"))
	    	    		{	
	    	    			System.out.println("Locator missing "+Locatorvalue+"pls check again");
	    	    		}
		    	    	System.out.println("value of e in locator***************"+Locatorvalue);
				return e;
    	    }
      
      
      
      
      
      
      
}
