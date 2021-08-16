package com.training.es.hw7.addToCart.pages;

import com.training.es.hw7.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartPage extends AbstractPage {
    @FindBy(css = "[class=BOLD]")
    WebElement product;

    public String getTextFromProductInCard() {
        return product.getText();
    }
}