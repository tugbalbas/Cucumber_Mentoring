package StepDefinitions;

import Utilities.BaseDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class dataTable_Steps {
    WebDriver driver;

    @Given("^Navigate to Practice Website$")
    public void navigateToPracticeWebsite() {
        driver = BaseDriver.getDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
    }

    @When("^Fill all areas$")
    public void fillAllAreas(DataTable table) {
        //List
        List<List<String>> data = table.raw();
        System.out.println(data.get(1).get(1));
//sendKeysi tablodan almasını istiyoruz
// (page ve stepDefinition konumlarına girmeden tablodan dataları değiştirebilmek)
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys(data.get(4).get(1));
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys(data.get(5).get(1));

    }

    @Then("^Verify Register Page's Url$")
    public void verifyRegisterPageSUrl() {

        String Url= driver.getCurrentUrl();
        Assert.assertEquals(Url,"https://demoqa.com/automation-practice-form/");
    }
}
