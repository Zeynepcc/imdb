import BaseConfig.BaseConfigPage;
import Pages.HomePage;
import Pages.CategoryPage;
import com.thoughtworks.gauge.Step;

public class CategoryPageStep extends BaseConfigPage {


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
}
