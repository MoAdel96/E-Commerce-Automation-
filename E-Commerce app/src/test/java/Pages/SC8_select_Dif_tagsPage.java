package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC8_select_Dif_tagsPage {

    public WebElement Tag() {

        By tagElm = By.cssSelector("a[href=\"/shoes-2\"]");
        return browser.driver.findElement(tagElm);
    }


}
