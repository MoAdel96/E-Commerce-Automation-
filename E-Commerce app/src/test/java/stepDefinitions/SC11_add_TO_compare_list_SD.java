package stepDefinitions;

import Pages.SC11_add_TO_compare_list_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;

public class SC11_add_TO_compare_list_SD {

    SC11_add_TO_compare_list_Page comp =new SC11_add_TO_compare_list_Page();

    @When("user click on add to compare list")
    public void user_click_on_add_to_compare_list(){
        comp.AddToComp1().click();

    }

    @And("user click on add to compare list button")
      public void CompareList2(){
        comp.AddToComp2().click();
    }


    @Then("The product successfully added to your product comparison")
    public void The_product_successfully_added_to_your_product_comparison(){
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = browser.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));

    }
}
