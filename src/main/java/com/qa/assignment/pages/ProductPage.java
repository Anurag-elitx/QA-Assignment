package com.qa.assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    // Locators
    private final By addToCartButton = By.id("add-to-cart-button");
    private final By proceedToCheckoutButton = By.id("proceed-to-checkout-button");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        click(addToCartButton);
    }

    public void proceedToCheckout() {
        click(proceedToCheckoutButton);
    }
} 