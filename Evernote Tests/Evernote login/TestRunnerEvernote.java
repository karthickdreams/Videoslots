package Runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\karth\\eclipse-workspace\\neweclipse\\R\\src\\test\\java\\EvernoteFeature.feature", glue = "StepDef",

		monochrome = true, plugin = "pretty")

public class TestRunnerEvernote {

	

}