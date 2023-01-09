package stepDefinitions;

import Pages.SC10_add_TO_wishlist_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;

public class SC10_add_TO_wishlist_SD {

    SC10_add_TO_wishlist_Page wish =new SC10_add_TO_wishlist_Page();
    @When("user click on add to Wishlist")
    public void user_click_on_add_to_Wishlist() {
        wish.AddToWish1().click();

    }

    @And("user click on Add to Wishlist")
    public void user_click_on_Add_to_Wishlist() {
        wish.AddToWish2().click();

    }

    @Then("The product successfully added to your wishlist")
    public void The_product_successfully_added_to_your_wishlist() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = browser.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}
