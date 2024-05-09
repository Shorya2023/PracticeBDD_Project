package TestRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		//features={"@target/failedrerun.txt"},
		features={"src\\test\\resources\\Features"},
		glue={"Stepdefinitions","Hooks"},
				monochrome=true,
					dryRun=false,
		
		plugin={"pretty","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
		}
		//publish= {"json:target/cucumber.json"}
)

public class TestRunnerWithTestng extends AbstractTestNGCucumberTests {
	@DataProvider(parallel=true)
		public Object[][] scenarios()
		{
					return super.scenarios();
					
		}
	
}

