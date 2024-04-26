package Stepdefinitions;

import org.junit.Assert;

import ApplicationPages.WomenClothingsPage;
import DriverManager.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenClothingsSteps {
	
	WomenClothingsPage womenpage = new WomenClothingsPage(DriverManager.getDriver());
	
	
	@When("click on women Top Menu")
	public void click_on_women_top_menu() {
		womenpage.clickOnWomenMenu();		
	}

	
	@Then("Women page should get displayed with logo {string}")
	public void women_page_should_get_displayed_with_logo(String womenLogo) {
		System.out.println("************"+womenLogo+"****"+womenpage.verifyWomenLogo());
		Assert.assertTrue(womenpage.verifyWomenLogo().contains(womenLogo));
	}

	@Then("Verify total women clothings products is {int}")
	public void verify_total_women_clothings_products_is(Integer productCount) {
		int count = womenpage.countOFTotalProducts();
		Assert.assertTrue(count == productCount);
	}
	
	@Then("Verify the price and name displayed for each products")
	public void verify_the_price_displayed_for_each_products() {
		womenpage.productsNameAndPrice();
		
	}


}
