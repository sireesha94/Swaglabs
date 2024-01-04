package testBase;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	

	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException
	{
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(UtilityClass.rddata("URL"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	 public void tearDown()
	 {
		driver.quit();
	 }

}
