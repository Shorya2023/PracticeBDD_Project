package Stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import org.junit.Assert;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import ApplicationPages.LoginPage;
import CommonUtils.ConfigReader;
import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOnBrowserStack {

	public static final String USERNAME = "shoryabeohar_xPozbC";
    public static final String AUTOMATE_KEY = "mrsahaH6sJoySYHYH1ya";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
            "@hub-cloud.browserstack.com/wd/hub";

	   private static String pageTitle;
		 ResourceBundle prop;
	    //ConfigReader config=new ConfigReader();
		 private RemoteWebDriver driver;
			private LoginPage loginpage = new LoginPage(DriverManager.getDriver());

	@Given("User is on login page to login")
	public void user_is_on_login_page_to_login() throws InterruptedException, MalformedURLException {
		System.out.println("******************STARTED EXECUTION ON BROWSERSTACK*************************");
		prop = ConfigReader.init_Prop();
		String surl=prop.getString("url");

		 MutableCapabilities capabilities = new MutableCapabilities();
	        HashMap<String, String> bstackOptions = new HashMap<>();
	        bstackOptions.putIfAbsent("source", "cucumber-java:sample-master:v1.2");
	        capabilities.setCapability("bstack:options", bstackOptions);
	        driver = new RemoteWebDriver( new URL(surl), capabilities);
	       

		Thread.sleep(12000);

	}

	@When("User enters valid Username into username field {string}")
	public void user_enters_valid_username_into_username_field(String username) {
		loginpage.enterUsername(username);
	}

	@When("User enters valid Password into password field {string}")
	public void user_enters_valid_password_into_password_field(String password) {
		loginpage.enterPassword(password);

	}

	@When("User Clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginpage.clickOnLogin();
		Thread.sleep(9000);
	}

	@Then("To verify successfull Login Verify page title as {string}")
	public void to_verify_successfull_login_verify_page_title_as(String title) {
		   Assert.assertTrue(title.contains(DriverManager.getDriver().getTitle()));
	}


}
