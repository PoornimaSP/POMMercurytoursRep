import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;
import mercury.base.base;
import mercury.pages.HomePage;

import mercury.pages.RegistrationPage;

public class RegistrationPageTest extends base {
	
	HomePage home;
	RegistrationPage Reg;
	
		
	@BeforeMethod
	public void setup()
	{
		initialization();
		home= new HomePage();	
		Reg= home.clickonRegisterlink();
	}
	
	@Test
	public void VerifyRegistrationSuccess()
	{
		String text= Reg.enterRegdetails("Amma","Pandu","Pandu");
		Assert.assertTrue(text.contains("Note: Your user name is"));
		
	 
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
