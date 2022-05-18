package webUI.stepDefinetions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import utilities.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false, // check that all steps are implemented
        features = "src/test/resources/Features", // Define the loctaion of the feature file
//        glue = "stepDefinetions", // Define the location of the step implementations of the feature files
        plugin = "pretty", // Used to customize the How the output result is displayed
        tags = "@TC1" // Run only the test cases or feature file with the given tag
)
public class TestRunner extends TestBase {
}
