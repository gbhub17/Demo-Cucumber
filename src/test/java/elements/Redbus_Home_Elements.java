package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbus_Home_Elements {
	
	WebDriver driver;
	@FindBy(xpath = "//input[@data-message='Please enter a source city']") public WebElement source;
	@FindBy(xpath = "//input[@data-message='Please enter a destination city']") public WebElement destination;
	@FindBy(xpath = "//label[text()='Date']") public WebElement calendar;
	@FindBy(xpath = "//button[@id='search_btn']") public WebElement search_button;
	
	public Redbus_Home_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
