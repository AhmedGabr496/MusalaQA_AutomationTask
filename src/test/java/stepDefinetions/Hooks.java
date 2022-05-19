package stepDefinetions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigUtil;
import utilities.TestBase;

public class Hooks {

    @Before
    public void  browserSetup(){
        String browserType =(ConfigUtil.getProperty("BrowserType"));
        TestBase.setBrowser(browserType);}

    @After
    public void TearDown(){
        TestBase.closeDriver();
    }
}
