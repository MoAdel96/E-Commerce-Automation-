package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC2_loginPage {

    public WebElement emailLogin() {

        By email2 = By.id("Email");
        return browser.driver.findElement(email2);
    }

    public WebElement password() {

        By password2 = By.id("Password");
        return browser.driver.findElement(password2);
    }

    public WebElement loginBTN() {
        By loginBTN1 = By.cssSelector("button[class=\"button-1 login-button\"]");
        return browser.driver.findElement(loginBTN1);
    }

}
