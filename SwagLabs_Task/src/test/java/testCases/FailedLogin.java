package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import testBase.BaseClass;
import testBase.UtilityClass;
import pageObjects.LoginPage;

public class FailedLogin extends BaseClass{
	
	@Test
	public void Failedtest() throws IOException
	{
		LoginPage loginpage = new LoginPage(driver);
		 loginpage.setusername(UtilityClass.rddata("Invalid_Username"));
		 loginpage.setpassword(UtilityClass.rddata("valid_password"));
		 loginpage.login();
		 loginpage.error();
		 
		 
	}
	}


