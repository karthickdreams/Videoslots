package com.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass
{
	public WebDriver driver;

	// Description: Function used to set a value in a text box in the application
	// Parameters:
	// Input: element - [object] - Webelement from the webdriver
	// Input : inputValue [String] - value to be set in the text box

	public static void setInputText(WebElement element, String inputValue)
	{
		element.sendKeys(inputValue);
	}

	// Description: Function used to Click a web element in the application
	// Parameters:
	// Input: element - [object] - Webelement to be clicked 
	
	public static void clickWebElement(WebElement clickElement) 
	{
		clickElement.click();
	}

	// Description: Function used to get a text value from the application
	// Parameters:
	// Input: getTextElement - [object] - Webelement from where the text to be fetched
	// Output: strTextFromWebElement - [String] - value fetched from the web element
	
	public static String getFromWebPage(WebElement getTextElement) 
	{
		String strTextFromWebElement = getTextElement.getText();
		
		return strTextFromWebElement;
	}
}
