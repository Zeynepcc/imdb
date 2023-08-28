package Pages;

import SampleFunctions.SampleFunctionsPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends SampleFunctionsPage {

    public HomePage(WebDriver driver)
    {
        super(driver);
        getDriver().get("https://www.imdb.com/");
    }
}
