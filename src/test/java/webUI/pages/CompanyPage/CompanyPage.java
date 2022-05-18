package webUI.pages.CompanyPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ConfigUtil;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;

public class CompanyPage {

    private static final String CompanyPageURL = ConfigUtil.getProperty("CompanyPageURL");
    private static final String CompanyFaceBookPageURL = ConfigUtil.getProperty("CompanyFaceBookPageURL");
    private static final By LeaderShipSection_Header = By.xpath("//h2[contains(text(),'Leadership')]");
    private static final By FacebookPage_button = By.xpath("//span[@class='musala musala-icon-facebook']");
    private static final By AcceptCookiesButton = By.id("wt-cli-accept-all-btn");

    public void userShouldBeRedirectedToCompanyTabCorrectURL() {
        Assert.assertEquals(BrowserActions.getCurrentURL(),CompanyPageURL);
        System.out.println(BrowserActions.getCurrentURL());
    }

    public void userShouldFindLeadershipSectionIsDisplayed() {
        ElementActions.scrollToElement(LeaderShipSection_Header);
        Assert.assertTrue(ElementActions.ElementIsDisplayed(LeaderShipSection_Header));

    }

    public void userClickOnTheFacebookLinkInThePageFooter() throws InterruptedException {
        ElementActions.scrollToElement(AcceptCookiesButton);
        ElementActions.click(AcceptCookiesButton);
        ElementActions.scrollToElement(FacebookPage_button);
        ElementActions.click(FacebookPage_button);
        Thread.sleep(5500);
    }

    public void userShouldBeRedirectedToTheCompanyCorrectFacebookURL() {
        BrowserActions.switchToOpenedTab(1);
        Assert.assertEquals(BrowserActions.getCurrentURL(),CompanyFaceBookPageURL);
        System.out.println(BrowserActions.getCurrentURL());
    }
}
