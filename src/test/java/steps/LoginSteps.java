package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = Hooks.driver;
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the secure area")
    public void the_user_should_be_redirected_to_the_secure_area() {
        assertTrue(driver.getCurrentUrl().contains("/secure"));
    }

    @Then("a success {string} should be displayed")
    public void a_success_message_should_be_displayed(String message) {
        assertTrue(driver.getPageSource().contains(message));
    }
}