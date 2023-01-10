package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC12_create_Order_Page {


    public WebElement ShoppingCart() {

        By shopCart = By.cssSelector("span[class=\"cart-label\"]");
        return browser.driver.findElement(shopCart);

    }

    public WebElement Terms() {

        By terms = By.id("termsofservice");
        return browser.driver.findElement(terms);

    }

    public WebElement CheckOut() {

        By checkOut = By.id("checkout");
        return browser.driver.findElement(checkOut);

    }

    //Billing address
    public WebElement first_name() {
        By firstname = By.id("BillingNewAddress_FirstName");
        return browser.driver.findElement(firstname);

    }

    public WebElement last_name() {
        By lastname = By.id("BillingNewAddress_LastName");
        return browser.driver.findElement(lastname);

    }

    public WebElement Email() {
        By email = By.id("BillingNewAddress_Email");
        return browser.driver.findElement(email);

    }

    public WebElement Country() {
        By country = By.id("BillingNewAddress_CountryId");

        return browser.driver.findElement(country);

    }

    public WebElement SubCountry() {
        By subCountry = By.cssSelector("option[value=\"239\"]");


        return browser.driver.findElement(subCountry);

    }


    public WebElement State() {
        By state = By.id("BillingNewAddress_StateProvinceId");

        return browser.driver.findElement(state);

    }

    public WebElement SubState() {
        By subState = By.cssSelector("option[value=\"133\"]");
//


        return browser.driver.findElement(subState);

    }

    public WebElement City() {
        By city = By.id("BillingNewAddress_City");
        return browser.driver.findElement(city);

    }

    public WebElement Address() {
        By address = By.id("BillingNewAddress_Address1");
        return browser.driver.findElement(address);

    }

    public WebElement Zip() {
        By zip = By.id("BillingNewAddress_ZipPostalCode");
        return browser.driver.findElement(zip);

    }

    public WebElement Phone() {
        By phone = By.id("BillingNewAddress_PhoneNumber");
        return browser.driver.findElement(phone);

    }

    public WebElement Save() {
        By save = By.cssSelector("button[onclick=\"Billing.save()\"]");
        return browser.driver.findElement(save);

    }

    //Shipping method
    public WebElement ShippingSave() {
        By shippingSave = By.cssSelector("button[onclick=\"ShippingMethod.save()\"]");
        return browser.driver.findElement(shippingSave);

    }

    public WebElement PaySave() {
        By paySave = By.cssSelector("button[onclick=\"PaymentMethod.save()\"]");
        return browser.driver.findElement(paySave);

    }

    public WebElement PayInfSave() {
        By payINFSave = By.cssSelector("button[onclick=\"PaymentInfo.save()\"]");
        return browser.driver.findElement(payINFSave);

    }

    public WebElement OrderSave() {
        By orderSave = By.cssSelector("button[onclick=\"ConfirmOrder.save()\"]");
        return browser.driver.findElement(orderSave);

    }


}

