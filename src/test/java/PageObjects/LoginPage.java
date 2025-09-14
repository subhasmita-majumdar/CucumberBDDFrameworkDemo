package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver loginPageDriver;
    public LoginPage(WebDriver driver)
    {
        loginPageDriver=driver;
        PageFactory.initElements(loginPageDriver,this);
    }
    @FindBy(id = "username") WebElement userNameTextBox;
    @FindBy(id = "password") WebElement passwordTextBox;
    @FindBy(id = "submit") WebElement logInButton;
    @FindBy(linkText = "Log out") WebElement logoutButton;

    public void setUserName(String u_name) {
        userNameTextBox.clear();
        userNameTextBox.sendKeys(u_name);
    }

    public void setPassword(String password)
    {
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void clickLogInButton() {
        logInButton.click();
    }

    public void clickLogOutButton() {
        logoutButton.click();
    }
}
