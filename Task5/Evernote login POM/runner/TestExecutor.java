package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//Executor file to bind the Feature file and Step definition file
@CucumberOptions(
        features = "src/test/java/feature/loginPage.feature",
        glue = {"steps"}
        //glue = "src/test/java/steps/LoginPageStepDefinition.java"
)
public class TestExecutor {
}
