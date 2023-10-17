package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxes {
    WebDriver driver;
    public CheckBoxes(WebDriver driver){
        this.driver= driver;
    }
     private By clickCheckBox1=By.xpath("//input[1]");
     private By clickCheckBox2=By.xpath("//input[2]");


    public void ClickCheckBoxes(){
         driver.findElement(clickCheckBox1).click();
         driver.findElement(clickCheckBox2).click();
     }

}
