package com.qa.assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    // Locators
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final By firstProduct = By.cssSelector("div[data-component-type='s-search-result']:first-child h2 a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String productName) {
        sendKeys(searchBox, productName);
        click(searchButton);
    }

    public void clickFirstProduct() {
        click(firstProduct);
    }
} 