package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;
public class SC7_filterPage {


    public WebElement Color(){
         By color = By.id("attribute-option-14");
        return browser.driver.findElement(color);

    }




}
