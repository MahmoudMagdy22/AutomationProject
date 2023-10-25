package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
    WebDriver driver;
    Select select;
    public DropDownList(WebDriver driver) {
        this.driver =driver;
    }
    private final By dropDownList = By.id("dropdown");

    public void selectFromList(String selectedItem){
        select = new Select(driver.findElement(dropDownList));
        select.selectByVisibleText(selectedItem);

    }
}

