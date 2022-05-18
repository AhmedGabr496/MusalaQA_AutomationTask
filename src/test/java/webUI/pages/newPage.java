package webUI.pages;

import utilities.ConfigUtil;
import utilities.TestBase;
import utilities.actions.BrowserActions;

public class newPage {
    public void testURL() {
        BrowserActions.getPage(ConfigUtil.getProperty("BaseURL"));
    }
}
