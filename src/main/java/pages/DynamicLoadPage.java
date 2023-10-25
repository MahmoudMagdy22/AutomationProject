package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadPage {
    WebDriver driver;
    public DynamicLoadPage(WebDriver driver) {
        this.driver= driver;
    }
    private final By example= By.partialLinkText("Example 1");

    public ValidateDynamicWait clickOnExample(){
        driver.findElement(example).click();
        return new ValidateDynamicWait(driver);
    }






}
