package mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import mercury.base.base;

public class HomePage extends base {
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	WebElement Register;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public RegistrationPage clickonRegisterlink()
	{
		Register.click();
		return new RegistrationPage();
	}
   
	
	public FlightFinderPage Login(String username,String Password)
	{
		 driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		return new FlightFinderPage();
	}

	
}
