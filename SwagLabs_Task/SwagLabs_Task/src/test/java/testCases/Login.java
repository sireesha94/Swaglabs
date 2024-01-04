package testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckoutOverview;
import pageObjects.FinishPage;
import pageObjects.InformationPage;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;
import testBase.UtilityClass;


public class Login extends BaseClass{
	
	@Test
	
	 public void testlogin() throws IOException
	 {
		LoginPage loginpage = new LoginPage(driver);
		 loginpage.setusername(UtilityClass.rddata("valid_username"));
		 loginpage.setpassword(UtilityClass.rddata("valid_password"));
		 loginpage.login();
		 
		 ProductsPage productspage = new ProductsPage(driver);
		 productspage.addtocart();
		 productspage.cartlink();
		 
		 CartPage cartpage = new CartPage(driver);
		 cartpage.chckoutpage();
		 
		 InformationPage informationpage = new InformationPage(driver);
		 informationpage.firstname(UtilityClass.rddata("firstname"));
		 informationpage.lastname(UtilityClass.rddata("lastname"));
		 informationpage.postcode(UtilityClass.rddata("passcode")  );
		 informationpage.continu();
		 
		 CheckoutOverview checkoutoverview = new CheckoutOverview(driver);
		 checkoutoverview.finishbtn();
		 
		FinishPage f = new FinishPage(driver);
		String expstr = f.confirmationmsg();
		String actStr = "Thank you for your order!";
		Assert.assertEquals(actStr, expstr);
	
		 
		
	 }
    
}
