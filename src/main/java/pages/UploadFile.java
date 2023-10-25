package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {
    WebDriver driver;
    public UploadFile(WebDriver driver) {
        this.driver = driver;
    }
    private By UpLoadFileLink = By.id("file-upload");
    private By SubmitButton = By.id("file-submit");
    private   String filepath= "C:\\Users\\Mahmoud\\Desktop\\uploadsuccessfully.txt";
    public String SendFileToUpLoad(){
        driver.findElement(UpLoadFileLink).sendKeys(filepath);
        return filepath;

    }
    public FileUpLoaded ClickSubmit(){
    driver.findElement(SubmitButton).click();
        return new FileUpLoaded(driver);
    }
}
