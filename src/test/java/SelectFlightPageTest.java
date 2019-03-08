import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mercury.base.base;
import mercury.pages.FlightFinderPage;
import mercury.pages.HomePage;
import mercury.pages.RegistrationPage;
import mercury.pages.SelectFlightPage;

public class SelectFlightPageTest extends base {
	
	HomePage home;
	RegistrationPage Reg;
	FlightFinderPage ff;
	SelectFlightPage sfp;
	
	@BeforeMethod
	public void setup()
	{
		initialization();		
		home= new HomePage();
		ff=home.Login("q","q");
		sfp=ff.FlightFinder("R", "2", "London", "January", "26", "Sydney", "March", "27", "F", "No Preference");
		
		
	}

	@Test
	public void selectcheapestFlightTest()
	{
		sfp.selectcheapestDeartureFlight();
	}
}
