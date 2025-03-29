package com.example.hooks;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--full-screen");
        options.addArguments("--sandbox");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.psl.co.za/");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeStep
    public void beforeStep(Scenario scenario) {

    }

    @AfterStep
    public void afterStep(Scenario scenario) {

    }

    public static WebDriver getDriver() {
        return driver;
    }
}