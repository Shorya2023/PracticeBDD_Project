package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features={"src\\test\\resources\\Features\\AccountsPage.feature"},
		glue={"Stepdefinitions","Hooks"},
				//tags= ("SmokeTests"),
		monochrome=true,
		dryRun=false,
				
		plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
)



public class TestRunner {

//public class TestRunner extends AbstractTestNGCucumberTests {
//	/*@DataProvider(parallel=true)
//public Object[][] scenarios()
//{
//			return super.scenarios();
//			
//}*/      
	
}

