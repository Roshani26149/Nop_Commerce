package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\HP\\eclipse-workspace\\CucumberProjects\\01\\NOPCommerce_001\\src\\test\\resources\\features\\customer.feature",
		glue="StepDefinations",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty",
				"html:test_output"}
		)

public class TestRun {

}
