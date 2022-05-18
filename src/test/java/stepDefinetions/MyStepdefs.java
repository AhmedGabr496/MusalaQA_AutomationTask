package stepDefinetions;

import io.cucumber.java.en.Given;
import pages.newPage;

public class MyStepdefs {
    pages.newPage newPage = new newPage();
    @Given("Test URL")
    public void testURL() {
        System.out.println("new test");
        newPage.testURL();
    }
}
