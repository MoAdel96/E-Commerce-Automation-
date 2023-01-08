package stepDefinitions;

import Pages.SC1_registerPage;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import org.testng.Assert;


public class SC1_registerSD {

    SC1_registerPage register = new SC1_registerPage();


    @Given("User open browser and navigates to website")
    public void User_navigates_to_website() {

        browser.driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @And("user navigate to register page")
    public void user_navigate_to_register_page() {

        browser.driver.findElement(By.className("ico-register")).click();

    }

    @When("User fill the form")
    public void User_fill_the_form() {
        register.gender_male().click();
        register.first_name().sendKeys("mohamed");
        register.last_name().sendKeys("adel");
        register.Email().sendKeys("ljoadel@gmail.com");
        register.pass_word().sendKeys("123456");
        register.confirm_pass_word().sendKeys("123456");


    }


    @And("User Click on Register button")
    public void User_Click_on_Register_button() throws InterruptedException {
        register.RegisterBtn().click();
        Thread.sleep(3000);


    }


    @Then("User could register successfully")

    public void User_could_register_successfully() {
        String expectedResult = browser.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();

        String actualResult = "Your registration completed";

        Assert.assertTrue(expectedResult.contains(actualResult), "user registered successfully");

    }


    @And("go to the main page")

    public void go_to_the_main_page() {
        browser.driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();

    }
}
