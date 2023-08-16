package StepDef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.R.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class StepDefintion extends BaseClass {
	public WebDriver driver;

	public WebDriverWait wait;

	// Common hooks class to execute before the Scenario is initiated to execute
	@Before
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://evernote.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	// Common hooks class to execute after the Scenario execution is completed
	@After
	public void browserClose() {
		driver.close();
	}


	@When("user can click Login button")
	public void user_can_click_Login_button()
	{

		//WebElement logInButton = driver.findElement(By.xpath("//a[text()=\"Log In\"]"));
		WebElement objLoginButton = FindWebElement("//a[text()=\"Log In\"]");
		clickWebElement(objLoginButton);

	}

	@When("user can enter the username as {string}")
	public void user_can_enter_the_username_as(String strUsernameValue) throws InterruptedException {

		//WebElement usernameEvernote = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		WebElement objUsernameField = FindWebElement("//input[@id=\"username\"]");
		sendingTheInputValue(objUsernameField, strUsernameValue);
		Thread.sleep(5000);
		//WebElement contiune = driver.findElement(By.xpath("//input[@id=\"loginButton\"]"));
		WebElement objContinueButton = FindWebElement("//input[@id=\"loginButton\"]");
		clickWebElement(objContinueButton);
		Thread.sleep(5000);

	}

	@When("user can enter the password as {string}")
	public void user_can_enter_the_password_as(String strPasswordValue) throws Exception {

		//WebElement passwordEvernote = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		WebElement objPasswordField = FindWebElement("//input[@id=\"password\"]");
		sendingTheInputValue(objPasswordField, strPasswordValue);
		Thread.sleep(5000);

	}

	@When("user can click the login button")
	public void user_can_click_the_login_button() {
		//WebElement loginButtonToNextPage = driver.findElement(By.xpath("//input[@id=\"loginButton\"]"));
		WebElement objLoginButtonAfterPassword = FindWebElement("//input[@id=\"loginButton\"]");
		clickWebElement(objLoginButtonAfterPassword);
	}

	@Then("The home page will be displayed")
	public void the_home_page_will_be_displayed() {
		
	//	String actionMenuAttibute = driver.findElement(By.xpath("//button[@id=\"qa-CREATE_NOTE\"]"))
			//	.getAttribute("aria-controls");
		WebElement objActionMenuAttribute = FindWebElement("//button[@id=\"qa-CREATE_NOTE\"]");
		String strHomepageActionMenuText= objActionMenuAttribute.getText();
		assertEquals(strHomepageActionMenuText, "ActionMenu");

	}

	@Then("The forgot password will be displayed")
	public void the_forgot_password_will_be_displayed() {
		//WebElement passwordRest = driver.findElement(By.xpath("//div[@class='page-header']"));
		WebElement objPasswordRest = FindWebElement("//div[@class='page-header']");

		String textfromWebPage = getFromWebPage(objPasswordRest);
		assertEquals(textfromWebPage, "Password Reset Required");

	}

	public WebElement FindWebElement(String strxPathIdentifier)
	{
				WebElement returnWebElement = driver.findElement(By.xpath(strxPathIdentifier));
				return returnWebElement;

	}
}
