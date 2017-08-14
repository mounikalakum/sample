package assertandverif;
//assert class can be found in testng and there is no verify in testng
	@Test
public class Assertandverify {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Rothschild_family");
		
		String heading= driver.findElement(By.id("firstHeading")).getText();
		// assert will stop the execution if it fails.
		Assert.assertEquals(heading, "Rothschild family");
		driver.close();
		}
		
		
	}


