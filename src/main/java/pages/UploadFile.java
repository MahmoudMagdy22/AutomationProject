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
    public void SendFileToUpLoad(){
        driver.findElement(UpLoadFileLink).sendKeys("C:\\Users\\Mahmoud\\Desktop\\uploadsuccessfully.txt");

    }
    public FileUpLoaded ClickSubmit(){
    driver.findElement(SubmitButton).click();
        return new FileUpLoaded(driver);
    }
}
