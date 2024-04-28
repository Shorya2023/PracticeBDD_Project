package ApplicationPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import CommonUtils.Utils;

public class WomenClothingsPage {
	
	//page driver
	public WebDriver driver;
	Utils util = new Utils();
	
	///page locators
	By linkWomen = By.xpath("//a[@title='Women']");
	By productsList_name= By.xpath("//ul[@class='product_list grid row']//h5");
	By productsPrice= By.xpath("//div[@class='right-block']//span[@class='price product-price']");
	By Womenpagelogo= By.xpath("//div[@id='categories_block_left']//h2");
	
	//constructor to initliaze driver
	public WomenClothingsPage(WebDriver driver)
		{
			this.driver = driver;
		}

	
	
	public void clickOnWomenMenu()
		{
			util.click_Webelement(linkWomen, 14);			
		}
	
	
	public String verifyWomenLogo()
		{
			String textWomenLogo = util.get_WebElementText(Womenpagelogo, 15);
			return textWomenLogo;
		}
		
	
	public void productsNameAndPrice()
		{
			   List <WebElement> clothsname=  util.findElements(productsList_name, 10);
		       List <WebElement> clothsPrice=   util.findElements(productsPrice,10);
	
			       for (WebElement e: clothsname )
			       {
			    	   System.out.println("productName-->"+e.getText());
				    	   
			       }
			       for (WebElement e1: clothsPrice )
			       {
			    	   System.out.println("price-->"+e1.getText());
			       }	
		}
		
	
	
	public int  countOFTotalProducts()
		{
			   int cloths=  util.countOfElement(productsList_name, 8);
			    return cloths;
		}
		
		

	
	

}
