import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import mercury.base.base;
import mercury.pages.FlightFinderPage;
import mercury.pages.HomePage;
import mercury.pages.RegistrationPage;
import mercury.util.LoginTestUtil;

public class HomePageTest extends base {
	
	HomePage home;
	RegistrationPage Reg;
	FlightFinderPage ff;

	
	@BeforeMethod
	public void setup()
	{
		initialization();		
		home= new HomePage();			
		
	}
	
	@Test(priority=2)
	public void registrationlinktest()
	{
		Reg= home.clickonRegisterlink();
	}
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> data=LoginTestUtil.getDataFromExcel();
		
	
		return data.iterator();
		
		
		
	}
	@Test(priority=1,dataProvider = "getTestData")
	public void loginatHomePage(String UserName,String Password)
	{
		
		ff= home.Login(UserName, Password);
	    
	}
	

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
