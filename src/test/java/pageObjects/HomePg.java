package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePg {
	public WebDriver driver;
	
	public HomePg(WebDriver driver)
	{
		this.driver=driver;
	}

	By homeSigninButton=By.cssSelector("a[class='login']");
	By homeLogoButton=By.xpath("//img[@class='logo img-responsive']");
	By homeDressesButton=By.xpath("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]");
	By homeListViewButton=By.xpath("//i[@class='icon-th-list']");
	


	public WebElement getHomeSigninButton()
	{
		return driver.findElement(homeSigninButton);
	}
	public WebElement getHomeLogoButton()
	{
		return driver.findElement(homeLogoButton);
	}
	public WebElement getHomeDressesButton()
	{
		return driver.findElement(homeDressesButton);
	}
	public WebElement getHomeListViewButton()
	{
		return driver.findElement(homeListViewButton);
	}
	
}
