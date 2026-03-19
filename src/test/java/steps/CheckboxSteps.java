package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckboxPage;

public class CheckboxesSteps(){
    
    WebDriver driver;
    CheckboxPage page;

    @Given("the user is on the checkboxes page")
    public void goToCheckboxPage() {
        driver = new ChromeDriver();
        page = new CheckboxPage(driver);
        page.goToPage();
    }

    @Then("the first checkbox should be unchecked")
    public void firstCheckboxUnchecked() {
        Assert.assertFalse(page.isCheckboxChecked(0));
    }

    @Then("the second checkbox should be checked")
    public void secondCheckboxChecked() {
        Assert.assertTrue(page.isCheckboxChecked(1));
    }

    @When("the user selects the first checkbox")
    public void selectFirstCheckbox() {
        page.selectCheckbox(0);
    }

    @Then("the first checkbox should be checked")
    public void firstCheckboxChecked() {
        Assert.assertTrue(page.isCheckboxChecked(0));
    }

    @When("the user unselects the second checkbox")
    public void unselectSecondCheckbox() {
        page.unselectCheckbox(1);
    }

    @Then("the second checkbox should be unchecked")
    public void secondCheckboxUnchecked() {
        Assert.assertFalse(page.isCheckboxChecked(1));
        driver.quit();
    }
}
