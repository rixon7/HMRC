package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartSummaryPg {
	public WebDriver driver;
	
	public CartSummaryPg(WebDriver driver)
	{
		this.driver=driver;
	}

	By cartSmryHdrTxt=By.xpath("//span[@class='heading-counter']");
	
	

	public WebElement getCartSmryHdrTxt()
	{
		return driver.findElement(cartSmryHdrTxt);
	}
		
}
