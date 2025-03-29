package com.example.pages;

import com.example.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Optional;

public class HomePage extends BasePage {

    @FindAll(@FindBy(className = "main-nav__list"))
    public List<WebElement> navBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickNavBarItem(String navBarItem) {
        Optional<WebElement> navigationBarItem = getElements(navBar).stream()
                .filter(element -> element.getText().equalsIgnoreCase(navBarItem))
                .findFirst();

        if (navigationBarItem.isPresent()) {
            navigationBarItem.get().click();
        } else {
            throw new RuntimeException("Unable to find navigation bar item");
        }
    }
}