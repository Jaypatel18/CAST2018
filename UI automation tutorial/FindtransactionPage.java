package pages;

public class FindtransactionPage extends Page
{
	
	private By selectAccounr dropdown = By.id("accountId");
	private by tranasactionIDField = By.id("criteria.transcationId");
	private By findTranscationByIDButton = By.xpath("//button[@ng-click=\"criteria.serachType = 'ID'");


	public findtransactionPage(webDriver driver)
	
	{
		super(driver);
	}
	
	
	public void selectAccoutn(string accounr iD)
	{
		Selec dropdown = new select (driver.findElement(selectaccount dropwdown));
		dropwdown.selectbyVisibleText(accountId);
		
	}
	
	public void settransactionID (string trasncatioid)
	{
	driver.findelement(tranactionIDfield).sendKeys(tranactioanId);
	}

	public TranscationresultPage clickFindTransactiobyIdbutton()
	{
		driver.findelement(findtrenactioanByIdbutton).click();
		return new trenactionResultPage(driver);
	}
	
	public transcationresultPage findtrenactionbyId(String accountnumber, String TranactionId)
	{
		electAccount(accountNumber);
		setTreanactionID(transcationID);
		return ClickFindTrenactiontIDButton();
	}
	
	 
}