package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	 
	
    @Given("^User is on Net Banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable {
        System.out.println("GIVEN navigated to landing page");
    }

   /* @When("^User login into application using username and password$")
    public void user_login_into_application_using_username_and_password() throws Throwable {
    	 System.out.println("When loged in successfullye");
    } */
    
    @When("^User login into application using \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_using_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("When loged in successfullye with user define credentials: " + strArg1 + ": " + strArg2);
    } 

    @Then("^Home page is papulated$")
    public void home_page_is_papulated() throws Throwable {
    	 System.out.println("Then validated home page");
    }

    
    @And("^Cards displayed \"([^\"]*)\"$")
    public void cards_displayed_something(String strArg1) throws Throwable {
    	System.out.println("Cards displayed: " + strArg1);
    }

}