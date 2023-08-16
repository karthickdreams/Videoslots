package com.R;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

	public WebDriver driver;

	public static void sendingTheInputValue(WebElement element, String inputvalue)

	{
		element.sendKeys(inputvalue);
	}

	public static void clickWebElement(WebElement clickElement) {
		clickElement.click();
	}

	public static String getFromWebPage(WebElement getTextElement) {
		String textfromWebPage = getTextElement.getText();
		return textfromWebPage;
	}

}
