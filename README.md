# Selenium WebDriver Automation Project

This project demonstrates automated testing of a shopping website using Selenium WebDriver with Java and TestNG.

## Prerequisites

- Java JDK 11 or higher
- Maven
- Chrome browser

## Project Structure

```
src/
├── main/java/com/qa/assignment/
│   ├── base/
│   │   └── BaseTest.java
│   └── pages/
│       ├── BasePage.java
│       ├── HomePage.java
│       └── ProductPage.java
└── test/java/com/qa/assignment/
    └── tests/
        └── ShoppingTest.java
```

## Setup Instructions

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn clean install` to download dependencies

## Running Tests

To run the tests, use one of the following methods:

1. Using Maven:
   ```bash
   mvn test
   ```

2. Using TestNG XML:
   - Open `testng.xml` in your IDE
   - Right-click and select "Run as TestNG Suite"

## Test Flow

The automated test performs the following steps:
1. Opens the homepage
2. Searches for a product (T-shirt)
3. Selects the first product from search results
4. Adds the product to cart
5. Proceeds to checkout
6. Verifies arrival at the sign-in page

## Best Practices Implemented

- Page Object Model (POM) design pattern
- Explicit waits for better reliability
- Proper locator strategies (ID, CSS)
- Assertions for validation
- Clean code structure
- Maven for dependency management 