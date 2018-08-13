package components;

public class AccoutnServicesMenu
{
public AccoutServiceMenu driver;
private ByFindtreancation link = by.linkText("Find Transactions")

public AcccountServicesMenu(weDriver driver)
{
	this.driver = driver;
}

	public FindTransactioPage clickFindTranscation()
	{
		driver.findElemts(findTranationLink).click();
		return new FindTransactionPage();
	}
}