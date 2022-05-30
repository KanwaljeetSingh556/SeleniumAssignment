package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverSetUp 
{
	ReadPropertiesFile read = new ReadPropertiesFile("Properties/assignment.properties");
	WebDriver  driver;
	
	
	public WebDriver GetDriver()
	{
	  if(read.ReadData("Browser").equalsIgnoreCase("Chrome")) {
		   driver = WebDriverManager.chromedriver().create();
		
	  }
	  
	  else if(read.ReadData("Browser").equalsIgnoreCase("edge")) {
		   driver = WebDriverManager.edgedriver().create();
	  }
	  
	  else {
		    driver =  WebDriverManager.chromedriver().create(); 
	  }
	return driver;
	
	}
	
	public void GetURL() 
	{
		 driver.get(read.ReadData("URL"));
		 
		
	}
	

	

}
