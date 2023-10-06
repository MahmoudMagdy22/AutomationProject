package t;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T {
    @Test

    public void validSenario(){
        //set webdriver
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get("https://the-internet.herokuapp.com/");


        // get the link
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        // username & password
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
        // click sing in
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        // assertion
        String expectedResult="You logged into a secure area!";
        String actualResult=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        // to use  the assertequal fun with () then use static
        assertTrue(actualResult.contains(expectedResult));

        driver.quit();

    }

    @Test

    public void invalidUser(){
        //set webdriver
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get("https://the-internet.herokuapp.com/");


        // get the link
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();
        // username & password
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith2255");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
        // click sing in
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        // assertion
        String expectedResult="Your username is invalid!";
        String actualResult=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        // to use  the assertequal fun with () then use static
        assertTrue(actualResult.contains(expectedResult));

        driver.quit();}
    @Test

    public void invalidpass(){
        //set webdriver
        WebDriver driver = new ChromeDriver();
        //get url
        driver.get("https://the-internet.herokuapp.com/");


        // get the link
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();
        // username & password
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword555!");
        // click sing in
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        // assertion
        String expectedResult="Your password is invalid!";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        // to use  the assertequal fun with () then use static
        assertTrue(actualResult.contains(expectedResult));

        driver.quit();}

}
