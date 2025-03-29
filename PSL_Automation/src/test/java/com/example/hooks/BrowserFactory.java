package com.example.hooks;

import com.example.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BrowserFactory {

    private WebDriver driver;
    protected HomePage homePage;

    public BrowserFactory() {
        driver = Hooks.getDriver();

        homePage = PageFactory.initElements(driver, HomePage.class);
    }
}
