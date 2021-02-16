package com.etsy.step_definitions;

import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsyTitleVerification_StepDefinitions {
    @Given("I am on home page")
    public void i_am_on_home_page() {
        //use Hooks to go HomePage
    }

    @Then("Home page should displayed {string}")
    public void homePageShouldDisplayed(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}
