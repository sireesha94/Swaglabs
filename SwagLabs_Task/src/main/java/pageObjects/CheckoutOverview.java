package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverview extends BasePage{

	public CheckoutOverview(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "finish")
	WebElement finsh;
	
	public FinishPage finishbtn()
	{
		finsh.click();
		return new FinishPage(driver);
	}
}
