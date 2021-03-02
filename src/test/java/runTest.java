
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", plugin = { "json:target/cucumber.json", "pretty",
        "html:target/cucumber-reports.html" }, publish=true)
public class runTest { }

// Generates report
