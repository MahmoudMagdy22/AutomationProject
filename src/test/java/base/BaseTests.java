package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    protected WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        homepage  = new HomePage(driver);

    }
    @BeforeMethod
    public void getUrl (){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterClass
    public void tearDowen(){
        driver.quit();
    }

}
