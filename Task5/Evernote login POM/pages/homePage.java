package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage {
    WebDriver driver;
    By objCreateNote = By.id("qa-CREATE_NOTE");

    public homePage (WebDriver driver){
        this.driver = driver;
    }

    public boolean assertCreateNoteObject(){
        return driver.findElements(objCreateNote).isEmpty();
    }

}
