package stepDefinitions;

import Pages.SC3_resetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC3_resetSD {

    SC3_resetPage reset =new SC3_resetPage();




    @And("user click on forget password link")
    public void user_click_on_forget_password_link () {
        reset.forget_password().click();

    }

    @When("user fills his Email")
    public void user_fills_his_Email () {
        reset.FpwEmail().sendKeys("ljoadel@gmail.com");

    }

    @And("user click on Recover button")
    public void user_click_on_Recover_button () throws InterruptedException {
        reset.recoverButton().click();
        Thread.sleep(3000);

    }

    @Then("A message is Displayed to user")
    public void A_message_is_Displayed_to_user () {
        boolean expected = browser.driver.findElement(By.cssSelector("p[class=\"content\"]")).isDisplayed();
        Assert.assertTrue(expected,"Email with instructions has been sent to you");


    }
}
