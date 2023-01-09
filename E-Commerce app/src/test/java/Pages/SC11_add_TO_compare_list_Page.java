package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC11_add_TO_compare_list_Page {

    public WebElement AddToComp1() {
        By addToComp1 = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img");
        return browser.driver.findElement(addToComp1);

    }


    public WebElement AddToComp2() {
        By addToComp2 = By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]");
        return browser.driver.findElement(addToComp2);
    }
}