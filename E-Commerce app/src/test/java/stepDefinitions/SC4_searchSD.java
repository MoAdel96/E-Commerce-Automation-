package stepDefinitions;

import Pages.SC4_searchPage;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC4_searchSD {

    SC4_searchPage search = new SC4_searchPage();

    @When("user enter product's name")
    public void user_enter_product_name () {
        search.SearchBox().sendKeys("adidas Consortium Campus 80s Running Shoes");

    }

    @And("user click on search button")
    public void user_click_on_search_button () throws InterruptedException {
        search.SearchButton().click();
        Thread.sleep(3000);

    }

    @Then("the result page will open")
    public void the_result_page_will_open () {
        boolean expected =browser.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).isDisplayed();
        Assert.assertTrue(expected);

    }




}
