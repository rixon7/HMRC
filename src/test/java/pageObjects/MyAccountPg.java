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
	By myaccountWelcomeText=By.xpath("//p[@class='info-account']");
	


	public WebElement getMyaccountSignout()
	{
		return driver.findElement(myaccountSignout);
	}
	public WebElement getMyaccountWelcomeText()
	{
		return driver.findElement(myaccountWelcomeText);
	}
	
		
}
