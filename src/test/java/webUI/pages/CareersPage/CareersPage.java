package webUI.pages.CareersPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.ConfigUtil;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;

import java.util.List;

public class CareersPage {
    private static final String CareersPageURL = ConfigUtil.getProperty("CareersPageURL");
    private static final String JoinUsPageURLe = ConfigUtil.getProperty("JoinUsPageURLe");

    private static final By OpenPositions_Button = By.xpath("//span[contains(text(),'Check our open positions')]");
    private static final By Location_DropDown = By.id("get_location");
    private static final By openPosition = By.xpath("//*[@class='card-jobsHot__link']");
    private static final By AvailablePositions = By.xpath("//*[@class='card-jobsHot__title']");
    private static final By GeneralDescription_header = By.xpath("//h2[contains(text(),'General description')]");
    private static final By Requirements_header = By.xpath("//h2[contains(text(),'Requirements')]");
    private static final By Responsibility_header = By.xpath("//h2[contains(text(),'Responsibilities')]");
    private static final By WhatWeOffer_header = By.xpath("//h2[contains(text(),'What we offer')]");
    private static final By Apply_Button = By.xpath("//input[@value='Apply']");
    private static final By ApplyForm_Name_field = By.xpath("//input[@id='cf-1']");
    private static final By ApplyForm_Email_field = By.xpath("//input[@id='cf-2']");
    private static final By TermsAndonditions_Button = By.id("adConsentChx");
    private static final By SendApplication_Button = By.xpath("//input[@value='Send']");
    private static final By ApplyForm_InvalidEmailErrorMessage = By.xpath("//span[contains(text(),'The e-mail address entered is invalid.')]");
    private static final By CloseForm_Button = By.xpath("//button[contains(text(),'Close')]");


    public void userClickOnCheckOurOpenPositionsButton() {
        ElementActions.click(OpenPositions_Button);
    }

    public void usersShouldBeRedirectedToJoinUsPageWithTheCorrectURL() {
        Assert.assertEquals(BrowserActions.getCurrentURL(), JoinUsPageURLe);
        System.out.println(BrowserActions.getCurrentURL());
    }

    public void userSelectFromTheSelectLocationDropdown(String location) {
        ElementActions.selectByValueDropDown(Location_DropDown, location);
    }

    public void userChooseOpenPositionByName(String positionName){
        List<WebElement> openPositions = ElementActions.getAllElements(AvailablePositions);
        for (int i = 0; i < openPositions.size(); i++) {
            if (openPositions.get(i).getText().equalsIgnoreCase(positionName)) {
                openPositions.get(i).click();
                break;
            }
        }
    }

    public void userShouldFindGeneralDescriptionRequirementsResponsibilitiesWhatWeOfferSectionsDisplayed() {
        ElementActions.ElementIsDisplayed(GeneralDescription_header);
        ElementActions.ElementIsDisplayed(Requirements_header);
        ElementActions.ElementIsDisplayed(Responsibility_header);
        ElementActions.ElementIsDisplayed(WhatWeOffer_header);
    }

    public void userShouldFindApplyButtonDisplayed() {
        ElementActions.ElementIsDisplayed(Apply_Button);
    }

    public void userClickOnApplyButton() {
        ElementActions.click(Apply_Button);
    }

    public void userEnterValidName(String validName) {
        ElementActions.typeText(ApplyForm_Name_field,validName);
    }

    public void userClickOnSendButton() {
        ElementActions.click(TermsAndonditions_Button);
        ElementActions.click(SendApplication_Button);
        ElementActions.click(CloseForm_Button);
    }

    public void userEnterInvalidEmailAddress(String invalidFormatEmail) {
        ElementActions.typeText(ApplyForm_Email_field, invalidFormatEmail);
    }

    public void anInlineErrorMessageDisplayedUnderEmailField() {
        Assert.assertTrue(ElementActions.ElementIsDisplayed(ApplyForm_InvalidEmailErrorMessage));
    }

    public void PrintOpenPositionInfo(String city) {
        boolean jobFound = false;
        List<WebElement> openPositions = ElementActions.getAllElements(openPosition);
        System.out.println(city);
        for (int i = 0; i < openPositions.size(); i++) {
            if(openPositions.get(i).getText().contains(city)){
            System.out.println("Position : " +openPositions.get(i).getText());
            System.out.println();
            System.out.println("More Info : " +openPositions.get(i).getAttribute("href"));
            jobFound=true;
            }}
        System.out.println("---------------------------------------------");
        if(jobFound==false)
        {
            System.out.println("No Jobs Found");
        }
    }

}