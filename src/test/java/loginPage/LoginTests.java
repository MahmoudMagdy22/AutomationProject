package loginPage;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurArea;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {
    LoginPage loginPage ;
    @Test(priority = 1)

    public void validSenario(){


       loginPage= homepage.clickformAuthenticationLink();

        loginPage.insertusername("tomsmith");
        loginPage.insertpassword("SuperSecretPassword!");
        SecurArea securArea=loginPage.clickonLoginButton();
        String actualResult=securArea.validationMessage();
        String expectedResult="You logged into a secure area";
        assertTrue(actualResult.contains(expectedResult));

         }

    @Test(priority=2)

    public void invalidUser(){

        loginPage= homepage.clickformAuthenticationLink();
        loginPage.insertusername("Mahmoud");

        loginPage.insertusername("tomsmith2255");
        loginPage.insertpassword("SuperSecretPassword!");
        String expectedResult="Your username is invalid!";
        SecurArea securArea=loginPage.clickonLoginButton();
        String actualResult=securArea.validationMessage();
        assertTrue(actualResult.contains(expectedResult));

        }
    @Test(priority= 3)

    public void invalidpass(){

        // get the link
        loginPage= homepage.clickformAuthenticationLink();
        loginPage.insertusername("tomsmith");
        loginPage.insertpassword("SuperSecretPassword555!");
        SecurArea secureArea=loginPage.clickonLoginButton();
        String expectedResult="Your password is invalid!";
        String actualResult= secureArea.validationMessage();
        assertTrue(actualResult.contains(expectedResult));

        }

}
