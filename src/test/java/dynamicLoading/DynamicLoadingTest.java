package dynamicLoading;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadPage;
import pages.HomePage;
import pages.ValidateDynamicWait;

public class DynamicLoadingTest extends BaseTests {
    DynamicLoadPage dynamicLoad;
    @Test
            public void TestWaiting(){
       dynamicLoad =homepage.ClickOnDynamicLoadingPage();
        DynamicLoadPage waitingPage = new DynamicLoadPage (driver);

        waitingPage.clickOnExample();
        ValidateDynamicWait validateWait=new ValidateDynamicWait(driver);
        validateWait.clickOnStartButton();
            String ActualResult = validateWait.getValidation();
            String ExpectedResult = "Hello World!";
      Assert.assertEquals(ActualResult,ExpectedResult);
    }

    @Test
    public void TestingWaitingLoadingIsInvisable(){

        dynamicLoad =homepage.ClickOnDynamicLoadingPage();

        DynamicLoadPage waitingPage = new DynamicLoadPage (driver);

        waitingPage.clickOnExample();

        ValidateDynamicWait validateWait=new ValidateDynamicWait(driver);

        validateWait.clickOnStartButton();

        boolean actualResult=validateWait.assertionOfLoadingImage();
        boolean expectedResult= false;
        Assert.assertTrue(actualResult==expectedResult);




    }







}
