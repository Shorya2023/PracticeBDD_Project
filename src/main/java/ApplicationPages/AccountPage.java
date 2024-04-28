package ApplicationPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.Utils;

public class AccountPage {

	private WebDriver driver;
	Utils util= new Utils();
	
	By OrdersInfoList = By.xpath("//div[@class='col-xs-12 col-sm-6 col-lg-4']//a");
	By TextUserName= By.xpath("//a[@title='View my customer account']");

	public AccountPage(WebDriver driver)
	{
					this.driver = driver;
	}
	
	
	public String usernameLoggedIn()
	{
			String getTextUsername= util.get_WebElementText(TextUserName, 5);
			return getTextUsername;
	}
	
	
	public int ordersTabCount()
	{
		int countTab = util.countOfElement(OrdersInfoList, 6);
		return countTab;
	}
	
	
	public List<String> ordersHistoryValues()
	{
		List <WebElement> orders = util.findElements(OrdersInfoList, 0);		
		List<String> Ordersvalue= new ArrayList<String>();
		for (WebElement e: orders)
		{
			String values= e.getText();
			Ordersvalue.add((values.toUpperCase()));
			System.out.println(e.getText());
		}
		return Ordersvalue;
	}
	
	
	
	
	
	
}
