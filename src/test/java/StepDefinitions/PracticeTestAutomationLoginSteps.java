package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTestAutomationLoginSteps {
    public WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String page_url) {
        driver.get(page_url);
    }
    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String u_name, String password) {
        loginPage.setUserName(u_name);
        loginPage.setPassword(password);
    }
    @When("Click on Submit")
    public void click_on_submit() {
        loginPage.clickLogInButton();
    }
    @Then("Page title should be {string}")
    public void page_title_should_be(String expected_page_title) {
        Assert.assertEquals(driver.getTitle(),expected_page_title);
    }
    @When("User click on Logout Link")
    public void user_click_on_logout_link() {
        loginPage.clickLogOutButton();
    }
    @Then("close Browser")
    public void close_browser() {
        driver.close();
    }

    @Then("User should not be able to login successfully")
    public void userShouldNotBeAbleToLoginSuccessfully() {
    Assert.assertEquals("Test Login | Practice Test Automation",homePage.getHomePageTitle());
    }
}
