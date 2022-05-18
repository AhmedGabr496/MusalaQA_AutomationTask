package utilities.actions;

import utilities.TestBase;

import java.util.ArrayList;

public class BrowserActions extends TestBase {

    public static void getPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    public static void switchToOpenedTab(int tabNumber) {
        System.out.println(driver.getWindowHandle());
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabNumber));
        System.out.println(driver.getWindowHandle());
    }
}
