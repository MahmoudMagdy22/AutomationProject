package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpLoaded {
    WebDriver driver;
    public FileUpLoaded(WebDriver driver) {
        this.driver =driver;
    }
    private  final By UploadValidation = (By.xpath("//div[@id='uploaded-files']"));

    public String ValidationText(){
        return driver.findElement(UploadValidation).getText();
           }


}
