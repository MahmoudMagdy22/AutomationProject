package dropDownList;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownList;
import pages.HomePage;

public class TestDropDown extends BaseTests {

     @Test
    public void TestDropdownList(){
        DropDownList dropDownList= homepage.clickOnDropDown();
        dropDownList.selectFromList("Option 2");

     }

}
