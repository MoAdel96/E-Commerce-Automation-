package Pages;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import stepDefinitions.browser;

public class SC1_registerPage {
    public WebElement gender_male()
    {
        By gender =By.id("gender-male");
        WebElement gender_male =browser.driver.findElement(gender);
        return gender_male;

    }

    public WebElement first_name()
    {
        By firstname =By.id("FirstName");
        WebElement first_name =browser.driver.findElement(firstname);
        return first_name;

    }

    public WebElement last_name()
    {
        By lastname =By.id("LastName");
        WebElement last_name =browser.driver.findElement(lastname);
        return last_name;

    }
    public WebElement Email()
    {
        By email =By.id("Email");
        WebElement Email =browser.driver.findElement(email);
        return  Email;

    }

    public WebElement pass_word()
    {
        By password =By.id("Password");
        WebElement pass_word =browser.driver.findElement(password);
        return pass_word;

    }
    public WebElement confirm_pass_word()
    {
        By confirmPassword =By.id("ConfirmPassword");
        WebElement confirm_pass_word =browser.driver.findElement(confirmPassword);
        return confirm_pass_word;

    }

    public  WebElement RegisterBtn ()
    {
        By Btn = By.id("register-button");
        WebElement RegisterBtn = browser.driver.findElement(Btn);
        return RegisterBtn;
    }






}
