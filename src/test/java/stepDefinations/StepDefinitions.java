package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.CreateAccountPg;
import pageObjects.DressesPg;
import pageObjects.HomePg;
import pageObjects.MyAccountPg;
import pageObjects.SigninPg;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Cucumber.HMRC.Base;

@RunWith(Cucumber.class)
public class StepDefinitions {
		
	public WebDriver driver;
	HomePg h;
	SigninPg sp;
	CreateAccountPg ca;
	MyAccountPg ma;
	DressesPg d;

    @Given("^User on landing page$")
    public void user_on_landing_page() throws Throwable {
    	driver = Base.getDriver();
    }
    @When("^User click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
       	h = new HomePg (driver);
    	h.getHomeSigninButton().click();
    	
    	Thread.sleep(3000);

    }

    @Then("^Enter email address \"([^\"]*)\"$")
    public void enter_email_address_something(String strArg1) throws Throwable {
    	sp = new SigninPg(driver);
    	sp.getSigninCreateAccountEmail().sendKeys(strArg1);
    
    }
    
    @Then("^Click on Create an account button$")
    public void click_on_create_an_account_button() throws Throwable {

    	sp = new SigninPg(driver);
    	sp.getSigninCreateAccountButton().click();
    	
    }

    @Then("^Enter First name \"([^\"]*)\" and Last name \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_first_name_something_and_last_name_something_and_password_something(String strArg1, String strArg2, String strArg3) throws Throwable {

    	ca = new CreateAccountPg (driver);
    	ca.getCreateAccountFirstName().sendKeys(strArg1);
    	ca.getCreateAccountLastName().sendKeys(strArg2);
    	ca.getCreateAccountPassword().sendKeys(strArg3);

    }

    @Then("^Enter Address \"([^\"]*)\" and City \"([^\"]*)\"$")
    public void enter_address_something_and_city_something(String strArg1, String strArg2) throws Throwable {

    	ca.getCreateAccountAddress().sendKeys(strArg1);
    	ca.getCreateAccountCity().sendKeys(strArg2);

    }

    @Then("^Select State \"([^\"]*)\"$")
    public void select_state_something(String strArg1) throws Throwable {

    	Select dropdown = new Select(ca.getCreateAccountStateDropdown());
    	dropdown.selectByVisibleText(strArg1);

    }

    @Then("^Enter Postal code \"([^\"]*)\" and Mobile phone \"([^\"]*)\"$")
    public void enter_postal_code_something_and_mobile_phone_something(String strArg1, String strArg2) throws Throwable {

    	ca.getCreateAccountPostcode().sendKeys(strArg1);
    	ca.getCreateAccountMobile().sendKeys(strArg2);

    }
    @Then("^Click on Register$")
    public void click_on_register() throws Throwable {

    	ca.getCreateAccountRegisterButton().click();
        }
    
    @Then("^Verify user logged in and landed on my account page$")
    public void verify_user_logged_in_and_landed_on_my_account_page() throws Throwable {

    	Assert.assertEquals(driver.findElement(By.xpath("//p[@class='info-account']")).getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    	
    }
    @Then("^Click on Signout$")
    public void click_on_signout() throws Throwable {

    	ma = new MyAccountPg (driver);
    	ma.getMyaccountSignout().click();
    }
    
    @Then("^Enter existing customer email id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_existing_customer_email_id_something_and_password_something(String strArg1, String strArg2) throws Throwable {

    	sp = new SigninPg (driver);
    	sp.getSigninExistingCustomerEmail().sendKeys(strArg1);
    	sp.getSigninExistingCustomerPassword().sendKeys(strArg2);
    	    	
    }
    
    @Then("^Click on sign in button in already registered box$")
    public void click_on_sign_in_button_in_already_registered_box() throws Throwable {

    	sp.getSigninExistingCustomerSigninButton().click();
    }

    @Then("^Find most expensive dress and add it to the cart$")
    public void find_most_expensive_dress_and_add_it_to_the_cart() throws Throwable {

    	d = new DressesPg(driver);
    	
    	h = new HomePg(driver);
    	
    	h.getHomeLogoButton().click();
    	h.getHomeDressesButton().click();
    	
    	List<WebElement> productPrice = driver.findElements(By.xpath("//*[@itemprop='price']"));
    	
    	
    	for (int i=0;i<productPrice.size();i++)
    		
    	{
    		String price=productPrice.get(i).getText();
    		
    		System.out.println(price);
    		
    	}
    		
    	/*{
    		double price=Double.parseDouble(productPrice.get(i).getText().substring(1));
    		
    		System.out.println(price);
    		
    	}*/
    	
    	/*d.getDressesListViewButton().click();
    	d.getDressesPd2AddToCart().click();
    	d.getDressesContinueShopping().click();
    	
    	
    	/*Select dropdown = new Select(ca.getCreateAccountStateDropdown());
    	dropdown.selectByVisibleText(strArg1);*/
    	
    	    	

    }
    
    @Then("^Verify the item is still in the cart$")
    public void verify_the_item_is_still_in_the_cart() throws Throwable {
    	d.getDressesViewShpCrt().click();
    	
    	Assert.assertEquals(driver.findElement(By.xpath("//span[@class='heading-counter']")).getText(), "Your shopping cart contains: 1 Product");
    	//System.out.println(driver.findElement(By.xpath("//h1[@id='cart_title']")).getText());
    }
}