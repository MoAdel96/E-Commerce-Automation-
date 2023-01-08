package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;


public class SC3_resetPage {
    public WebElement forget_password (){
        By forgetPassword =By.xpath("//a[@href=\"/passwordrecovery\"]");
        WebElement forget_password = browser.driver.findElement(forgetPassword);
        return forget_password;

    }



public WebElement FpwEmail (){
        By fpwEmail =By.id("Email");
        WebElement FpwEmail =browser.driver.findElement(fpwEmail);
        return FpwEmail;

}

    public WebElement recoverButton (){
        By recButton =By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        WebElement recoverButton =browser.driver.findElement(recButton);
        return recoverButton;

    }

}
