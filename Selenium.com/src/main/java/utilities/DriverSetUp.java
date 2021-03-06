package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverSetUp 
{
	ReadPropertiesFile read = new ReadPropertiesFile("Properties/assignment.properties");
	WebDriver  driver ;
	
	
	public WebDriver GetDriver()
	{
	  if(read.ReadData("Browser").equalsIgnoreCase("Chrome")) {
		    WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		
	  }
	  
	  else if(read.ReadData("Browser").equalsIgnoreCase("edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  
		   
	  }
	  
	  else
	  {
		  WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
	  }
	return driver;
	
	}
	

	
	
	
	

	

}
