package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v136.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver homeDriver;
    public HomePage(WebDriver driver)
    {
        homeDriver=driver;
        PageFactory.initElements(homeDriver,this);
    }
    @FindBy(xpath = "//img[@alt='Practice Test Automation']") private WebElement homePageLogo;

    public boolean logoDisplayStatus()
    {
        return homePageLogo.isDisplayed();
    }
    public String getHomePageTitle()
    {
        return homeDriver.getTitle();
    }
}
