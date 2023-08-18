package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    //Driver initiation
    WebDriver driver;
    // Objects identified and used in the Login page
    By objUsernameTextField = By.id("username");
    By objContinueButton = By.id("loginButton");
    By objPasswordTextField = By.id("password");

    By objPageHeader = By.xpath("//div[@class='page-header']");

    //Constructor class
    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    //Find the element and enter the username
    public void enterUsername(String strUsername) {
        driver.findElement(objUsernameTextField).sendKeys(strUsername);
    }
    //Find the element and enter the password
    public void enterPassword(String strPassword){
        driver.findElement(objPasswordTextField).sendKeys(strPassword);
    }
    //Find the element and click
    public void clickLoginButton(){
        driver.findElement(objContinueButton).click();
    }

    //Fetch text from the Browser header and return as String
    public String fetchTextFromLoginPageHeader(){
        String strPageHeaderText = driver.findElement(objPageHeader).getText();
        return strPageHeaderText;

    }
}
