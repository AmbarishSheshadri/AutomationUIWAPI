import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightSearchPage extends Base{

    public FlightSearchPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
    }

    public void flightSearchPage() throws InterruptedException {
        System.out.println("------>Entering Flight Search Page");
        WebElement fromState = driver.findElement(By.xpath(".//*[@id='eairshoppers1_airSearch_boundsTable_id_0_from']"));
        fromState.sendKeys("DAL");
        fromState.sendKeys(Keys.TAB);
        WebElement toState =driver.findElement(By.xpath(".//*[@id='eairshoppers1_airSearch_boundsTable_id_0_to']"));
        toState.sendKeys("HOU");
        toState.sendKeys(Keys.TAB);
        WebElement calender = driver.findElement(By.xpath(".//*[@id='eairshoppers1_airSearch_boundsTable_id_0_date']"));
        calender.clear();
        calender.sendKeys("032518");
        calender.sendKeys(Keys.TAB);
        Select drop = new Select(driver.findElement(By.name("searchType")));
        drop.selectByVisibleText("Informative Pricing & Availability");
       WebElement search = driver.findElement(By.xpath(".//*[@id='eairshoppers1_airSearch_search_id']"));
       search.click();
       Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(".//*[@id='eairshoppers1_availContainer_0']/div[1]/table/tbody/tr[2]/td[3]/span[1]"))).doubleClick().build().perform();
        WebElement price = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='w49_priceBtn']/button")));
        price.click();
        Thread.sleep(15000);
        System.out.println("------>Exiting Flight Search Page");
    }
}
