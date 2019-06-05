import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/setfree/Documents/project/BDD/Online_Shopping/src/test/java/com/automationpractice/features/Add_Item_To_Cart.feature"},
plugin = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html"},
monochrome = false,
 tags = {"@FuctionTest"}, glue = { "com.automationpractice.stepdefs" })
public class Parallel01IT {
}
