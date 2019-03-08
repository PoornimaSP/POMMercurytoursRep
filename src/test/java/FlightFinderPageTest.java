import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mercury.base.base;
import mercury.pages.FlightFinderPage;
import mercury.pages.HomePage;
import mercury.pages.RegistrationPage;
import mercury.util.FlightFinderUtil;


public class FlightFinderPageTest extends base{
	
	HomePage home;
	RegistrationPage Reg;
	FlightFinderPage ff;
	
	@BeforeMethod
	public void setup()
	{
		initialization();		
		home= new HomePage();
		ff=home.Login("q","q");
		
	}
	
	@Test(dataProvider = "getflightDetails")
	public void SelectFlightDetails(String Type, String passenger,String DepFrom,String DepMonth,
			String DepDay,String ArrivingIn, String RetMonth, String RetDay,
			String ServiceClass,String Airline)
	{
		ff.FlightFinder(Type, passenger, DepFrom, DepMonth, DepDay, ArrivingIn, RetMonth, RetDay, ServiceClass, Airline);
	}
	
	@DataProvider
	public Iterator<Object[]> getflightDetails()
	{
		ArrayList<Object[]> data=FlightFinderUtil.getFlightDataFromExcel();
		
	
		return data.iterator();
}
	
	
	
}
