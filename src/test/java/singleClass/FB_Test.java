package singleClass;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Test {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"/Users/gbhowmik/eclipse-workspace/cucumber1/Driver/chromedriver");
		driver = new ChromeDriver();
		try
		{
			
			driver.get("https://www.facebook.com/");
			String text1 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]")).getText();
		    String text2 = "Facebook helps you connect and share with the people in your life.";
		    if(!text1.equals(text2))
			    {
			    	fail("Not correct page, the text says: "+text1+" not: "+text2);
			    }
		}
		finally {
			driver.quit();
		}
	    

	}

}
