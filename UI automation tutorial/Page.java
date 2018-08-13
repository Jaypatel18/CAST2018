//abstract page that are common to all the pages in the application

package pages;

import org.openqa.selenium.WebDriver;
import components.LoginComponents;

public class Page{
	protected webDriver driver;
	
	public Page(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void login(String username, String password)
	{
		new Logincomponent(driver).login(username, password);
	}
	
	public FindTransactionPage navigateToFindTrans()
	{
		return new accountServicesmenu(driver).clickFindTranactionLink();
	}
}