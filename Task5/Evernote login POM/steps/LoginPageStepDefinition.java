package steps;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.loginPage;
import pages.homePage;

import java.time.Duration;

import static java.lang.Thread.*;

public class LoginPageStepDefinition {
    public static WebDriver driver;
    //Initiate the login page object
    loginPage loginPageObject;
    //Initiate home page object
    homePage homePageObject;

    @Given("Navigate to Login Page in Application")
    public void navigate_to_login_page_in_application() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/Shared/Karthick Files/JARs and Drivers/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.evernote.com/Login.action");

    }

    @When("User can enter {string} and {string}")
    public void userCanEnterAnd(String strUsername, String strPassword) throws InterruptedException {
        loginPageObject = new loginPage(driver);
        loginPageObject.enterUsername(strUsername);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPageObject.clickLoginButton();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        sleep(7000);
        loginPageObject = new loginPage(driver);
        loginPageObject.enterPassword(strPassword);
    }

    @When("user can click the login button")
    public void user_can_click_the_login_button() {
        loginPageObject = new loginPage(driver);
        loginPageObject.clickLoginButton();
    }
    @Then("The home page will be displayed")
    public void the_home_page_will_be_displayed() {
        homePageObject = new homePage(driver);
        boolean boolCreateNoteExist = homePageObject.assertCreateNoteObject();
        Assert.assertTrue(boolCreateNoteExist);

    }

    @But("The forgot password will be displayed")
    public void theForgotPasswordWillBeDisplayed() {
        loginPageObject = new loginPage(driver);
        String strLoginPageHeaderText = loginPageObject.fetchTextFromLoginPageHeader();
        Assert.assertEquals("Password Reset Required",strLoginPageHeaderText);
    }
}
