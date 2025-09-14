package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/subhasmitamajumdar/IdeaProjects/CucumberBDDFrameworkDemo/Features/PracticeTestAutomationLogin.feature",
glue = "StepDefinitions",
dryRun = false,
plugin = {"pretty","html:TestReports"})
public class TestRunnerClass {
}
