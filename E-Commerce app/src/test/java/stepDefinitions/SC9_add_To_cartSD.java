package stepDefinitions;

import Pages.SC9_add_To_cart_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;

public class SC9_add_To_cartSD {

    SC9_add_To_cart_Page cart = new SC9_add_To_cart_Page();

    @When("user click on add to cart1")
    public void user_click_on_add_to_cart1() {
        cart.AddToCart1().click();

    }

    @And("user select size")
    public void user_select_size() throws InterruptedException {
        cart.SizeDropdown().click();
        Thread.sleep(1000);
        cart.SelectSize().click();

    }

    @And("user click on add to cart2")
    public void user_click_on_add_to_cart2() throws InterruptedException {
        cart.AddToCart2().click();
        Thread.sleep(2000);

    }

    @Then("The product successfully added to your shopping cart")
    public void the_product_successfully_added_to_card() {

        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = browser.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}
