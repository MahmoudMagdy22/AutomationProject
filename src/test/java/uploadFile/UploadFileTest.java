package uploadFile;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUpLoaded;
import pages.UploadFile;

import static org.testng.Assert.assertTrue;

public class UploadFileTest extends BaseTests {
    @Test
    public void upload_file(){

        UploadFile uploadFile= homepage.clickOnUpLoadFile();
        uploadFile.SendFileToUpLoad();
        FileUpLoaded fileuploaded =uploadFile.ClickSubmit();
        String actualoutcome=fileuploaded.ValidationText();
        String expectedoutcome="uploadsuccessfully.txt";
        assertTrue(actualoutcome.contains(expectedoutcome));

    }
}
