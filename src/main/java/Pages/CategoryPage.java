package Pages;

import SampleFunctions.SampleFunctionsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.util.Properties;

public class CategoryPage extends SampleFunctionsPage {

    static Properties prop;

    public CategoryPage(WebDriver driver) {

        super(driver);
    }

    public void clickToMenu() {
        clickElement(By.id("imdbHeader-navDrawerOpen"));
    }

    public void clickToOscar() {
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

    public void clickTheJazzSingerData() {
        scroll("1000");
        clickElement(By.cssSelector(" div:nth-child(2) > h3 > div > div > div > div:nth-child(1) a > img"));
    }

    public void saveTheInfo() {
        String director = findElement(By.cssSelector("div.sc-e226b0e3-6.ktaZPG div.sc-acac9414-3.hKIseD li:nth-child(1)  ul > li > a")).getText();
        String writer = findElement(By.cssSelector("div.sc-acac9414-3.hKIseD  li:nth-child(2) li:nth-child(1) > a")).getText();
        String stars = findElement(By.cssSelector("div.sc-acac9414-3.hKIseD  li:nth-child(3)  li:nth-child(1) > a")).getText();
        try (OutputStream output = new FileOutputStream("Data/MovieData")) {
            prop = new Properties();
            prop.setProperty("Director", director);
            prop.setProperty("Writer", writer);
            prop.setProperty("Stars", stars);
            prop.store(output, null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void returnToHomePage() {
        clickElement(By.id("home_img_holder"));
    }

    public void clickToCurrentMovie() {
        scroll("300");
        clickElement(By.cssSelector("section:nth-child(3) > div.sc-17bafbdb-2.ffAEHI > ul > li:nth-child(2)"));
    }
    public boolean compareData() throws IOException {

        boolean deger = true;
        scroll("300");
        String director = findElement(By.cssSelector("div.sc-e226b0e3-6.ktaZPG div.sc-acac9414-3.hKIseD li:nth-child(1)  ul > li > a")).getText();
        String writer = findElement(By.cssSelector("div.sc-acac9414-3.hKIseD  li:nth-child(2) li:nth-child(1) > a")).getText();
        String stars = findElement(By.cssSelector("div.sc-acac9414-3.hKIseD  li:nth-child(3)  li:nth-child(1) > a")).getText();
        prop = new Properties();
        FileInputStream ip = new FileInputStream("Data/MovieData");
        prop.load(ip);
        if(prop.getProperty("Director", director).equals(director) && prop.getProperty("Writer", writer).equals(writer) &&
                prop.getProperty("Stars").equals(stars))
        {
                deger = true;
        }
        else
        {
            deger = false;
        }
        return deger;
    }
    public void goToGallery() throws InterruptedException {
        scroll("500");
        Thread.sleep(2000);
        clickElement(By.cssSelector("  div > section  section:nth-child(7) div.ipc-sub-grid.ipc-sub-grid--page-span-2.ipc-sub-grid--nowrap.ipc-shoveler__grid > div:nth-child(1) > a"));
        clickElement(By.cssSelector(".fGsyYo > a"));
    }
}

