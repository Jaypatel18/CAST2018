//cucumber.stepdefs package
//class transcation step defs

package cucmer.stepdefs

public class TransactionstepDefs extedns UITests
{
	
	String accountId, transactionId;
	
	@Given("my account id is (.*)")
	public static setAccountId(String accountId)
	{
		this.accountId = accountId;
	}
	
	@Given("my transaction id is (.*)")
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}
	
	@When("I search for transaction by id")
	public void searchById()
	{
		FindTransactionPage searchPage = homepage.naigationToFindTransaction();
		TransactionsResultspage resultsPage = searchPage.findTransactionsById(accountId, transactionId);
	}
	
	@Then("transactions are as follows")
	public void verifyTransactions(list<Transactions> expectedTransactions)
	{
		assertEquals("Transactions do not match", expectedTransactions, resultsPage.getTransactions());
	}
	
}

