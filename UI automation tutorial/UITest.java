//chrome driver, sys variable, letting web know we going to use and goes to the url
package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Links;

public class UITest{
	priate statis WebDriver driver;
	
	public static void launchapplication(){
		System.setproperty("webdriver.chrome.driver", "resoruces/chromedriver");
		driver= new Chromedriver();
		driver.get(Links.HOME);
		login();
	}
	
	@AfterClass
	public static void shutdown()
	{
		driver.quit();
	}
	
	public static void login()
	{
		login("john","demo");
	}
	
	public 
}