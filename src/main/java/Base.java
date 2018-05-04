import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


public class Base {
    public WebDriver driver;




    public WebDriver baseClass() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/developer/UbuntuAutomation/AutomationUIWAPI/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver = new FirefoxDriver();
        driver.get("https://southwest.dev1.southwest.com/air/booking/");
        Thread.sleep(5000);
        return driver;
    }
}
