package mercury.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import mercury.base.base;

public class SelectFlightPage extends base{
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	WebElement reserveFlghtbtn;
	

public  BookAFlight selectcheapestDeartureFlight()
{
	driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$360$270$5:03']"));
	driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$630$270$12:23']"));
	reserveFlghtbtn.click();
	return new BookAFlight();
	
}
}
