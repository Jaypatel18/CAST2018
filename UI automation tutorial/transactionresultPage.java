package pages;

public class transcationResultpage extends page
{
	private By table = By.id("transactionTable");
	
	public TransactionResultsPage(WebDriver driver)
	{
		super (driver);
		WebDriverwait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(table));
	}
	
	public int getNumberOfTranscations()
	{
		return getRows.size();
	}
	
	pulic List <Transaction> getTransaction()
	{
		List <Transaction> transcation = new ArrayList<Transaction>();
		
		List <webElement>rows = getRows();
		for(WebElement row:row)
		{
			Transcation t = new Transaction();
			List <WebElement> cells = row.findElement(By.tagname("td"));
			
			t.setDate(cells.get(0).getText());
			t.setDescription(cells.get(1).getText());
			t.setDebit(cells.get(2).getText());
			t.setCredit(cells.get(3).getText());
			
			transaction.add(t);
		}
	}
	
	private List<WebElement> getRows()
	{
		return findTable().findElement(By.tagName("tbody").findElements(by.tagName("tr")));
	}
	
	private WebElement findtable()
	{
		return driver.findElement(table);
	}
}