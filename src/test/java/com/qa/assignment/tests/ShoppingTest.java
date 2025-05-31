package com.qa.assignment.tests;

import com.qa.assignment.base.BaseTest;
import com.qa.assignment.pages.HomePage;
import com.qa.assignment.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {

    @Test
    public void testShoppingFlow() {
        // Initialize page objects
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        // Search for a product
        homePage.searchProduct("T-shirt");

        // Click on the first product
        homePage.clickFirstProduct();

        // Add to cart
        productPage.addToCart();

        // Proceed to checkout
        productPage.proceedToCheckout();

        // Verify we're on the sign-in page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("signin"), "Not on the sign-in page");
    }
} 
