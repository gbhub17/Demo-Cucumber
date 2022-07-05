package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {

	WebDriver driver;

	@Before(order = 1)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver");
		driver = new ChromeDriver();
		System.out.println("Global before executed");
	}

	@After(order = 1)
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(1000);
		System.out.println("Global after executed");
	}

	public WebDriver getDriver() {
		return driver;
	}

}
