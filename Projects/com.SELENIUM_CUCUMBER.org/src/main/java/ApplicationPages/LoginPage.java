package ApplicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonUtils.Utils;

public class LoginPage  {
	
	//private webdriver
	private WebDriver driver;
	Utils util= new Utils();
	
	//Locators of login page 
	By emailTextBox_id= By.id("email");
	By  passwordTextBox_id = By.id("passwd");
	By  loginButton_id = By.id("SubmitLogin");

	//LoginPage class constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	// implementation methods of Login Page 
	public String getLoginPageTitle()
	{
		return util.get_PageTitle();
	}
	
	
	public boolean EmailIDFieldPresesnt()
	{
		boolean IsPresesnt= util.IsWebElement_Enabled(emailTextBox_id, 20);
				return IsPresesnt;
	}
	
	
	
	public void enterUsername(String username)
	{
		util.type_Webelement(emailTextBox_id, username, 15);
	}
	
	
	public void enterPassword(String password)
	{
		util.type_Webelement(passwordTextBox_id, password, 15);
	}
	
	
	
	public void clickOnLogin()
	{
		util.click_Webelement(loginButton_id,12);
	}
	

		//	
		//	public AccountPage loginToApp(String username,String password)
		//	{
		//		driver.findElement(emailTextBox).sendKeys(username);
		//		driver.findElement(passwordTextBox).sendKeys(password);
		//		driver.findElement(loginButton).click();
		//		return new AccountPage(driver);
		//	}
		//	
	
	

}
