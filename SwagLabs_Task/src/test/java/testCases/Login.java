package testCases;

import java.io.IOException;




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
		 
		 
		 ProductsPage productspage = loginpage.login();
		 productspage.addtocart();
		
		 
		 CartPage cartpage = productspage.cartlink();
		 cartpage.chckoutpage();
		 
		 InformationPage informationpage = new InformationPage(driver);
		 informationpage.firstname(UtilityClass.rddata("firstname"));
		 informationpage.lastname(UtilityClass.rddata("lastname"));
		 informationpage.postcode(UtilityClass.rddata("passcode")  );
		 
		 
		 CheckoutOverview checkoutoverview = informationpage.continu();
		
		 
		FinishPage f = checkoutoverview.finishbtn();
		f.confirmationmsg();	 
		
	 }
    
}
