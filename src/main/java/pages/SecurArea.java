package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurArea {
    WebDriver driver;
    public SecurArea(WebDriver driver) {
        this.driver= driver;
    }

    private final By validationMessage=By.id("flash");

    public String validationMessage(){
       return driver.findElement(validationMessage).getText();
    }
}
