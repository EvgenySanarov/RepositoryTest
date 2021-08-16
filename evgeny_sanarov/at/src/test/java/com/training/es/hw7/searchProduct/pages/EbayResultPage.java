package com.training.es.hw7.searchProduct.pages;

import com.training.es.hw7.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EbayResultPage extends AbstractPage {

    @FindBy(css = "h3[class=s-item__title]")
    List<WebElement> listOfProducts;

    public String getTextFromFirstProduct() {
        return listOfProducts.get(0).getText();
    }
}