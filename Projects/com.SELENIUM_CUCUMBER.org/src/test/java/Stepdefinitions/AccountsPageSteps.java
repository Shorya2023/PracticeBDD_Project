package Stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import ApplicationPages.AccountPage;
import DriverManager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	private AccountPage accountpage= new AccountPage(DriverManager.getDriver());
	@Given("Logged in with valid credentials with username {string}")
	public void logged_in_with_valid_credentials_with_username(String username) {
		Assert.assertTrue(accountpage.usernameLoggedIn().contains(username));    

	}

	@Then("veriy total orders tab will be {int}")
	public void veriy_total_orders_tab_will_be(Integer expectedTabs) {
		int ActualTabs=accountpage.ordersTabCount();
		Assert.assertTrue(ActualTabs == expectedTabs);
	}
	
	
	@Then("Verify different Orders history tabs")
	public void verify_different_orders_history_tabs(DataTable TabsTable) {
		      List<String> expectedTabs = TabsTable.asList();
		      List<String> actualListOnAccountsPage = accountpage.ordersHistoryValues();

		Assert.assertTrue(expectedTabs.containsAll(actualListOnAccountsPage));    		
	}

}
