package Stepdefinitions;

import java.util.ResourceBundle;

import org.junit.Assert;

import ApplicationPages.LoginPage;
import CommonUtils.ConfigReader;
import DriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
    private static String pageTitle;
	 ResourceBundle prop;
    //ConfigReader config=new ConfigReader();
	private LoginPage loginpage = new LoginPage(DriverManager.getDriver());
	
	@Given("User is on login page")
	public void user_is_on_login_page1() throws InterruptedException {
		System.out.println("******************STARTED EXECUTION*************************");
		prop = ConfigReader.init_Prop();
		DriverManager.getDriver().get(prop.getString("url"));

		Thread.sleep(12000);
	}

	
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		pageTitle = loginpage.getLoginPageTitle();
		System.out.println(pageTitle);
		Assert.assertTrue(pageTitle.contains(expectedtitle));
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		Assert.assertTrue(loginpage.EmailIDFieldPresesnt());

	}

	@When("user eneters username {string}")
	public void user_eneters_username(String username) {
		loginpage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginpage.enterPassword(password);

	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() throws InterruptedException {
		loginpage.clickOnLogin();
		Thread.sleep(9000);

	}


	@Then("Verify page title as {string}")
	public void verify_page_title_as(String title) {
	       Assert.assertTrue(title.contains(DriverManager.getDriver().getTitle()));
	}

	
	
	

}
