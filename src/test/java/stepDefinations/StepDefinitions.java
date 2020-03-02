package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.CartSummaryPg;
import pageObjects.CreateAccountPg;
import pageObjects.DressesPg;
import pageObjects.HomePg;
import pageObjects.MyAccountPg;
import pageObjects.SigninPg;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
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
	CartSummaryPg cs;

    @Given("^User on landing page$")
    public void user_on_landing_page() throws Throwable {
    	driver = Base.getDriver();
    }
    
    @When("^User click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
       	h = new HomePg (driver);
    	h.getHomeSigninButton().click();
    }

  @Then("^user enters \"([^\"]*)\"$")
public void user_enters(String emailId) throws Throwable {
	String d =RandomStringUtils.randomNumeric(2);
	sp = new SigninPg(driver);
	sp.getSigninCreateAccountEmail().sendKeys(d +emailId);

}
    
    @Then("^Click on Create an account button$")
    public void click_on_create_an_account_button() throws Throwable {

    	sp = new SigninPg(driver);
    	sp.getSigninCreateAccountButton().click();
    	
    }
  
    @Then("^Select State \"([^\"]*)\"$")
    public void select_state_something(String strArg1) throws Throwable {

    	Select dropdown = new Select(ca.getCreateAccountStateDropdown());
    	dropdown.selectByVisibleText(strArg1);

    }
    
    @Then("^Click on Register$")
    public void click_on_register() throws Throwable {

    	ca.getCreateAccountRegisterButton().click();
        }
    
    @Then("^Verify user logged in and landed on my account page$")
    public void verify_user_logged_in_and_landed_on_my_account_page() throws Throwable {
    	ma = new MyAccountPg (driver);
    	
    	Assert.assertEquals(ma.getMyaccountWelcomeText().getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    	
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

    @Then("^user click on dresses menu$")
    public void user_click_on_dresses_menu() throws Throwable {

    	d = new DressesPg(driver);
    	
    	h = new HomePg(driver);
    	
    	h.getHomeLogoButton().click();
    	h.getHomeDressesButton().click();
    	
    }

    @Then("^user select listview$")
    public void user_select_listview() throws Throwable {

    	d = new DressesPg(driver);
    	
    	d.getDressesListViewButton().click();
    	
    }

    @Then("^user select Highest Price from the dropdown$")
    public void user_select_highest_price_from_the_dropdown() throws Throwable {

    	d = new DressesPg(driver);

    	Select dropdown = new Select(d.getDressesDropdownButton());
    	dropdown.selectByVisibleText("Price: Highest first");
    	

    }
    @Then("^Find most expensive dress and add it to the cart$")
    public void find_most_expensive_dress_and_add_it_to_the_cart() throws Throwable {

    	d = new DressesPg(driver);
    	
    	d.getDressesPd2AddToCart().click();
    	d.getDressesContinueShopping().click();
    	

    }
    
    @Then("^Verify the item is still in the cart$")
    public void verify_the_item_is_still_in_the_cart() throws Throwable {
    	
    	cs = new CartSummaryPg(driver);
    	d.getDressesViewShpCrt().click();
    	
    	Assert.assertEquals(cs.getCartSmryHdrTxt().getText(), "Your shopping cart contains: 1 Product");
    	
    }
    
 
@Then("^Enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
public void enter(String firstname, String lastname, String password, String address, String cityName, String postCode, String Mobile) throws Throwable {
	ca = new CreateAccountPg (driver);
	ca.getCreateAccountFirstName().sendKeys(firstname);
	ca.getCreateAccountLastName().sendKeys(lastname);
	ca.getCreateAccountPassword().sendKeys(password);
	ca.getCreateAccountAddress().sendKeys(address);
	ca.getCreateAccountCity().sendKeys(cityName);
	ca.getCreateAccountPostcode().sendKeys(postCode);
	ca.getCreateAccountMobile().sendKeys(Mobile);
	
}

}