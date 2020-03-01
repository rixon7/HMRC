package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPg {
	public WebDriver driver;
	
	public MyAccountPg(WebDriver driver)
	{
		this.driver=driver;
	}

	By myaccountSignout=By.xpath("//a[@class='logout']");
	


	public WebElement getMyaccountSignout()
	{
		return driver.findElement(myaccountSignout);
	}
	
		
}
