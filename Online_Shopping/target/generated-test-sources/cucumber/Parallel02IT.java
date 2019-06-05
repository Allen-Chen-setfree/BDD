import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/setfree/Documents/project/BDD/Online_Shopping/src/test/java/com/automationpractice/features/Register_correct.feature"},
plugin = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html"},
monochrome = false,
 tags = {"@UnitTest"}, glue = { "com.automationpractice.stepdefs" })
public class Parallel02IT {
}
