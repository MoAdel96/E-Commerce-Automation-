package Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC2_loginPage {

public WebElement emailLogin (){

    By email2 =By.id("Email");
    WebElement emailLogin = browser.driver.findElement(email2);
    return emailLogin;
}

    public WebElement password (){

        By password2 =By.id("Password");
        WebElement password = browser.driver.findElement(password2);
        return password;
    }

    public WebElement loginBTN (){
    By loginBTN1 =By.cssSelector("button[class=\"button-1 login-button\"]");
    WebElement loginBTN = browser.driver.findElement(loginBTN1);
    return loginBTN;
    }

}
