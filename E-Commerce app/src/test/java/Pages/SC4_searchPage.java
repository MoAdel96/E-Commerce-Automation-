package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC4_searchPage {

    public WebElement SearchBox (){
        By searchBox =By.id("small-searchterms");
        WebElement SearchBox = browser.driver.findElement(searchBox);
        return SearchBox;

    }

    public WebElement SearchButton (){
        By searchButton =By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement SearchButton = browser.driver.findElement(searchButton);
        return SearchButton;

    }
}
