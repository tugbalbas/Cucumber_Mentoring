package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page_form {

    public page_form(){
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='first_4']") // FindBy ile obje haline getiriyoruz
    public WebElement isim;

    @FindBy(xpath = "//input[@id='last_4']")
    public WebElement soyIsim;

    @FindBy(xpath = "//input[@id='input_5']")
    public WebElement mail;

    @FindBy(xpath = "//input[@id='input_6_area']")
    public WebElement alanKodu;

    @FindBy(xpath = "//input[@id='input_6_phone']")
    public WebElement telNo;

    @FindBy(xpath = "//input[@id='label_7_1']")
    public WebElement hangisi;

    @FindBy(xpath = "//button[@id='input_2']")
    public WebElement gonder;

    @FindBy(xpath = "//h1[contains(text(),'Teşekkürler!')]")
    public WebElement tesekkurler;

}
