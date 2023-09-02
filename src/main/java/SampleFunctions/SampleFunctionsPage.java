package SampleFunctions;

import Pages.HomePage;
import Pages.CategoryPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SampleFunctionsPage {
    static private WebDriver driver;
    public SampleFunctionsPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver getDriver() {
        return driver;
    }
    public HomePage callHomePage()
    {
        getDriver().get("https://www.emlakjet.com/");
        return new HomePage(getDriver());
    }
    public CategoryPage callCategoryPage()
    {
        return new CategoryPage(driver);
    }
    public WebElement findElement(By by)
    {
        untilElementLocated(by);
        return getDriver().findElement(by);
    }
    public void clickElement(By by)
    {
        untilElementClickable(by);
        getDriver().findElement(by).click();
    }
    public void sendKeysValue(By by , String text)
    {
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }
    @Deprecated
    public void untilElementClickable(By by)
    {
        new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.elementToBeClickable(by));
    }
    @Deprecated
    public void untilElementLocated(By by)
    {
        new WebDriverWait(getDriver(), 30).
                until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public void selectOptionByValue(By by, String value) {
        Select select = new Select(findElement(by));
        select.selectByValue(value);
    }
    public String getAttribute(By by, String name) {

        return findElement(by).getAttribute(name);
    }
    public void FindBySelector(String element)
    {
        untilElementLocated(By.cssSelector(element));
        findElement(By.cssSelector(element));

    }
    public void FindByXPath(String element)
    {
        untilElementLocated(By.xpath(element));
        findElement(By.cssSelector(element));
    }
    public List<WebElement> getElementsByXpath(String s)
    {
        untilElementLocated(By.xpath(s));
        return getDriver().findElements(By.xpath(s));
    }
    public List<WebElement> getElementsSelector(String s)
    {
        untilElementLocated(By.cssSelector(s));
        return getDriver().findElements(By.cssSelector(s));
    }
    public int getElementsSelectorsize(String s)
    {
        untilElementLocated(By.cssSelector(s));
        return getDriver().findElements(By.cssSelector(s)).size();
    }
    public void KeyBoardClick(By by)
    {
        untilElementLocated(by);
        findElement(by).sendKeys(Keys.ENTER);
    }
    public void KeyPassTabClick(By by)
    {
        untilElementLocated(by);
        findElement(by).sendKeys(Keys.CONTROL , Keys.TAB);
    }
    public void HandlesSecondWindow()
    {
        String winHandleBefore = getDriver().getWindowHandle();
        for(String winHandle : getDriver().getWindowHandles()){
            getDriver().switchTo().window(winHandle);
        }
    }
    public void scroll(String deger)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+deger+")", "");
    }
}
