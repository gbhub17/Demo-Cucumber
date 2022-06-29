package steps;

import actions.Common_Actions;
import actions.Redbus_Search_Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Redbus_Search_Steps {
	
	Common_Actions common_actions;
	Redbus_Search_Actions redbus_search_actions;
	
	public Redbus_Search_Steps(Common_Actions common_actions, Redbus_Search_Actions redbus_search_actions) {
		this.common_actions = common_actions;
		this.redbus_search_actions = redbus_search_actions;
	}
	
	@Given("I navigate to bus search page")
	public void i_navigate_to_bus_search_page() {
		common_actions.goToUrl("https://www.redbus.in/search?fromCityName=Siliguri&fromCityId=74694&toCityName=Esplanade%2C%20Kolkata&toCityId=75493&onward=30-Jun-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Anyhttps://www.redbus.in/search?fromCityName=Siliguri&fromCityId=74694&toCityName=Esplanade%2C%20Kolkata&toCityId=75493&onward=30-Jun-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
	}
	@Then("I check page title is correct")
	public void i_check_page_title_is_correct(DataTable dataTable) {
		String title = dataTable.cell(1, 0);
		common_actions.verifyTitile(title);
		
	}
	
	@Then("I verify if number of buses greater than {string}")
	public void i_verify_if_number_of_buses_greater_than(String busNo) {
		redbus_search_actions.verifyBusNumber(busNo);
	}

}
