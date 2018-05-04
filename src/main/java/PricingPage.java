import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class PricingPage extends Base {


    public PricingPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
    }

    public void pricingPage() throws InterruptedException {
        System.out.println("-------->Entering Pricing Page");
        driver.findElement(By.xpath(".//*[@id='eitineraryPricings1_generalOptionsSection_search_id']")).click();
        Set<String> myWindowHandle = driver.getWindowHandles();
        Iterator<String> list = myWindowHandle.iterator();
        System.out.println(list.hasNext());
        WebElement addPriceSummary = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='eitineraryPricings1_availableFares_confirmFares_id']")));
        addPriceSummary.click();

        WebElement updatePassenger = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='eitineraryPricings1_pricingSummary_updatePassengers_id']")));
        updatePassenger.click();

        Thread.sleep(5000);

        String winHandleBefore = driver.getWindowHandle();
        System.out.println(winHandleBefore);

// Switch to new window opened
//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
//        System.out.println(driver.getTitle());



        driver.findElement(By.xpath(".//*[@id='tpl30_paxPopupApplyButton']/button")).click();
        driver.wait(1000);
        System.out.println("-------->Exiting Pricing Page");
    }
    }