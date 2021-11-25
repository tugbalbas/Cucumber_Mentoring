package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page_OpenCart {

    public page_OpenCart(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    //@FindBy(xpath = "")


}
