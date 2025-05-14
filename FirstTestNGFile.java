package FirstTestNG Pacakage;

import org.testng.annotations.Test;

Run All
public class FirstTestNGFile {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	public WebDriver driver;
	@Test(priority = 4)
	Run |Debug
  public void Homepage() {
		System.out.println("Launching Chrome Browser");
		driver =new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle="Welcome to Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		driver.close();
  }
}
@Test(priority = 1)
Run |Debug
public void A_test() {
	Assert.fail();
	System.out.println("Welcome to Edureka_A");
}
@Test(priority = 2)
Run |Debug
public void B_test() {
	Assert.assertTrue(true);
	System.out.println("Welcome to Edureka_B");
	
}

@Test(priority = 3)
Run |Debug
public void C_test() {
	throw new SkipExpectation("Skipping C_test");

	System.out.println("Welcome to Edureka_C");
}