package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestAutomationLogoSteps {

    WebDriver driver;
    HomePage homePage;
    @Given("I launch chrome browser")
    public void iLaunchChromeBrowser() {
    driver = new ChromeDriver();
    }

    @When("I open URL {string}")
    public void iOpenPracticeTestAutomationLoginPage(String url) {
    driver.get(url);
    }

    @Then("I verify logo is present on login page")
    public void iVerifyLogoIsPresentOnLoginPage() {
    boolean logo_display=homePage.logoDisplayStatus();
    Assert.assertTrue(logo_display);
    }

    @And("I close browser")
    public void iCloseBrowser() {
        driver.close();
    }
}
