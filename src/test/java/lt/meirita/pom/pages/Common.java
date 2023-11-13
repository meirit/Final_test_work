package lt.meirita.pom.pages;

import lt.meirita.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Common {
    public static void setUpChrome() {
        Driver.setChromeDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void quitDriver() {
        Driver.quitDriver();
    }
    private static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);
    }

    private static List<WebElement> getElements(By locator){
        return Driver.getDriver().findElements(locator);
    }

    public static  void sendKeysToElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public static String getTextFromElement(By locator){
        return getElement(locator).getText();
    }

    public static  void clickOnElement(By locator){
        getElement(locator).click();

    }

}
