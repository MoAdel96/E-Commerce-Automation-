package stepDefinitions;

import Pages.SC5_switchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC5_switchSD {
SC5_switchPage switchCurr =new SC5_switchPage();

    @When("user clicks on currencies Dropdown")
    public void user_clicks_on_currencies_Dropdown() {
        switchCurr.Dropdown().click();

    }

    @And("user click on currency")
    public void user_click_on_currency() {
        switchCurr.Currency().click();

    }

    @Then("the currency will change")
    public void the_currency_will_change() {

        boolean expected = browser.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]")).isDisplayed();
        Assert.assertTrue(expected);

    }

}
