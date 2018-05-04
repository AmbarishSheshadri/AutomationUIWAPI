import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIRun {

    public WebDriver driver;
    @Test
    public void runTheUI() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/developer/UbuntuAutomation/AutomationUIWAPI/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver = new FirefoxDriver();
        driver.get("https://southwest.dev4.southwest.com/air/booking/");
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='originationAirportCode']")).sendKeys("DAL");
        WebElement fromDate = driver.findElement(By.xpath(".//*[@id='departureDate']"));
        fromDate.clear();
        fromDate.sendKeys("7/26");
        WebElement toDate = driver.findElement(By.xpath(".//*[@id='returnDate']"));
        toDate.clear();
        toDate.sendKeys("7/28");
        driver.findElement(By.xpath(".//*[@id='destinationAirportCode']")).sendKeys("HOU");
        driver.findElement(By.xpath(".//*[@id='form-mixin--submit-button']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='air-booking-fares-0-1']/div[2]/button")).click();
        driver.findElement(By.xpath(".//*[@id='air-booking-fares-1-2']/div[2]/button")).click();
        driver.findElement(By.xpath(".//*[@id='air-booking-product-2']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='upgradeToBusModal']/div/div/div[2]/div/div[2]/div/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='swa-content']/div/div[2]/div/div/section/div[2]/div/div[2]/div[3]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/button")).click();
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("601475755");
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Test1234");
        driver.findElement(By.xpath(".//*[@id='login-form--submit-button']")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath(".//*[@id='savedCreditCardToken']")).click();
        driver.findElement(By.xpath(".//*[@id='savedCreditCardToken--item-7']/button")).click();
        driver.findElement(By.xpath(".//*[@id='contactEmailAddress']")).sendKeys("x@w.com");
        driver.findElement(By.xpath(".//*[@id='creditCardSavedVerificationValue']")).sendKeys("123");
        driver.findElement(By.xpath(".//*[@id='swa-content']/div/div[2]/div/div/section/div/div/section[3]/div/div[2]/div[2]/section/div[2]/fieldset/ul/li[1]/span/input")).click();
        driver.findElement(By.xpath(".//*[@id='swa-content']/div/div[2]/div/div/section/div/div/div/button")).click();
        Thread.sleep(15000);
        String RecLoc = driver.findElement(By.xpath(".//*[@id='swa-content']/div/div[2]/div/div/section/div[1]/section/section/div/div[1]/div[2]/span")).getText();
        System.out.print(RecLoc);
        driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[1]/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div/div[1]/div[1]/ul[1]/li[3]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@id='confirmationNumber']")).sendKeys(RecLoc);
        driver.findElement(By.xpath(".//*[@id='passengerFirstName']")).sendKeys("B");
        driver.findElement(By.xpath(".//*[@id='passengerLastName']")).sendKeys("Wayne");
        driver.findElement(By.xpath(".//*[@id='form-mixin--submit-button']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath(".//*[@id='air-reservation']/div[2]/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='swa-content']/div/div[2]/div/div/section/section[2]/div[2]/button")).click();
        driver.findElement(By.xpath(".//*[@id='departureDate']")).sendKeys("07/07/2018");
        driver.findElement(By.xpath(".//*[@id='form-mixin--submit-button']")).click();

        driver.close();
    }
}

