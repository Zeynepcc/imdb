package Pages;

import SampleFunctions.SampleFunctionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SampleFunctionsPage {

    public HomePage(WebDriver driver)
    {
        super(driver);
        getDriver().get("https://www.imdb.com/");
    }

    public void searchMovie()
    {
        findElement(By.id("suggestion-search")).sendKeys("The Jazz Singer");
        clickElement(By.id("suggestion-search-button"));
    }

}
