import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/setfree/Documents/project/BDD/Online_Shopping/src/test/java/com/automationpractice/features/Register_incorrect.feature"},
plugin = {"json:target/cucumber-parallel/3.json", "html:target/cucumber-parallel/3.html"},
monochrome = false,
 tags = {"@FuctionTest"}, glue = { "com.automationpractice.stepdefs" })
public class Parallel03IT {
}
