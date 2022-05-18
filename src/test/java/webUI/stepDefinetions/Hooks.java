package webUI.stepDefinetions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.TestBase;

public class Hooks {

    @Before
    public void  browserSetup(){
        TestBase.setBrowser();}

    @After
    public void TearDown(){
        TestBase.closeDriver();
    }
}
