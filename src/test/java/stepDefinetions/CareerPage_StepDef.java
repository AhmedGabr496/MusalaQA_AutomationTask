package stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.JSONObject;
import utilities.JsonTestDataReader;
import pages.CareersPage.CareersPage;

public class CareerPage_StepDef {
    CareersPage careersPage = new CareersPage();
    private static final JSONObject TestData = JsonTestDataReader.parseJson("JSONTestData/TestData.json");

    @And("User Click on \\(check our open positions) button")
    public void userClickOnCheckOurOpenPositionsButton() {
        careersPage.userClickOnCheckOurOpenPositionsButton();
    }

    @Then("Users should be redirected to \\(Join Us) page with the correct URL")
    public void usersShouldBeRedirectedToJoinUsPageWithTheCorrectURL() {
        careersPage.usersShouldBeRedirectedToJoinUsPageWithTheCorrectURL();
    }

    @When("User Select {string} from the select location dropdown")
    public void userSelectFromTheSelectLocationDropdown(String Location) {
        careersPage.userSelectFromTheSelectLocationDropdown(Location);
    }

    @And("User choose open position by name {string}")
    public void userChooseOpenPositionByName(String postionName) throws InterruptedException {
        careersPage.userChooseOpenPositionByName(postionName);
    }

    @Then("User should find General Description & Requirements & Responsibilities & What we offer Sections Displayed")
    public void userShouldFindGeneralDescriptionRequirementsResponsibilitiesWhatWeOfferSectionsDisplayed() {
    careersPage.userShouldFindGeneralDescriptionRequirementsResponsibilitiesWhatWeOfferSectionsDisplayed();
    }

    @And("User should find Apply button displayed")
    public void userShouldFindApplyButtonDisplayed() {
        careersPage.userShouldFindApplyButtonDisplayed();
    }

    @When("User Click on Apply button")
    public void userClickOnApplyButton() {
        careersPage.userClickOnApplyButton();
    }

    @And("user Enter valid Name")
    public void userEnterValidName() {
        careersPage.userEnterValidName((String) TestData.get("ValidName"));
    }

    @And("User Enter invalid Email Address")
    public void userEnterInvalidEmailAddress() {
        careersPage.userEnterInvalidEmailAddress((String) TestData.get("InvalidFormatEmail"));
    }

    @And("User click on send button")
    public void userClickOnSendButton() {
        careersPage.userClickOnSendButton();
    }

    @Then("An Inline error message displayed under email field")
    public void anInlineErrorMessageDisplayedUnderEmailField() {
        careersPage.anInlineErrorMessageDisplayedUnderEmailField();
    }

    @And("Get the Open positions in {string}")
    public void getTheOpenPositionsIn(String city) {
        careersPage.PrintOpenPositionInfo(city);
    }
}
