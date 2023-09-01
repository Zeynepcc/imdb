import BaseConfig.BaseConfigPage;
import Pages.CategoryPage;
import Pages.HomePage;
import com.thoughtworks.gauge.Step;

public class HomeSteps extends BaseConfigPage {

    @Step("Open WebSite")
    public void OpenSite() {

        new HomePage(getDriver());

    }

    @Step("Film aratilir")
    public void step8() {

        new HomePage(getDriver()).searchMovie();
    }

}