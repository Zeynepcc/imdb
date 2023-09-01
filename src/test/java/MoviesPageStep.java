import BaseConfig.BaseConfigPage;
import Pages.HomePage;
import Pages.CategoryPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class MoviesPageStep extends BaseConfigPage {


    @Step("Imdb sayfasi acilir")
    public void step1() {

        new HomePage(getDriver());

    }

    @Step("Arama cubugunun sol tarafinda bulunan 'Menu' butonuna basilir")
    public void step2() {

        new HomePage(getDriver()).callCategoryPage().clickToMenu();

    }

    @Step("Oscar butonuna tiklanilir")
    public void step3() {

        new CategoryPage(getDriver()).callCategoryPage().clickToOscar();

    }

    @Step("Event History basligi altinda 1929 değeri secilir")
    public void step4() throws InterruptedException {

        new CategoryPage(getDriver()).callCategoryPage().clickToDate();

    }

    @Step("The Jazz Singer filmi secilir")
    public void step5() {

        new CategoryPage(getDriver()).callCategoryPage().clickTheJazzSingerData();

    }

    @Step("Film bilgileri dosyada tutulur")
    public void step6() {
        new CategoryPage(getDriver()).callCategoryPage().saveTheInfo();
    }

    @Step("Imbd butonuna tiklanip anasayfaya gidilir")
    public void step7() {

        new CategoryPage(getDriver()).callCategoryPage().returnToHomePage();
    }

    @Step("Cikan sonuna tiklanilir")
    public void step9() {
        new CategoryPage(getDriver()).callCategoryPage().clickToCurrentMovie();
    }

    @Step("Datalarin dogrulugu karsilastirilir")
    public void step10() throws IOException {
        Assert.assertTrue(new CategoryPage(getDriver()).callCategoryPage().compareData());
    }

    @Step("Galeriye gidilir")
    public void step11() throws InterruptedException {
        new CategoryPage(getDriver()).callCategoryPage().goToGallery();
    }

    @Step("Linklerin kirik olmadigi gorulur")
    public void implementation1() {

        //yap

    }
}
