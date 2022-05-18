package webUI.stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.JSONObject;
import utilities.JsonTestDataReader;
import webUI.pages.CompanyPage.CompanyPage;

public class CompanyPage_StepDef {
    CompanyPage companyPage = new CompanyPage();
    private static final JSONObject TestData = JsonTestDataReader.parseJson("JSONTestData/TestData.json");
    @Then("User should be redirected to company tab correct URL")
    public void userShouldBeRedirectedToCompanyTabCorrectURL() {
        companyPage.userShouldBeRedirectedToCompanyTabCorrectURL();
    }

    @And("User should find Leadership section is displayed")
    public void userShouldFindLeadershipSectionIsDisplayed() {
        companyPage.userShouldFindLeadershipSectionIsDisplayed();
    }

    @When("User click on the facebook link in the page footer")
    public void userClickOnTheFacebookLinkInThePageFooter() throws InterruptedException {
        companyPage.userClickOnTheFacebookLinkInThePageFooter();
    }

    @Then("User should be redirected to the company correct facebook URL")
    public void userShouldBeRedirectedToTheCompanyCorrectFacebookURL() {
        companyPage.userShouldBeRedirectedToTheCompanyCorrectFacebookURL();
    }
}
