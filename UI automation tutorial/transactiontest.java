package test;

import base.UITests;

public class transactiontest extends UITest()
{
	@Test
	public void testFindTransactionById()
	{
		FindTranscationPage searchpage = homePage.NavigateToFindTranscation();
		TransactoionResultsPage resultspage = searchpage.findTransactionById("12345","14143");
		
		assertEquals("Number of transcations is incorrect", 1, resultspage.getNumberOfTranscations());
		
		Transaction expecteTransaction = new Transcation("07-29-2018", "bill Payment to Bank of America Visa", "$1000.00", "");
		
		Transaction actualTransaction = resultspage.getTransaction().get(0);
		
		assertEquals("Transactions Do not match", expecteTransaction, actualTransaction);
		
	}
}