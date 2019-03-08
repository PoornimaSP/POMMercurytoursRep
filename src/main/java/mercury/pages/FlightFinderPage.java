package mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import mercury.base.base;

public class FlightFinderPage extends base{
	
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement RTradiobtn;
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement OWradiobtn;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement PassCount;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement DFrom;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement DOnMoth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement DOnDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElement Destination;
	
	
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement DFromMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElement DFromDay;
	
	@FindBy(xpath="//input[@value='Coach']")
	WebElement EcoClass;
	
	@FindBy(xpath="//input[@value='Business']")
	WebElement BusClass;
	
	@FindBy(xpath="//input[@value='First']")
	WebElement FirstClass;
	
	@FindBy(xpath="	//select[@name='airline']")
	WebElement AirLine;
	
	@FindBy(xpath="	//input[@name='findFlights']")
	WebElement ContinueBtn;
	
	
	
	public FlightFinderPage ()
	{
		PageFactory.initElements(driver,this);
	}
	
	public SelectFlightPage FlightFinder(String Type, String passenger,String DepFrom,String DepMonth,
			String DepDay,String ArrivingIn, String RetMonth, String RetDay,
			String ServiceClass,String Airline)
	{
		if (Type.equals("R"))
			RTradiobtn.click();
		else
			OWradiobtn.click();
		
		PassCount.sendKeys(passenger);
		
		Select DF = new Select(DFrom);
		DF.selectByVisibleText(DepFrom);
		
		Select DM = new Select(DOnMoth);
		DM.selectByVisibleText(DepMonth);
		
		
		int numDepDay = (int) Double.parseDouble(DepDay);
		Select DD = new Select(DOnDay);
		DD.selectByIndex(numDepDay-1);
		
		Select Dest = new Select(Destination);
		Dest.selectByVisibleText(ArrivingIn);
		
		Select RM = new Select(DFromMonth);
		RM.selectByVisibleText(RetMonth);
		
		 
		 int numRetDay = (int) Double.parseDouble(RetDay);
		Select RD = new Select(DFromDay);
		RD.selectByIndex(numRetDay-1);
		
		if (ServiceClass.equals("E"))
			 EcoClass.click();
		else if(ServiceClass.equals("B"))
		BusClass.click();
		else
			FirstClass.click();
		
		Select AL = new Select(AirLine);
		AL.selectByVisibleText(Airline);
		
		ContinueBtn.click();
		
		return new SelectFlightPage();
		
			
	}
	
	
	
	
	
	
	

}
