package stepDefinitions;

import Pages.SC8_select_Dif_tagsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SC8_select_Dif_tagsSD {

    SC8_select_Dif_tagsPage tagElem = new SC8_select_Dif_tagsPage();

    @When("user click on tag")
    public void user_click_on_tag() {
        tagElem.Tag().click();

    }

    @Then("the products with same tag will appear")
    public void the_products_with_same_tag_will_appear() {
        boolean expected = browser.driver.findElement(By.cssSelector("a[href=\"/nike-floral-roshe-customized-running-shoes\"]")).isDisplayed();
        Assert.assertTrue(expected);
    }

}
