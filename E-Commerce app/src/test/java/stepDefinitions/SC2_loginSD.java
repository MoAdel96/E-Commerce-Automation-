package stepDefinitions;

import Pages.SC2_loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC2_loginSD {


    SC2_loginPage log = new SC2_loginPage();

    @And("user navigate to login page")
    public void user_navigate_to_login_page() {
        browser.driver.findElement(By.className("ico-login")).click();

    }


    @When("user enter valid email")
    public void user_enter_valid_email() {

        log.emailLogin().sendKeys("hhmoadel96@gmail.com");
    }

    @And("user enter valid password")
    public void user_enter_valid_password() {
        log.password().sendKeys("123456");
    }

    @And("user click on login button")
    public void user_click_on_login_button() {
        log.loginBTN().click();

    }

    @Then("user login successfully")
    public void user_login_successfully() {
        boolean expected = browser.driver.findElement(By.className("ico-account")).isDisplayed();

        Assert.assertTrue(expected, "user logged in successfully");

    }


}
