package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPg {
	public WebDriver driver;
	
	public CreateAccountPg(WebDriver driver)
	{
		this.driver=driver;
	}

	By createAccountFirstName=By.id("customer_firstname");
	By createAccountLastName=By.id("customer_lastname");
	By createAccountPassword=By.id("passwd");
	By createAccountAddress=By.id("address1");
	By createAccountCity=By.id("city");
	By createAccountPostcode=By.id("postcode");
	By createAccountMobile=By.id("phone_mobile");
	By createAccountRegisterButton=By.id("submitAccount");
	By createAccountStateDropdown=By.id("id_state");
	
	


	public WebElement getCreateAccountFirstName()
	{
		return driver.findElement(createAccountFirstName);
	}
	
	public WebElement getCreateAccountLastName()
	{
		return driver.findElement(createAccountLastName);
	}
	public WebElement getCreateAccountPassword()
	{
		return driver.findElement(createAccountPassword);
	}
	public WebElement getCreateAccountAddress()
	{
		return driver.findElement(createAccountAddress);
	}
	public WebElement getCreateAccountCity()
	{
		return driver.findElement(createAccountCity);
	}
	public WebElement getCreateAccountPostcode()
	{
		return driver.findElement(createAccountPostcode);
	}
	public WebElement getCreateAccountMobile()
	{
		return driver.findElement(createAccountMobile);
	}
	public WebElement getCreateAccountRegisterButton()
	{
		return driver.findElement(createAccountRegisterButton);
	}
	
	public WebElement getCreateAccountStateDropdown()
	{
		return driver.findElement(createAccountStateDropdown);
	}
	
	
}
