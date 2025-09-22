package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/PracticeTestAutomationLogin.feature",
glue = "StepDefinitions",
dryRun = false,
plugin = {"pretty","html:Reports/TestReports.html"})
public class TestRunnerClass {
}
