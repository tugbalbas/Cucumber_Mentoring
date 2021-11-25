package StepDefinitions;

import Pages.page_form;
import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class steps_form {

    WebDriver driver;
    page_form pageForm=new page_form();

    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        driver= BaseDriver.getDriver();
        driver.get("https://form.jotform.com/202614167881053");
    }

    @And("^Enter Name and Surname$")
    public void enterNameAndSurname() {
        pageForm.isim.sendKeys("tugba");
        pageForm.soyIsim.sendKeys("albas");
    }

    @And("^Enter E-mail$")
    public void enterEMail() {
        pageForm.mail.sendKeys("tb@tb.com");
    }

    @And("^Enter Code and Phone Number$")
    public void enterCodeAndPhoneNumber() {
        pageForm.alanKodu.sendKeys("49");
        pageForm.telNo.sendKeys("123123123");
    }

    @And("^Choose one of the options$")
    public void chooseOneOfTheOptions() {
        pageForm.hangisi.click();
    }

    @When("^Click to Submit Button$")
    public void clickToSubmitButton() {
        pageForm.gonder.click();
    }

    @Then("^Verify the success Message$")
    public void verifyTheSuccessMessage() {
        WebElement successMessage=pageForm.tesekkurler;
        Assert.assertTrue(successMessage.getText().contains("Tesekkurler"));
    }
}
