package com.etsy.step_definitions;

import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpScenario(){
        Driver.getDriver().get(ConfigurationReader.getProperty("Url"));
    }
    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }
}
