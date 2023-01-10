package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC5_switchPage {

    public WebElement Dropdown (){
        By dropdown =By.id("customerCurrency");
        return browser.driver.findElement(dropdown);

    }

    public WebElement Currency (){
        By currency =By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
        return browser.driver.findElement(currency);

    }
}
