package RunnerPackage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/hardeepkainth/Desktop/FreeCRMBDDFramework/src/main/java/Features/login.feature",
        glue = {"stepDefinitions"},
        monochrome = true,// Display output in readable format
        plugin = {"pretty", "html:target/HtmlReports","json:json_output/cucumber.json"},
        dryRun = false
        // it will which test case is failed
        // feature where you have your feature file
        // glue means where is step definition file is
        //Format = html or petty format
)

public class TestRunner1 {


}
