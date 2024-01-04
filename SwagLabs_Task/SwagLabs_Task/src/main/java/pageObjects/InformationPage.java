package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage{
	
	public InformationPage(WebDriver driver) {
		super(driver);
			}

	
	@FindBy(id = "first-name")
	WebElement firstname;
	
	@FindBy(id = "last-name")
	WebElement lastname;
	
	@FindBy(id = "postal-code")
	WebElement code;
	
	@FindBy(id = "continue")
	WebElement ctnue;
	
	public void firstname(String frstname)
	{
		firstname.sendKeys(frstname);
	}
	
	public void lastname(String lstname)
	{
		lastname.sendKeys(lstname);
	}
	public void postcode(String cd)
	{
		code.sendKeys(cd);
	}
	public void continu()
	{
		ctnue.click();
	}

}
