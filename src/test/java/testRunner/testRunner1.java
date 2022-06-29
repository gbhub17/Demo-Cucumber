package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "features" },
		glue = {"steps" },
		dryRun = false,
//		strict = true,
		plugin = {"pretty", "html:target/Destination/report.html"},
		monochrome = true,
		tags = "@Priority0 or @Priority1 or @Priority2 or @Priority3"
//		tags = "@Priority0"
		)

public class testRunner1 {

}
