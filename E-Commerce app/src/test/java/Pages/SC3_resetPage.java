package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.browser;


public class SC3_resetPage {
    public WebElement forget_password() {
        By forgetPassword = By.xpath("//a[@href=\"/passwordrecovery\"]");
        return browser.driver.findElement(forgetPassword);

    }


    public WebElement FpwEmail() {
        By fpwEmail = By.id("Email");
        return browser.driver.findElement(fpwEmail);

    }

    public WebElement recoverButton() {
        By recButton = By.cssSelector("button[class=\"button-1 password-recovery-button\"]");
        return browser.driver.findElement(recButton);

    }

}
