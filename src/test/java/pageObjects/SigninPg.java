package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninPg {
	public WebDriver driver;
	
	public SigninPg(WebDriver driver)
	{
		this.driver=driver;
	}

	By signinCreateAccountEmail=By.xpath("//input[@id='email_create']");
	By signinCreateAccountButton=By.cssSelector("button[id='SubmitCreate']");
	By signinExistingCustomerEmail=By.xpath("//input[@id='email']");
	By signinExistingCustomerPassword=By.xpath("//input[@id='passwd']");
	By signinExistingCustomerSigninButton=By.id("SubmitLogin");
	
	


	public WebElement getSigninCreateAccountEmail()
	{
		return driver.findElement(signinCreateAccountEmail);
	}
	
	public WebElement getSigninCreateAccountButton()
	{
		return driver.findElement(signinCreateAccountButton);
	}
	
	public WebElement getSigninExistingCustomerEmail()
	{
		return driver.findElement(signinExistingCustomerEmail);
	}
	public WebElement getSigninExistingCustomerPassword()
	{
		return driver.findElement(signinExistingCustomerPassword);
	}
	public WebElement getSigninExistingCustomerSigninButton()
	{
		return driver.findElement(signinExistingCustomerSigninButton);
	}
	
	
}
