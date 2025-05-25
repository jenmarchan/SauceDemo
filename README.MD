# Test Automation Framework (Cucumber, Selenium, Java)

## Overview

This project provides an automated testing framework built using Java, Selenium WebDriver, Cucumber, and Maven. It follows the BDD (Behavior Driven Development) approach and the Page Object Model (POM) design pattern for creating maintainable and understandable automated tests for web applications. Currently, it includes tests for Login functionality, Shopping Cart and Checkout process.

## Features

* **BDD Approach:** Uses Cucumber and Gherkin syntax (`Given`, `When`, `Then`) for writing test scenarios in a human-readable format.
* **Page Object Model (POM):** Organizes UI elements and interactions into separate page classes for better maintainability and code reuse.
* **Selenium WebDriver:** Automates browser interactions.
* **Maven:** Manages project dependencies and build lifecycle.
* **JUnit:** Used for assertions within step definitions.
* **Cucumber Reports:** Generates detailed HTML test execution reports.
* **Cross-Browser Testing Ready:** Can be extended to run tests on different browsers (Chrome, Firefox, Edge, etc.).
* **Tagging:** Uses Cucumber tags (`@Login`, `@ShoppingCart`) for selective test execution.

## Project Structure
```
├── pom.xml                 # Maven Project Object Model file
├── src
│   └── test
│       ├── java
│       │   ├── testbase        # manages WebDriver setup/teardown and initializing Page Object Model elements for all application pages, enabling clean separation between test logic and UI interactions.
│       │   ├── utils           # Reusable common methods (waits, clicks, etc.), static final configuration values, for reporting and screenshots
│       │   ├── pages           # Page Object classes (following POM design pattern)
│       │   ├── runner          # JUnit test runners for Cucumber features
│       │   └── steps           # Step implementation code linking Gherkin to Java/Selenium
│       └── resources
│           └── features        # Cucumber feature files (.feature)
├── target/                 # Build output (compiled classes, reports) - Generated
└── README.md               # This file
```


## Testing Environment

* **IDE:** IntelliJ IDEA (or any other Java IDE)
* **Language:** Java 17
* **Core Libraries:**
    * Selenium WebDriver
    * Cucumber (cucumber-java, cucumber-junit)
    * JUnit
    * WebDriverManager (for automatic driver management)
* **Build & Dependency Management:** Maven

## Testing Strategy

* **BDD (Behavior Driven Development):** Test cases are defined in `.feature` files using Gherkin syntax, promoting collaboration between technical and non-technical stakeholders. `Background` keyword is used for common steps across scenarios within a feature.
* **Page Object Model (POM):** UI elements are encapsulated within page classes (under `src/test/java/pages`). Locators use the `@FindBy` annotation. This improves test maintenance by centralizing element definitions.
* **Step Definitions:** Java methods implementing the Gherkin steps reside in the `steps` package. They utilize page objects and common methods to interact with the application and perform assertions using JUnit.
* **Test Runners:** Dedicated runner classes (e.g., `LoginFunctionality.java`, `ShoppingCartCheckout.java`) in the `runner` package control test execution using `@CucumberOptions`. These specify feature file paths, step definition locations, reporting plugins, and tags for filtering tests.
* **Utils:** Reusable utility functions (explicit waits, screenshot capture, JavaScript execution, handling alerts/frames/windows, mouse hover) are placed in the `utils` package to avoid code duplication.
* **Constants:** Static final values used across the framework (e.g., URLs, default timeouts) are maintained separately.
* **Maven Integration:** Simplifies dependency management (`pom.xml`) and provides standard commands for building and executing tests.

## Sauce Demo Test Scenarios

The framework currently covers the following main test scenarios:

1. **Login Functionality:**
    - Valid user login
    - Invalid credentials handling
    - Locked out user detection

2. **Shopping Cart & Checkout Process:**
    - Adding products to cart
    - Updating product quantities
    - Removing products from cart
    - Completing checkout with shipping information
    - Order confirmation

