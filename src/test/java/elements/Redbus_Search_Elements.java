package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbus_Search_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[contains(@class,'bus')]") public WebElement resNo;
	
	
	public Redbus_Search_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
