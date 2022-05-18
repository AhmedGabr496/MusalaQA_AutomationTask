package utilities.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class ElementActions extends TestBase {
    private static JavascriptExecutor js;

    private static WebElement initiateElement(By locator) {
        return driver.findElement(locator);
    }

    public static void click(By element) {
        scrollToElement(element);
        initiateElement(element).click();
    }

    public static void scrollToElement(By element) {
        ((JavascriptExecutor)driver).executeScript( "arguments[0].scrollIntoView();", initiateElement(element));
    }

    public static void typeText(By element, String validName) {
        initiateElement(element).sendKeys(validName);
    }

    public static boolean ElementIsDisplayed(By element) {
        scrollToElement(element);
        return initiateElement(element).isDisplayed();
    }
    public static void selectByValueDropDown(By element , String value){
        scrollToElement(element);
        Select select = new Select(initiateElement(element));
        select.selectByValue(value);
    }
    public static void selectByIndexDropDown(By element , int index){
        Select select = new Select(initiateElement(element));
        select.selectByIndex(index);
    }

    public static List<WebElement> getAllElements(By elements) {
        return  driver.findElements(elements);
    }
}
