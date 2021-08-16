package com.training.es.hw7.searchProduct.pages;

import com.training.es.hw7.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends AbstractPage {

    public static final String URL = "https://www.ebay.com/";

    @FindBy(css = "input[type=text]")
    WebElement searchInput;
    @FindBy(css = "input[type=submit]")
    WebElement submitButton;

    Logger logger = LogManager.getLogger(EbayHomePage.class.getName());

    public EbayHomePage openPage() {
        logger.info("Go to the base page " + URL);
        driver.get(URL);
        return this;
    }

    public EbayHomePage enterQuery(String query) {
        logger.info("Search by criteria " + query);
        logger.debug("Enter " + searchInput + " in the Search field");
        searchInput.sendKeys(query);
        return new EbayHomePage();
    }

    public EbayResultPage clickSubmit() {
        logger.debug("Clicking the Submit button");
        submitButton.click();
        return new EbayResultPage();
    }
}