package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPassWord {
    WebDriver driver;
    public ForgetPassWord(WebDriver driver) {
        this.driver= driver;
    }
    private By EmailAddress= By.id("email");
    private By SignInButton= By.xpath("//i[@class='icon-2x icon-signin']");
    private By AlertMessage= By.cssSelector(" body h1");

    public void emailHolder(String email){
        driver.findElement(EmailAddress).sendKeys(email);
    }
    public void ClickSignIn(){
        driver.findElement(SignInButton).click();
    }
    public String Validation(){
        return driver.findElement(AlertMessage).getText();
    }
}
