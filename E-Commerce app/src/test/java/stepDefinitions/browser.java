package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class browser{
    public static WebDriver driver;
    @Before
    public static void open_browser()
    {

        WebDriverManager.chromedriver() .setup();
        driver = new ChromeDriver();
        driver.manage() .window().maximize();

    }

    @After
    public static void quit_browser()
    {
        driver.quit();
    }
}
