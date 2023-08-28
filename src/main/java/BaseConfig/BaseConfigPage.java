package BaseConfig;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class BaseConfigPage {

    static private WebDriver driver;


    @BeforeSuite
    public void Prepare()  {

        System.setProperty("webdriver.chrome.driver", "Settings/Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        getDriver().manage().window().maximize();


    }
    @AfterSuite
    public void quit()
    {
        driver.quit();
    }
    public WebDriver getDriver() { return driver;}
    public void setDriver(WebDriver driver) { this.driver = driver;}
}
