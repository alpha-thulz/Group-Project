package com.example.steps;

import com.example.hooks.BrowserFactory;
import io.cucumber.java.en.*;

public class AboutStepDef extends BrowserFactory {

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        System.out.println("User is on the home page");
    }

    @And("User navigates to the about page")
    public void user_navigates_to_the_about_page() {
        homePage.clickNavBarItem("About");
    }

    @Then("About page is displayed")
    public void about_page() {
        System.out.println("About page is displayed");
    }
}