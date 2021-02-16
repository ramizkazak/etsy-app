package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePAge {
    public HomePAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBar;

    @FindBy(className = "wt-input-btn-group__btn")
    public WebElement searchButton;
}
