package StepDefinitions;

import Pages.page_OpenCart;
import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class steps_OpenCart {

    WebDriver driver;
    page_OpenCart openCart=new page_OpenCart();

    @Given("^Navigate to Open Cart Website$")
    public void navigateToOpenCartWebsite() {
        driver = BaseDriver.getDriver();
        driver.get("https://demo.opencart.com/");
    }

    @And("^Click to My Account$")
    public void clickToMyAccount() {

    }

    @And("^Click to Continue$")
    public void clickToContinue() {
    }

    @And("^File all spaces$")
    public void fileAllSpaces() {
    }

    @When("^Click to Privacy and Continue buttons$")
    public void clickToPrivacyAndContinueButtons() {
    }

    @Then("^Verify Your Account Has Been Created message$")
    public void verifyYourAccountHasBeenCreatedMessage() {
    }

    @And("^Click to YOUR STORE$")
    public void clickToYOURSTORE() {
    }

    @And("^Add iPhone to wishlist$")
    public void addIPhoneToWishlist() {
    }

    @When("^Click to Wishlist$")
    public void clickToWishlist() {
    }

    @Then("^Verify the Unit Price text$")
    public void verifyTheUnitPriceText() {
    }
}
