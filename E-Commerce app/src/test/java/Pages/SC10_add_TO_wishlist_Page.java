package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC10_add_TO_wishlist_Page {



    public WebElement AddToWish1 (){
        By addToWish1 =By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img");
        return browser.driver.findElement(addToWish1);

    }



    public WebElement AddToWish2 (){
        By addToWish2 =By.id("add-to-wishlist-button-25");
        return browser.driver.findElement(addToWish2);

    }
}
