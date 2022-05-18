package webUI.stepDefinetions;

import io.cucumber.java.en.Given;
import webUI.pages.newPage;

public class MyStepdefs {
    newPage  newPage = new newPage();
    @Given("Test URL")
    public void testURL() {
        System.out.println("new test");
        newPage.testURL();
    }
}
