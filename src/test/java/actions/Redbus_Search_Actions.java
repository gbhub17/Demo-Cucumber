package actions;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

import elements.Redbus_Search_Elements;
import steps.Common_Steps;

public class Redbus_Search_Actions {
	
	
	private WebDriver driver;
	Redbus_Search_Elements redbus_search_elements;
	public Redbus_Search_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		redbus_search_elements = new Redbus_Search_Elements(driver);
	}
	
	public void verifyBusNumber(String givenNo) {
		String busNo = redbus_search_elements.resNo.getText();
		String strNumber = busNo.split(" ")[0];
		int intActualNum = Integer.parseInt(strNumber);
		int intGivenNum = Integer.parseInt(givenNo);
		
		 if(!(intActualNum>intGivenNum))
			    {
			    	fail("Actual bus number: "+intActualNum+" is less than given number: "+intGivenNum);
			    }
	}

}
