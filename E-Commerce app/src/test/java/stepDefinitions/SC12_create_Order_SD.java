package stepDefinitions;

import Pages.SC12_create_Order_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SC12_create_Order_SD {

    SC12_create_Order_Page order = new SC12_create_Order_Page();
    // shopping cart

    @When("user click on shopping cart")
    public void user_click_on_shopping_cart() throws InterruptedException {

//        Thread.sleep(2000);
//        browser.driver.findElement(By.cssSelector("span[title=\"Close\"]")).click();
        Thread.sleep(7000);
        order.ShoppingCart().click();
    }

    @And("mark terms of service check box")
    public void mark_terms_of_service_check_box() {
        order.Terms().click();

    }

    @And("press check out")
    public void press_check_out() {
        order.CheckOut().click();

    }




    @When("user fill the form")
    public void user_fill_the_form() throws InterruptedException {
        order.first_name().clear();
        order.first_name().sendKeys("mohamed");
        order.last_name().clear();
        order.last_name().sendKeys("adel");
        order.Email().clear();
        Thread.sleep(1000);
        order.Email().sendKeys("Adel@test.com");
        order.Country().click();
        Thread.sleep(1000);
        order.SubCountry().click();
        Thread.sleep(1000);
        order.State().click();
        Thread.sleep(1000);
        order.SubState().click();
        Thread.sleep(1000);
        order.City().sendKeys("cairo");
        order.Address().sendKeys("cairo");
        order.Zip().sendKeys("123456");
        order.Phone().sendKeys("123456789");


    }

    @And("user press continue1")
    public void user_press_continue1() throws InterruptedException {
        order.Save().click();
        Thread.sleep(3000);

    }
    //Shipping method

    @When("user choose Shipping method")
    public void user_choose_Shipping_method() throws InterruptedException {
        order.ShippingSave().click();
        Thread.sleep(3000);

    }

    @And("press continue2")
    public void press_continue2() throws InterruptedException {
        order.PaySave().click();
        Thread.sleep(2000);

    }
    //Payment method

    @When("user choose Payment method and continue")
    public void user_choose_Payment_method() throws InterruptedException {
        order.PayInfSave().click();
        Thread.sleep(3000);
    }



    //Payment information

    @When("user press confirm")
    public void user_press_continue4() {
        order.OrderSave().click();
    }
    //Confirm order



    @Then("Your order has been successfully processed")
    public void Your_order_has_been_successfully_processed() {
        String actual = browser.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).getText();

    }


}
