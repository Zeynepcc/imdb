import BaseConfig.BaseConfigPage;
import Pages.HomePage;
import com.thoughtworks.gauge.Step;

public class HomeSteps extends BaseConfigPage {

        @Step("Open WebSite")
        public void OpenSite() {

            new HomePage(getDriver());

        }
    }