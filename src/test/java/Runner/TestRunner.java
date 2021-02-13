package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/hardeepkainth/Desktop/FreeCRMBDDFramework/src/main/java/Features/login.feature", //the path of the feature files
        glue = {"stepDefinitions"},//the path of the step definition files
        format = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting
//        monochrome = true, //display the console output in a proper readable format
//        strict = true, //it will check if any step is not defined in step definition file
//        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}

        // To generate different types of reports
        // Strict = It will failed any undefined steps check if any step is not properly defined
        , strict = true,
        dryRun = false
        // This means or means both of them
        // For add use use We have to use separate
        // ~ It is called que and used to ignore test case

        // Hooks are used in cucumber to define pre-onditions and post conditions
)

public class TestRunner {


}
