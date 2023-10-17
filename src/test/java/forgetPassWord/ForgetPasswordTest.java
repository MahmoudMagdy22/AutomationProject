package forgetPassWord;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgetPassWord;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTest extends BaseTests {
    @Test
    public void forget_pass(){

       ForgetPassWord forgetPass=homepage.clickonforgetpass();
       forgetPass.emailHolder("mahmoud@gmail.com");
       forgetPass.ClickSignIn();
       String actualResult= forgetPass.Validation();
       String expectedResult= "Internal Server Error";
       assertTrue(actualResult.contains(expectedResult));
    }
}
