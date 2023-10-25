package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidateDynamicWait {
    WebDriver driver;
    WebDriverWait wait;
    public ValidateDynamicWait(WebDriver driver) {
        this.driver=driver;
    }
    private By startButton= By.cssSelector("#start >button");
    private By validationMessage= By.xpath("//*[@id=\"finish\"]/h4");
    private By loadingImg=By.xpath("//img[@src='/img/ajax-loader.gif']");

    public void clickOnStartButton(){
        driver.findElement(startButton).click();
    }


    public String getValidation(){
       wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationMessage)));
        return driver.findElement(validationMessage).getText();
    }

    public boolean validateLoadingInvisible(){
        wait.until(ExpectedConditions.invisibilityOf((WebElement) loadingImg));
        return driver.findElement(loadingImg).isDisplayed();
    }

    public boolean assertionOfLoadingImage(){
        if(driver.findElement(loadingImg).isDisplayed()){
            return false;
        } else
        { return true ;
        }
    }













}
