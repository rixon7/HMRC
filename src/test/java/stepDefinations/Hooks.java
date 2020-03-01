package stepDefinations;

import Cucumber.HMRC.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base{

		
	@After("@AccountTest")
	public void Aftervaldiation()
	{
		driver.close();
	}
	/*@After("@LoginTest,@ShoppingCartTest")
	public void AfterSeleniumTest()
	{
		driver.close();
	}
		*/
	
}

