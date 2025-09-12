package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestAutomationLogoSteps {

    WebDriver driver;
    @Given("I launch chrome browser")
    public void iLaunchChromeBrowser() {
    driver = new ChromeDriver();
    }

    @When("I open Practice Test Automation login page")
    public void iOpenPracticeTestAutomationLoginPage() {
    driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @Then("I verify logo is present on login page")
    public void iVerifyLogoIsPresentOnLoginPage() {
    boolean logo_display=driver.findElement(By.xpath("//img[@alt='Practice Test Automation']")).isDisplayed();
    Assert.assertTrue(logo_display);
    }

    @And("I close browser")
    public void iCloseBrowser() {
        driver.close();
    }
}
