package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC4_searchPage {

    public WebElement SearchBox() {
        By searchBox = By.id("small-searchterms");
        return browser.driver.findElement(searchBox);

    }

    public WebElement SearchButton() {
        By searchButton = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        return browser.driver.findElement(searchButton);

    }
}
