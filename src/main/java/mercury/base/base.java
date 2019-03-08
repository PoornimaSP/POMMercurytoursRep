package mercury.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public base() 
	{
		
		try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\welcome\\workspace\\Mercurytoursartifacts\\src\\main\\java\\mercury\\config\\configuration.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\uday\\ChromeDriver\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
