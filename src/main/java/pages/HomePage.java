package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //LoginRequiredLink
    private By formAuthenticationLink=By.linkText("Form Authentication");
    public LoginPage clickformAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver) ;
    }
    //checkboxesRequiredLink
    private By CheckBoxesLink= By.xpath("//a[normalize-space()='Checkboxes']");
    public CheckBoxes clickOnCheckBoxesLink(){
        driver.findElement(CheckBoxesLink).click();
        return new CheckBoxes(driver);
    }

    //uploadFileLink
    private By clickOnUploadFile=By.xpath("//a[normalize-space()='File Upload']");
    public UploadFile clickOnUpLoadFile(){
        driver.findElement(clickOnUploadFile).click();
        return new UploadFile(driver);
    }
    //ForgetPasswordLinks
    private By ForgetPassWordLink= By.cssSelector("a[href='/forgot_password']");

    public ForgetPassWord clickonforgetpass(){
        driver.findElement(ForgetPassWordLink).click();
        return new ForgetPassWord(driver);

    }
    }


