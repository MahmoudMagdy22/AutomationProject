package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver drievr;
    public LoginPage(WebDriver driver){
        this.drievr= driver;
    }
    //Elements
    private final By usernameFaild= By.id("username");
    private final By passwordField= By.id("password");
    private final By loginButton=By.className("radius");

    // Actions
    public void insertusername(String username) {
        drievr.findElement(usernameFaild).sendKeys(username);

    }
    public void insertpassword (String password) {
        drievr.findElement(passwordField).sendKeys(password);
    }
    public SecurArea clickonLoginButton(){
        drievr.findElement(loginButton).click();
        return new SecurArea(drievr);
    }


}




