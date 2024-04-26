package Hooks;

import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CommonUtils.ConfigReader;
import DriverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private DriverManager drivermanager;
	private WebDriver driver;
	private ResourceBundle prop;
	
	@Before(order=0)
	public void setup()
	{
		System.out.println("*******************Hooks*****************************");
		//config reader object for properties file access
		prop = ConfigReader.init_Prop();
				
		//drivermanager to launch browser
		String sBrowserType= prop.getString("sbrowsertype");
		drivermanager= new DriverManager();
		driver = drivermanager.initDriver(sBrowserType);
		
	}
	
	
	
	@After(order=0)
	public void quitDriver()
	{
		driver.quit();
	}
	

	
	
	
	@After(order=1)
	public void screenshotOnFailure(Scenario scenario)
	{
		if (scenario.isFailed())
		{
			String ScreenShotnames = scenario.getName().replace(" ", "_");
			
			byte [] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", ScreenShotnames);
		}
	}
	
	
	

}
