package stepDefinitions;

import Pages.SC6_select_Dif_categoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC6_select_Dif_categoriesSD {

    SC6_select_Dif_categoriesPage Cat = new SC6_select_Dif_categoriesPage();


    @When("user click on category")
    public void user_click_on_category() {
        Cat.Category().click();
    }


    @And("user click on sub-category")
    public void user_click_on_sub_category() throws InterruptedException {
        Cat.SubCategory().click();
        Thread.sleep(3000);
    }


    @Then("category page will open")
    public void category_page_will_open() {
        String expected = browser.driver.findElement(By.className("page-title")).getText();
        String actual = "Shoes";
        Assert.assertTrue(expected.contains(actual), "done");

    }
}


