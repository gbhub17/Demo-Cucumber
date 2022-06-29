package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Tagged_Hooks {
	
	
private WebDriver driver;
	
	public Tagged_Hooks(Common_Steps common_steps) {
		driver = common_steps.getDriver();
	}
	@Before(value = "@Priority0", order = 0)
	public void setCookies() {
		System.out.println("Scenario specific hook - setCookies executed");
	}
	
	@After(value = "@Priority0", order = 0)
	public void testAfterHook() {
		System.out.println("Scenario specific hook - testAfterHook executed");
	}
	

}
