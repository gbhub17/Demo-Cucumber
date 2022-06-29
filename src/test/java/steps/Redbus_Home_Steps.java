package steps;

import actions.Common_Actions;
import actions.Redbus_Home_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Redbus_Home_Steps {
	
	Common_Actions common_actions;
	Redbus_Home_Actions redbus_home_actions;
	
	public Redbus_Home_Steps(Common_Actions common_actions, Redbus_Home_Actions redbus_home_actions) {
		this.common_actions = common_actions;
		this.redbus_home_actions = redbus_home_actions;
	}
	
	
	@Given("I have landed on redbus page")
	public void pageLand() {
	    common_actions.goToUrl("https://www.redbus.in/");
	}

	@When("I enter source as {string}")
	public void sourceFill(String string) {
	    redbus_home_actions.enterSourceLocation(string);
	}

	@When("I enter destination as {string}")
	public void destinationFill(String string) {
	    redbus_home_actions.enterDestinationLocation(string);
	}

	@When("I enter journey date as'{string}'")
	public void dateSelection(String string) {
		redbus_home_actions.selectCalendar(string);
		
	}
	
	@Then("I click on search button")
	public void i_click_on_search_button() {
	   redbus_home_actions.clickSearch();
	}
	

}
