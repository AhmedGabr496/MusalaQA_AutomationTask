package pages.HomePage;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.ConfigUtil;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;

public class HomePage {

    private static final By ContactUs_Button = By.xpath("//*[@class='contact-label btn btn-1b']");
    private static final By ContactUs_Name_TXT_FIELD = By.xpath("//input[@id='cf-1']");
    private static final By ContactUs_Subject_TXT_FIELD = By.xpath("//input[@id='cf-4']");
    private static final By ContactUs_Message_TXT_FIELD = By.xpath("//textarea[@id='cf-5']");
    private static final By ContactUs_Email_TXT_FIELD = By.xpath("//input[@id='cf-2']");
    private static final By ContactUs_Send_Button = By.xpath("//input[@type='submit']");
    private static final By ContactUs_InvalidEmailErrorMessage = By.xpath("//span[contains(text(),'The e-mail address entered is invalid.')]");
    private static final By CompanyTab_Button = By.xpath("//header/nav[2]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    private static final By CareersTab_Button = By.xpath("//header/nav[2]/div[1]/div[1]/ul[1]/li[5]/a[1]");

    private static final String HomePageURL = ConfigUtil.getProperty("HomePageURL");
    public void userNavigateToMusalaSoftWebsite() {
        BrowserActions.getPage(ConfigUtil.getProperty("BaseURL"));
    }

    public void userScrollDownAndClickOnContactUsButton() throws InterruptedException {
        ElementActions.scrollToElement(ContactUs_Button);
        ElementActions.click(ContactUs_Button);

    }

    public void userEnterValidName(String validName) {
        ElementActions.typeText(ContactUs_Name_TXT_FIELD, validName);
    }

    public void userEnterValidSubject(String validSubject) {
        ElementActions.typeText(ContactUs_Subject_TXT_FIELD, validSubject);
    }

    public void userEnterValidMessage(String validMessage) {
        ElementActions.typeText(ContactUs_Message_TXT_FIELD, validMessage);

    }

    public void userEnterInvalidEmail(String InvalidEmail) {
        ElementActions.typeText(ContactUs_Email_TXT_FIELD, InvalidEmail);

    }

    public void userClickOnSendButton() {
        ElementActions.click(ContactUs_Send_Button);
    }

    public void anInlineErrorMessageAppearsUnderEmailAddressField() {
        Assert.assertTrue(ElementActions.ElementIsDisplayed(ContactUs_InvalidEmailErrorMessage));
    }

    public void userClicksOnTheCompanyTab() {
        ElementActions.scrollToElement(CompanyTab_Button);
        ElementActions.click(CompanyTab_Button);
    }

    public void userNavigateToTheCareersMenu() {
        ElementActions.click(CareersTab_Button);
    }
}
