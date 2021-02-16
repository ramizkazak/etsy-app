package com.etsy.step_definitions;

import com.etsy.pages.HomePAge;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class EtsySearchVerification_StepDefinitions {
    HomePAge homePAge = new HomePAge();

    @And("I should able to use searchbar")
    public void iShouldAbleToUseSearchbar() {
        homePAge.searchBar.sendKeys(ConfigurationReader.getProperty("item1"));
    }

    @And("I should able to click search button")
    public void i_should_able_to_click_search_button() {
        homePAge.searchButton.click();
    }
    @Then("search result should displayed")
    public void search_result_should_displayed() {
        String expectedTitle="Wooden spoon | Etsy";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("I enter {string} in searchbar")
    public void i_enter_in_searchbar(String text) {
        homePAge.searchBar.sendKeys(text);


    }


    @Then("search result should {string} displayed")
    public void searchResultShouldDisplayed(String expectedTitle) {
        String actualText = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualText);

    }
}
