package firstcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, glue="stepdefinition", features="src\\test\\resources\\firstcucumber", monochrome=true)
public class RunCucumberTest {
}