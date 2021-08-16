package com.training.es.hw7.addToCart.steps;


import com.training.es.hw7.addToCart.pages.AddToCartPage;
import com.training.es.hw7.addToCart.pages.EbayCartPage;
import com.training.es.hw7.searchProduct.pages.EbayHomePage;
import com.training.es.hw7.searchProduct.pages.EbayResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class AddToCartStepdefs {

    @Given("^the term query \"([^\"]*)\" is first in the Search Result grid$")
    public void theTermQueryIsFirstInTheSearchResultGrid(String query) {
        new EbayHomePage().openPage().enterQuery(query).clickSubmit();
    }

    @When("^I add the product \"([^\"]*)\" in the cart$")
    public void iAddProductToTheCart(String arg0) {
        new AddToCartPage().addToCart();
    }

    @Then("^product \"([^\"]*)\" should be in the cart$")
    public void productShouldBeInTheCart(String expectProductName) {
        assertThat(new EbayCartPage().getTextFromProductInCard(), containsString(expectProductName));
    }
}