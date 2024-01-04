package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class FinishPage extends BasePage {

	
	public FinishPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(tagName = "h2")
	 WebElement str;
	
	public void confirmationmsg()
	{
		 String expstr =str.getText();
		 String actStr = "Thank you for your order!";
	     Assert.assertEquals(actStr, expstr);
	}
}
