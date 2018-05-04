import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{

    public LoginPage(WebDriver driver) {
       this.driver = driver;
    }

    public WebDriver loginPage() throws InterruptedException {
        System.out.println("-->Reached Login Page");
        System.out.println("-->   *Submitting credentials");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/form/fieldset/span/input")).sendKeys("T1DAL1GL");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/form/fieldset/div[3]/input")).sendKeys("2Amadeus");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div/div/form/fieldset/div[6]/button[1]")).click();
        Thread.sleep(20000);
        System.out.println("-->Stepping out of Login Page");
        return driver;
    }
}
