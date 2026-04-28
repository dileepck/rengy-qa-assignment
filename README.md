# rengy-qa-assignment

## Overview

This project automates the login functionality of a sample web application using Selenium WebDriver.
It covers both positive and negative scenarios with proper validations.

---

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven

---

## Application Under Test

https://the-internet.herokuapp.com/login

---

## Test Scenarios Covered

### Positive Test

* Login with valid credentials
* Verify success message
* Verify user is redirected to secure area
* Verify Logout button is visible

### Negative Test

* Login with invalid credentials
* Verify error message is displayed

---

## Key Features

* Reusable test setup using Base class
* Assertions for validation
* Screenshot capture on failure
* Clean and structured project (base, tests, utils)
* Basic mobile automation placeholder included

---

## Project Structure

```
src/test/java
 ├── base
 ├── tests
 └── utils
```

---

## How to Run

1. Import project as **Maven Project** in Eclipse
2. Place `chromedriver.exe` in project root
3. Right click on `WebLoginTest`
4. Run as **TestNG Test**

---

## Assumptions

* Chrome browser is installed
* Matching ChromeDriver version is used
* Maven dependencies are downloaded successfully

---

## Limitations

* Mobile automation is added as a placeholder (Appium setup required for full execution)
* Cross-browser testing is not included

---

## Author

Dileep