## Getting Started

### Prerequisites

* **Java Development Kit (JDK):** Version 17 or higher installed and configured (check with `java -version`).
* **Apache Maven:** Installed and configured (check with `mvn -version`).
* **Web Browser:** Google Chrome, Mozilla Firefox, or another browser supported by Selenium WebDriver. WebDriverManager will attempt to download the correct driver automatically.
* **Git:** (Optional) For cloning the repository.

### Installation

1.  **Clone the repository (if applicable):**
    ```bash
    git clone <your-repository-url>
    cd <repository-directory>
    ```
2.  **Install Dependencies:** Maven will automatically download the required dependencies when you run a test command for the first time or by running:
    ```bash
    mvn clean install
    ```

## How to Run Tests

Tests are executed using Maven commands from the project's root directory.

1.  **Run All Tests:**
    ```bash
    mvn test
    ```

2.  **Run Specific Test Suites using Tags:**
    * **Login Functionality Only (`@Login` tag):**

        ```bash
        mvn test -Dtest=LoginFunctionality
        ```

    * **Shopping Cart Tests Only (`@ShoppingCart` tag):**
        ```bash
        mvn test -Dtest=ShoppingCartCheckout
        ```

## Reports
![Tags Report](https://raw.githubusercontent.com/jenmarchan/SauceDemo/refs/heads/main/docs/images/overview-tags.png)
![Features Report](https://raw.githubusercontent.com/jenmarchan/SauceDemo/refs/heads/main/docs/images/feature-report.png)

* **HTML Reports:** Detailed HTML reports are generated using the `maven-cucumber-reporting` plugin.
* **Location:** Customer reports can be found in the `target/cucumber-html-reports/` directory after a test run (`mvn test`)
* **Viewing:** Open the `overview-features.html` file within that directory in your web browser to view the results.
* **Default Reports:** You can also find the default cucumber reports in the `target/cucumber-reports/` directory.

## CI/CD Recommendations

Integrating this framework into a Continuous Integration/Continuous Deployment (CI/CD) pipeline is highly recommended for automated testing on every code change.

* **Tools:** Jenkins, GitHub Actions, GitLab CI, Bitbucket Pipelines.
* **Steps:**
    1.  Configure the CI/CD tool to check out the code repository.
    2.  Set up the necessary environment (JDK 17, Maven).
    3.  Add a build step to execute the Maven test command (e.g., `mvn clean test`).
    4.  Configure the tool to archive or publish the generated Cucumber HTML reports (`target/cucumber-html-reports/`).
    5.  (Optional) Configure notifications for build/test failures.
* **Benefits:** Early feedback on integration issues, consistent testing environment, automated regression testing.

## Potential Future Enhancements & Improvements

* **Cross-Browser Testing:**
    * Implement logic (using System Properties or a configuration file) to specify the browser (Chrome, Firefox, Edge, Safari) at runtime.
* **Parallel Execution:**
    * Configure `maven-surefire-plugin` or use `cucumber-jvm-parallel-plugin` to run features or scenarios in parallel, significantly reducing execution time.
* **Cross-Device/Mobile Testing:**
    * Use cloud services like BrowserStack for testing on a wide range of real devices and browsers.
* **Data-Driven Testing:**
    * Read test data from external sources like Excel spreadsheets, CSV files, or other files instead of hardcoding it in feature files or step definitions (Cucumber's `Scenario Outline` with `Examples` is a start).
* **Configuration Management:**
    * Externalize environment-specific configurations (URLs, timeouts, credentials) into properties files (`.properties`) like the `configuration.properties` file allowing easier switching between environments (DEV, QA, PROD), and improved security.
* **API Testing Integration:**
    * If the application has APIs, consider adding API tests (using libraries like REST Assured) alongside UI tests for a more comprehensive testing strategy.

