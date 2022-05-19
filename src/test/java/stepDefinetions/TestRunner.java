package stepDefinetions;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false, // check that all steps are implemented
        features = "src/test/resources/Features", // Define the loctaion of the feature file
        glue = "stepDefinetions", // Define the location of the step implementations of the feature files
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", // Used to customize the How the output result is displayed
        monochrome = true,
        tags =  "@Test" // Run only the test cases or feature file with the given tag
)
public class TestRunner   {

}
