package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id ="user-name")
	WebElement txtusername;

	@FindBy(id ="password")
	WebElement txtpassword;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	@FindBy(tagName = "h3")
	WebElement error;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);	
	}
	
	public void setpassword(String pwd)
	{
		txtpassword.sendKeys(pwd);	
	}
	
	public ProductsPage login()
	{
		login.click();
		return new ProductsPage(driver);
	}
	
	public void error()
	{
	   	Assert.assertTrue(error.isDisplayed());
		System.out.println(error.getText());;
		
	}

}
