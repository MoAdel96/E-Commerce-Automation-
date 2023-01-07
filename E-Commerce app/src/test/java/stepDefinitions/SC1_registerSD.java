package stepDefinitions;

import Pages.SC1_registerPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SC1_registerSD {

SC1_registerPage register =new SC1_registerPage();


  @And("User navigates to website")
    public void User_navigates_to_website () {

browser.driver.navigate().to("https://demo.nopcommerce.com/");
      throw new io.cucumber.java.PendingException();

  }
  @And("user navigate to register page")
    public void user_navigate_to_register_page(){

browser.driver.findElement(By.className("ico-register")).click();
      throw new io.cucumber.java.PendingException();
  }
@When("User fill the form")
    public void User_fill_the_form(){
    register.gender_male().click();
    register.first_name().sendKeys("mohamed");
    register.last_name().sendKeys("adel");
    register.Email().sendKeys("moadel@gmail.com");
    register.pass_word().sendKeys("123456");
    register.confirm_pass_word().sendKeys("123456");
    throw new io.cucumber.java.PendingException();

}


    @And("User Click on Register button")
    public void User_Click_on_Register_button(){
        register.RegisterBtn().click();
        throw new io.cucumber.java.PendingException();

    }


    @Then("User could register successfully")

    public void User_could_register_successfully(){
        String expectedResult = browser.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();

      String actualResult ="Your registration completed";
        Assert.assertEquals(expectedResult.concat(actualResult),actualResult);

    }


    @And("go to the main page")

    public void go_to_the_main_page(){
        browser.driver.findElement(By.cssSelector("img[alt=\"nopCommerce demo store\"]")).click();

    }
}
