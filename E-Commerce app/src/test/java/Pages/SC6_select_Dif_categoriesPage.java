package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;

public class SC6_select_Dif_categoriesPage {
    public WebElement Category (){
        By category =By.cssSelector("a[href=\"/apparel\"]");
        WebElement Category = browser.driver.findElement(category);
        return Category;


    }
    public WebElement SubCategory (){
        By subcategory =By.xpath("//a[@title=\"Show products in category Shoes\"]");
        WebElement SubCategory = browser.driver.findElement(subcategory);
        return SubCategory;


    }

}
