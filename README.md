# Mortgage Calculator Application🧮📈💰 

[Mortgage Calculator Application Repository](https://github.com/kaskaCzubak/mortgage_calculator_app.git)

## Description
This Java application is designed to calculate mortgage payments based on user-provided input data. The application features schemas for both constant and increasing installments, along with support for two types of overpayments: reducing installment and reducing the period. 

## Features💻
- Calculates mortgage payments with various installment schemas.
- Supports overpayments to reduce installment or shorten the loan period.
- Logs messages using Logback for effective debugging and monitoring.
- Generates a `calculationResult.txt` file containing installment schema and main loan details, including:
  - Loan Amount
  - Loan Period
  - Interest Rate
  - Schema of overpayments
- Reads input data from `inputData.csv` file for convenience.

## Implementation Details🚀
- Business logic is concentrated in service classes, adhering to object-oriented programming principles.
- Domain classes are implemented as records for streamlined data management.
- Utilizes Lombok library to reduce boilerplate code and enhance development efficiency.
- Built with Gradle for project management and dependency resolution.
- Jacoco plugin is used to generate comprehensive code coverage reports, ensuring code quality.
- Unit tests and integrations are conducted for practice purposes.

## Purpose of the Project📝
The purpose of this project is to provide a tool for individuals and professionals to calculate mortgage payments accurately. It aims to simplify the process of understanding mortgage payment schedules and the impact of various parameters such as loan amount, interest rate, and overpayments. 

Additionally, this application marks the first step in my Java journey, serving as my inaugural project. As such, the code level is beginner, reflecting my early exploration and learning in Java programming. This project also incorporates the usage of the Spring framework, representing my first experience with this technology.

## Why This Project is Useful✨
This project is useful because it provides a convenient way to calculate mortgage payments with different scenarios. It allows users to experiment with various input parameters to understand how they affect their mortgage repayment schedule. Additionally, the ability to generate detailed result files enhances transparency and clarity in the mortgage calculation process.

## Getting Started👌
1. Clone the repository to your local machine.
2. Ensure Java and Gradle are installed.
3. Modify the `inputData.csv` file with your mortgage details.
4. Run the application.
5. Check the `calculationResult.txt` file for the mortgage calculation results.

## Contributors😎
- [Katarzyna Czubak] - [@kaskaCzubak](https://github.com/kaskaCzubak/kaskaCzubak.git)
