//ws automation

package Services;

public class TransactionServicesTest
{
	@Test
	public void testFindByDate()
	{
		String url = String.format(Endpoints.GET_TRANSACTION_BY_DATE_FORMAT, "12345", "07-30-2018");
		
		ValidatabaleResponse response = given().accept(contentType.JSON).get(url).then();
		response.log().all();
		
		response.statusCode(200);
		//hamcrest
		response.body("size()", is(1));
		response.body("id[0]", is(14143));
		response.body("amount[0]", is(1000.0f));
		response.body("type[0]", is("Debit"));
		response.body("description[0]", is("Bill Payment to Bank of America Visa"));
		response.body("date[0]", containsString("2018-07-30"));
		response.body("accountId[0]", is(12345));
		
	}
}