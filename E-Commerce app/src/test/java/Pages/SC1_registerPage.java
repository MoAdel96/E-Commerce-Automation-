package Pages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import stepDefinitions.browser;

public class SC1_registerPage {
    public WebElement gender_male()
    {
        By gender =By.id("gender-male");
        return browser.driver.findElement(gender);

    }

    public WebElement first_name()
    {
        By firstname =By.id("FirstName");
        return browser.driver.findElement(firstname);

    }

    public WebElement last_name()
    {
        By lastname =By.id("LastName");
        return browser.driver.findElement(lastname);

    }
    public WebElement Email()
    {
        By email =By.id("Email");
        return browser.driver.findElement(email);

    }

    public WebElement pass_word()
    {
        By password =By.id("Password");
        return browser.driver.findElement(password);

    }
    public WebElement confirm_pass_word()
    {
        By confirmPassword =By.id("ConfirmPassword");
        return browser.driver.findElement(confirmPassword);

    }

    public  WebElement RegisterBtn ()
    {
        By Btn = By.id("register-button");
        return browser.driver.findElement(Btn);
    }






}
