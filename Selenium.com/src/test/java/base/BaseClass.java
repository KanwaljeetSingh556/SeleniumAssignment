package base;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

import utilities.DriverSetUp;
import objects.Login;
import objects.OpenCart;

public class BaseClass 
{

	  
	
	 
	
	public static void main(String[] args) throws InterruptedException
	
	{

		
	    WebDriver driver = new DriverSetUp().GetDriver();
	    OpenCart oc = new OpenCart(driver); 
	    oc.navigateOpenCart();
		System.out.println("executed");
		Login l = new Login(driver);
		l.navigateToLogin();
		l.FillDetails();
		System.out.println("executed");
		
		
	}

}
