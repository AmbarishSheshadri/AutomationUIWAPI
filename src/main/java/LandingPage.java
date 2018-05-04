import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage extends Base{

    public LandingPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
    }

    public void landingPage() throws InterruptedException {
        System.out.println("---->Entering into Landing Page");
        WebElement toCity = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[4]/div[1]/div/dl/dt[1]/a/div")));
        toCity.click();
        //driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[4]/div[1]/div/dl/dt[1]/a/div")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[4]/div[1]/div/dl/dd[1]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[3]/div/ul/li[1]/a")).click();
        Thread.sleep(10000);
        System.out.println("---->Exiting Landing Page");

    }
}
