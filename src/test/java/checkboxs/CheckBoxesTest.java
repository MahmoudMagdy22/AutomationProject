package checkboxs;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckBoxes;


public class CheckBoxesTest extends BaseTests {
    @Test
    public void check_boxes(){
        CheckBoxes checkBoxes = homepage.clickOnCheckBoxesLink();
        CheckBoxes checkboxes= new CheckBoxes(driver);
        checkboxes.ClickCheckBoxes();


    }
}
