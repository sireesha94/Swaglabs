package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class FinishPage extends BasePage {

	
	public FinishPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(tagName = "h2")
	public static WebElement str;
	
	public String confirmationmsg()
	{
		 return str.getText();
		
	}
}
