package Pages;

import SampleFunctions.SampleFunctionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage extends SampleFunctionsPage {

    public CategoryPage(WebDriver driver) {

            super(driver);
    }
    public void clickToMenu()
    {
        clickElement(By.id("imdbHeader-navDrawerOpen"));
    }
    public void clickToOscar()
    {
        clickElement(By.cssSelector("div:nth-child(3) div > ul > a:nth-child(1)"));
    }
    public void clickToDate() throws InterruptedException {

        scroll("600");
        Thread.sleep(1000);
        clickElement(By.cssSelector("section li.ipc-tab-arrow.ipc-tab-arrow--visible.ipc-tab-arrow--right"));
        Thread.sleep(1000);
        clickElement(By.cssSelector("div.ipc-page-grid__item.ipc-page-grid__item--span-2 section > section > div > ul > li:nth-child(11)"));
        Thread.sleep(1000);
        clickElement(By.id("event-history-edition-0"));

    }
    public void clickTheJazzSingerData()
    {
        scroll("1000");
        clickElement(By.cssSelector(" div:nth-child(2) > h3 > div > div > div > div:nth-child(1) a > img"));
    }
}
