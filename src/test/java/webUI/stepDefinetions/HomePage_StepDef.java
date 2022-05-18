package webUI.stepDefinetions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.JSONObject;
import utilities.JsonTestDataReader;
import webUI.pages.HomePage.HomePage;

public class HomePage_StepDef {
    HomePage homePage = new HomePage();
    private static final JSONObject TestData = JsonTestDataReader.parseJson("JSONTestData/TestData.json");
    @Given("User navigate to musala soft website")
    public void userNavigateToMusalaSoftWebsite() {
        homePage.userNavigateToMusalaSoftWebsite();
    }

    @And("User scroll down and click on Contact Us Button")
    public void userScrollDownAndClickOnContactUsButton() throws InterruptedException {
        homePage.userScrollDownAndClickOnContactUsButton();
    }

    @And("User Enter valid Name")
    public void userEnterValidName() {
        homePage.userEnterValidName((String) TestData.get("ValidName"));
    }

    @And("User Enter Valid Subject")
    public void userEnterValidSubject() {
        homePage.userEnterValidSubject((String) TestData.get("ValidSubject"));
    }

    @And("User Enter Valid Message")
    public void userEnterValidMessage() {
        homePage.userEnterValidMessage((String) TestData.get("ValidMessage"));

    }

    @And("User Enter Invalid Email {string}")
    public void userEnterInvalidEmail(String InvalidEmail) {
        homePage.userEnterInvalidEmail((String) TestData.get(InvalidEmail));
    }

    @When("User Click on Send Button")
    public void userClickOnSendButton() {
        homePage.userClickOnSendButton();
    }

    @Then("An Inline error message appears under email address field")
    public void anInlineErrorMessageAppearsUnderEmailAddressField() {
        homePage.anInlineErrorMessageAppearsUnderEmailAddressField();
    }

    @When("User Clicks on the Company tab")
    public void userClicksOnTheCompanyTab() {
        homePage.userClicksOnTheCompanyTab();
    }

    @And("User Navigate to the Careers menu")
    public void userNavigateToTheCareersMenu() {
        homePage.userNavigateToTheCareersMenu();
    }
}
