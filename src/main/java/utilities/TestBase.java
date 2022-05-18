package utilities;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestBase {
    public static WebDriver driver;

    @Parameters("browserType")
    public static void setBrowser(String browserType) {
        System.out.printf("Browser Type = " + browserType);
        switch (browserType) {
            case "Chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "FireFox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            case "Edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public static void closeDriver() {
        if (driver != null)
            driver.quit();
        //driver.close();
        driver = null;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
