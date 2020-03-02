package stepDefinations;

import Cucumber.HMRC.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks extends Base{

		
	@After()
	public void Aftervaldiation()
	{
		driver.close();
	}
	
}

