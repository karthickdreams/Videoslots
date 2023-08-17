package StepDef;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.R.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefNoteCheck extends BaseClass {
	public WebDriver driver;

	@Before
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://evernote.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@After
	public void browserClose() {
		driver.close();
	}

	@When("user able to login")
	public void user_able_to_login() {

		WebElement objLoginButton = FindWebElement("\"//button[@id=\\\"qa-CREATE_NOTE\\\"]\"");
		clickWebElement(objLoginButton);

	}

	@When("user can click new note")
	public void user_can_click_new_note() {

		WebElement objEvernoteNewNoteField = FindWebElement("//span[text()='Note']");
		clickWebElement(objEvernoteNewNoteField);

	}

	@When("user can enter new note")
	public void user_can_enter_note() {

		WebElement objTitleText = FindWebElement("//textarea[@placeholder=\"Title\"])");
		String actualInputTile = "Welcome to testing";
		sendingTheInputValue(objTitleText, actualInputTile);
		WebElement objInputNoteField = FindWebElement("//en-note[@id=\"en-note\"]");
		String actualInputNote = "Types of testing";
		sendingTheInputValue(objInputNoteField, actualInputNote);

	}

	@Then("user can able to see the logout message")
	public void user_can_able_to_see_the_logout_message() {
		WebElement objUserNameField = FindWebElement("//div[@class=\"mjp8WyYQODySClV2byHt\"]");
		clickWebElement(objUserNameField);
	
		WebElement objDropDownLogout = FindWebElement("//a[@id=\"qa-ACCOUNT_DROPDOWN_LOGOUT\"]");
		clickWebElement(objDropDownLogout);
		String expectedlogoutmessage = "You have logged out of Evernote.";
		String actuallogoutmessage = driver.findElement(By.xpath("//h1[text()=\"You have logged out of Evernote.\"]"))
				.getText();
		assertEquals(actuallogoutmessage, expectedlogoutmessage);

	}

	@When("user can able to login")
	public void user_can_able_to_login() {
		WebElement objLoginButton = FindWebElement("\"//button[@id=\\\"qa-CREATE_NOTE\\\"]\"");
		clickWebElement(objLoginButton);

	}

	@When("user can click the recent note")
	public void user_can_click_the_recent_note() {
		WebElement objRecentNoteButtonField = FindWebElement("//span[text()=\"welcome to testing\"]");
		clickWebElement(objRecentNoteButtonField);
	}

	@When("validate the Textnote")
	public void validate_the_textnote() {
		String expectedTileMessage = "welcome to testing";
		WebElement objActualTitleMessage = FindWebElement("//textarea[@placeholder=\"Title\"]");
		assertEquals(objActualTitleMessage, expectedTileMessage);
	}
	public WebElement FindWebElement(String strxPathIdentifier)
	{
				WebElement returnWebElement = driver.findElement(By.xpath(strxPathIdentifier));
				return returnWebElement;

	}

}
