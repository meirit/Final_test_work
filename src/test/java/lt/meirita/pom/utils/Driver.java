package lt.meirita.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    public static void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");

        drivers.set(new ChromeDriver(options));

        drivers.get().get("chrome://settings/");
        ((JavascriptExecutor) drivers.get()).executeScript("chrome.settingsPrivate.setDefaultZoom(0.7)");

//        drivers.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static WebDriver getDriver() {
        return drivers.get();
    }

    public static void quitDriver() {
        drivers.get().quit();
        drivers.remove();
    }

}
