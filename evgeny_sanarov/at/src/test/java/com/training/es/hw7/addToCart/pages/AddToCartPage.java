package com.training.es.hw7.addToCart.pages;

import com.training.es.hw7.AbstractPage;
import com.training.es.hw7.ScrollToElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToCartPage extends AbstractPage {
    @FindBy(css = "h3[class=s-item__title]")
    List<WebElement> listOfProducts;
    @FindBy(css = "[name=Condition]")
    WebElement conditionButton;
    @FindBy(css = "#msku-opt-0")
    WebElement pristineCondition;
    @FindBy(css = "[name*=Colour]")
    WebElement colourButton;
    @FindBy(css = "#msku-opt-5")
    WebElement spaceGreyColour;
    @FindBy(css = "[name=Storage]")
    WebElement storageButton;
    @FindBy(css = "#msku-opt-9")
    WebElement sixtyFourGB;
    @FindBy(css = "a[id=isCartBtn_btn]")
    WebElement addToCartButton;


    public AddToCartPage addToCart() {
        listOfProducts.get(0).click();
        conditionButton.click();
        pristineCondition.click();
        colourButton.click();
        spaceGreyColour.click();
        storageButton.click();
        sixtyFourGB.click();
        ScrollToElement.scrollToElement(addToCartButton);
        addToCartButton.click();
        return new AddToCartPage();
    }
}