package pageObjects;

import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
	
	public ProductsPage(WebDriver driver) {
		super(driver);
}
	
	String[] expectedproducts = {"Sauce Labs Backpack","Sauce Labs Bike Light"};
	   
	   @FindBy(xpath = "//div[@class='inventory_item_label']")
	   List<WebElement> products;
	   
	   @FindBy(xpath = "//button[.='Add to cart']")
	    WebElement cart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement basket;
	
	public void addtocart()
	{
		 for(WebElement product:products)
		   {
			   String actualproducts = product.findElement(By.tagName("a")).getText();
			   List itemsneeded = Arrays.asList(expectedproducts);
			   
			   if(itemsneeded.contains(actualproducts))
			   {
				  cart.click();
			   }
		   }
	}
	
	public CartPage cartlink()
	{
		basket.click();
		return new CartPage(driver);
	}
	

}
