package com.training.es.hw7.searchProduct.steps;

import com.training.es.hw7.searchProduct.pages.EbayHomePage;
import com.training.es.hw7.searchProduct.pages.EbayResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class EbayStepDefs {
    @Given("^I opened Ebay Page$")
    public void iOpenedEbayPage1() {
        new EbayHomePage().openPage();
    }

    @When("^I search the product \"([^\"]*)\"$")
    public void iSearchTheProduct1(String query) {
        new EbayHomePage().enterQuery(query).clickSubmit();
    }

    @Then("^the term query \"([^\"]*)\" should be the first int the Search Result grid$")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid1(String expectProductName){
        assertThat(new EbayResultPage().getTextFromFirstProduct(), containsString(expectProductName));
    }

    @Then("^the term query \"([^\"]*)\" should be the first in the Search Result grid$")
    public void theTermQueryShouldBeTheFirstInheSearchResultGrid1(String expectProductName) {
        assertThat(new EbayResultPage().getTextFromFirstProduct(), containsString(expectProductName));
    }
}