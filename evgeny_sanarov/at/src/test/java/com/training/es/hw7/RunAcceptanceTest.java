package com.training.es.hw7;

import com.training.es.hw7.WebDriverConfig;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        plugin = {
                "pretty",
                "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        },
        tags = {"@searchProduct"}
)
public class RunAcceptanceTest {
        @AfterMethod
        public void colorElement(WebElement elem) {

                if (WebDriverConfig.driver instanceof JavascriptExecutor) {

                        ((JavascriptExecutor) WebDriverConfig.driver).executeScript("arguments[0].style.border='5px solid red'", elem);

                }
        }


        public void saveScreenShot(String fileN) {
                if (WebDriverConfig.driver != null) {
                        File scrFile = ((TakesScreenshot) WebDriverConfig.driver).getScreenshotAs(OutputType.FILE);
                        Date date = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy-h-mm-ss-SS--a");
                        String formattedDate = sdf.format(date);
                        String fileName = (fileN.isEmpty() ? "screenshot-" : fileN) + formattedDate;
                        try {
                                FileUtils.copyFile(scrFile, new File(String.format("./%s.png", fileName)));
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }

        }

//    @AfterClass
//    public void quit() {
//        WebDriverConfig.driver.quit();
//    }
}