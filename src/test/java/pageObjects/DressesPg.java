package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPg {
	public WebDriver driver;
	
	public DressesPg(WebDriver driver)
	{
		this.driver=driver;
	}

	By dressesListViewButton=By.xpath("//i[@class='icon-th-list']");
	By dressesPd2AddToCart=By.xpath("//li[@class='ajax_block_product last-item-of-tablet-line col-xs-12']//span[contains(text(),'Add to cart')]");
	By dressesContinueShopping=By.xpath("//span[@class='continue btn btn-default button exclusive-medium']//span[1]");
	By dressesViewShpCrt=By.xpath("//b[contains(text(),'Cart')]");
	By dressesDropdownButton=By.xpath("//select[@id='selectProductSort']");
	

	public WebElement getDressesListViewButton()
	{
		return driver.findElement(dressesListViewButton);
	}
	public WebElement getDressesPd2AddToCart()
	{
		return driver.findElement(dressesPd2AddToCart);
	}
	public WebElement getDressesContinueShopping()
	{
		return driver.findElement(dressesContinueShopping);
	}
	public WebElement getDressesViewShpCrt()
	{
		return driver.findElement(dressesViewShpCrt);
	}
	public WebElement getDressesDropdownButton()
	{
		return driver.findElement(dressesDropdownButton);
	}
	
}
