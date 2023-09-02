import BaseConfig.BaseConfigPage;
import Pages.HomePage;
import Pages.CategoryPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class MoviesPageStep extends BaseConfigPage {


    @Step("Imdb sayfasi acilir")
    public void imdbSayfasiAcilir() {

        new HomePage(getDriver());

    }

    @Step("Arama cubugunun sol tarafinda bulunan 'Menu' butonuna basilir")
    public void menuButonunaBasilir() {

        new HomePage(getDriver()).callCategoryPage().clickToMenu();

    }

    @Step("Oscar butonuna tiklanilir")
    public void oscarButonunaTiklanilir() {

        new CategoryPage(getDriver()).callCategoryPage().clickToOscar();

    }

    @Step("Event History basligi altinda 1929 değeri secilir")
    public void ilgiliYilSecilir() throws InterruptedException {

        new CategoryPage(getDriver()).callCategoryPage().clickToDate();

    }

    @Step("The Jazz Singer filmi secilir")
    public void ilgiliFilmSecilir() {

        new CategoryPage(getDriver()).callCategoryPage().clickTheJazzSingerData();

    }

    @Step("Film bilgileri dosyada tutulur")
    public void filmBilgileriKaydedilir() {
        new CategoryPage(getDriver()).callCategoryPage().saveTheInfo();
    }

    @Step("Imbd butonuna tiklanip anasayfaya gidilir")
    public void anasayfayaGidilir() {

        new CategoryPage(getDriver()).callCategoryPage().returnToHomePage();
    }

    @Step("Cikan sonuca tiklanilir")
    public void sonucaTiklanilir() {
        new CategoryPage(getDriver()).callCategoryPage().clickToCurrentMovie();
    }

    @Step("Datalarin dogrulugu karsilastirilir")
    public void datalarKarsilastirilir() throws IOException {
        Assert.assertTrue(new CategoryPage(getDriver()).callCategoryPage().compareData());
    }

    @Step("Galeriye gidilir")
    public void galeriyeGidilir() throws InterruptedException {
        new CategoryPage(getDriver()).callCategoryPage().goToGallery();
    }

    @Step("Linklerin kirik olmadigi gorulur")
    public void kirikLinkKontrolEdilir() {

        new CategoryPage(getDriver()).callCategoryPage().linkBrokenControl();

    }
}
