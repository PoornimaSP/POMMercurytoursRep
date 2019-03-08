package mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mercury.base.base;

public class RegistrationPage extends base {
	
	@FindBy(name="email")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name="register")
	WebElement submit;
	
	@FindBy(xpath="//b[contains(text(),'Note: Your user name is')]")
    WebElement conText;
	
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver,this);
			}
	

	public String enterRegdetails(String username2, String password2, String conpassword) {
		// TODO Auto-generated method stub
		Username.sendKeys(username2);
		Password.sendKeys(password2);
		confirmpassword.sendKeys(conpassword);
		submit.click();
		return conText.getText();
		
	}

	
}
