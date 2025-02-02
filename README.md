# Java BDD API Testing Framework with Cucumber and RESTAssured

This project is a **Behavior-Driven Development (BDD)** API testing framework built using **Java**, **Cucumber**, and **RESTAssured**, fully testing Atlassian's Trello APIs (CRUD operations). It transforms the traditional RESTAssured API testing approach into a BDD-style framework, enabling collaboration between technical and non-technical stakeholders by writing tests in a human-readable format. The framework is designed to automate RESTful API testing with a focus on clarity, maintainability, and scalability.

## Features

- **Cucumber BDD**: Uses Cucumber to write tests in Gherkin syntax, making them readable and understandable by non-technical stakeholders.
- **RESTAssured Integration**: Leverages RESTAssured for robust API request creation, response validation, and error handling.
- **Modular Design**: The framework is structured in a modular way, making it easy to extend and maintain.
- **Data-Driven Testing**: Supports data-driven testing using external data sources like JSON, CSV, or Excel files.
- **Reporting**: Generates detailed and interactive test execution reports using Cucumber's reporting tools.
- **Environment Configuration**: Easily switch between different environments (e.g., dev, staging, production) using configuration files.
- **Logging**: Integrated logging for better debugging and traceability.
- **CI/CD Integration**: Ready to be integrated into CI/CD pipelines for automated testing.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: For dependency management and build automation.
- **IDE**: IntelliJ IDEA, Eclipse, or any other Java-compatible IDE.
- **Git**: To clone the repository.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Moh88CS/Java-BDD.git
   cd Java-BDD
   mvn clean install
   mvn test

## Configure Environment
Update the config.properties file (located in src/test/resources) to set the appropriate environment variables, such as base URLs, credentials, etc.

## Reporting
Cucumber generates detailed and interactive reports after test execution. These reports can be found in the target/cucumber-reports directory. They provide insights into test execution, including passed/failed scenarios, step definitions, and error details.
