package Runner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\karth\\eclipse-workspace\\neweclipse\\R\\src\\test\\java\\com\\R\\createNote.feature",
glue = "StepDef", 
dryRun = !true,
monochrome = true,
plugin = "pretty"
)

public class Runner {
}
