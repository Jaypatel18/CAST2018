//under cucumber package
// class name cucumer test options

//you need to run this file


package cucumber;

@RunWith(Cucumber.class)
@Cucumberoptions(
glue = "cucumber.stepdefs",
features = "src/test/java/cucumber/features",
plugin = "pretty"
)

public class Cucumbertestoptions
{
	@BeforeClass
	public static void setUp()
	{
		UITests.launchApplications();
	}
	
	@AfterClass
	public static void tearDown()
	{
		UITests.shutDown();
	}
}