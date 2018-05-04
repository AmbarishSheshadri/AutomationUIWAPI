import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Run extends Base{

    public WebDriver driver;

    Properties x = new Properties();
    InputStream input = new FileInputStream("Configuration.properties");


    public Run() throws FileNotFoundException {
    }

    @Test
    public void runUI() throws InterruptedException {
        driver = baseClass();
        LoginPage login = new LoginPage(driver);
        login.loginPage();
        LandingPage land = new LandingPage(driver);
        land.landingPage();
        FlightSearchPage flight = new FlightSearchPage(driver);
        flight.flightSearchPage();
        PricingPage pricing = new PricingPage(driver);
        pricing.pricingPage();

        driver.close();


    }



}
