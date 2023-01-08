package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC5_switchPage {

    public WebElement Dropdown (){
        By dropdown =By.id("customerCurrency");
        WebElement Dropdown = browser.driver.findElement(dropdown);
        return Dropdown;

    }

    public WebElement Currency (){
        By currency =By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
        WebElement Currency = browser.driver.findElement(currency);
        return Currency;

    }
}
