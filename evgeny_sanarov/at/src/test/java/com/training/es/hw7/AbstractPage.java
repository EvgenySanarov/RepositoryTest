package com.training.es.hw7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected WebDriver driver = WebDriverConfig.setUp();

    public AbstractPage() {
        this.driver = WebDriverConfig.driver;
        PageFactory.initElements(driver, this);
    }
}