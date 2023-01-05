package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SC1_registerSD {
    @Given("User open Browser")
    public void user_open_Browser (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();






    }
  @And("User navigates to website")
    public void User_navigates_to_website () {


  }
  @And("user navigate to register page")
    public void user_navigate_to_register_page(){

  }
@When("User fill the form")
    public void User_fill_the_form(){

}


    @And("User Click on Register button")
    public void User_Click_on_Register_button(){

    }


    @Then("User could register successfully")

    public void User_could_register_successfully(){

    }


    @And("go to the main page")

    public void go_to_the_main_page(){
    }
}
