package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC9_add_To_cart_Page {
    public WebElement AddToCart1() {
        By addToCart1 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a");
        return browser.driver.findElement(addToCart1);

    }

    public WebElement SizeDropdown() {
        By sizeDrop = By.id("product_attribute_9");
        return browser.driver.findElement(sizeDrop);


    }

    public WebElement SelectSize() {
        By selectSize = By.xpath("//*[@id=\"product_attribute_9\"]/option[2]");
        return browser.driver.findElement(selectSize);


    }

    public WebElement AddToCart2() {
        By addToCart2 = By.id("add-to-cart-button-25");
        return browser.driver.findElement(addToCart2);

    }


}

