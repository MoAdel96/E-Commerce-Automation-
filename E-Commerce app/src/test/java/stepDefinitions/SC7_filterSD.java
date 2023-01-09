package stepDefinitions;


import Pages.SC7_filterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC7_filterSD {

    SC7_filterPage filter = new SC7_filterPage();


    @When("user click on color")
    public void user_click_on_color() {
        filter.Color().click();


    }

    @Then("the products with same color will appear")
    public void the_products_with_same_color_will_appear() {
        boolean expected = browser.driver.findElement(By.cssSelector("a[href=\"/nike-sb-zoom-stefan-janoski-medium-mint\"]")).isDisplayed();
        Assert.assertTrue(expected);
    }

}
