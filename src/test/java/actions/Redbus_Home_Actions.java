package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.Redbus_Home_Elements;
import steps.Common_Steps;

public class Redbus_Home_Actions {
	
	private WebDriver driver;
	Redbus_Home_Elements redbus_home_elements;
	public Redbus_Home_Actions(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
		redbus_home_elements = new Redbus_Home_Elements(driver);
	}
	
	public void enterSourceLocation(String source) {
		redbus_home_elements.source.sendKeys(source);
	}
	
	public void enterDestinationLocation(String destination) {
		redbus_home_elements.destination.sendKeys(destination);
	}
	
	public void selectCalendar(String string) {
		redbus_home_elements.calendar.click();
		driver.findElement(By.xpath("//td[text()='"+string+"']")).click();
	}
	
	public void clickSearch() {
		redbus_home_elements.search_button.click();
	}

}
