
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Lingpeng Li                |
| Date         | 10/27/2024                 |
| Course       | Fall 2024                  |
| Assignment # | 3                          |


---
## GitHub Repository Link:
---
 https://github.com/matthew0331/cs-665-assignment-2
---

---

## Project Description

The **Email Generation Application** is designed to help a company send personalized emails to different customer segments, including Business, Returning, Frequent, New, and VIP customers. The system is implemented using Java and follows the **Template Method Design Pattern** to ensure consistency in the structure of generated emails, while allowing flexibility in content for each type of customer.

The project aims to simplify the process of creating personalized email templates by centralizing the structure of an email and allowing each customer type to have specific, targeted content. This is achieved through a well-structured implementation that makes use of inheritance and abstraction, providing a flexible, maintainable, and easily extensible codebase.

## Implementation Details

The implementation uses an abstract base class named `EmailGenerator`, which defines the overall template for generating an email. The template method `generateEmail()` is defined in this base class, outlining the general flow of the email, which includes:

1. **Greeting**: A personalized opening statement.
2. **Body**: The main content of the email.
3. **Closing**: A personalized closing remark.

The `EmailGenerator` class uses abstract methods (`getGreeting()`, `getBody()`, `getClosing()`) that are implemented by its subclasses. Each subclass represents a specific type of customer (`BusinessCustomerEmail`, `ReturningCustomerEmail`, `FrequentCustomerEmail`, `NewCustomerEmail`, `VIPCustomerEmail`) and provides its unique implementation for the abstract methods. This approach ensures that each customer type receives an email tailored to their needs, while maintaining a consistent overall structure.

### Flexibility
The implementation of the email generation application is highly flexible due to the use of the **Template Method Pattern**. New customer types can be added easily by creating new classes that extend the base `EmailGenerator` class and implement the necessary methods. This ensures that no changes are required in the existing code, and the system can easily adapt to additional customer requirements.

### Simplicity and Understandability
The **Template Method Pattern** provides a simple structure to the system, which makes it easy to follow. The `EmailGenerator` class provides the general template for generating emails, while subclasses like `BusinessCustomerEmail`, `ReturningCustomerEmail`, etc., add specific content. This separation of concerns makes the code easy to understand, maintain, and extend by new developers.

### Avoidance of Code Duplication
Code duplication is avoided by defining the common steps for generating emails in the abstract class `EmailGenerator`. Instead of repeating the structure of generating emails in each class, the template method in the base class ensures that the common structure is maintained, and only specific details are added in subclasses. This approach reduces redundancy and makes the code more maintainable.

### Design Pattern Selection
The **Template Method Pattern** was chosen for this assignment because it fits well with the requirement to generate emails for different types of customers while maintaining a consistent structure. The main goal was to standardize the process of generating emails while allowing customization for specific customer types.

#### How the Pattern Was Used
In the `EmailGenerator` abstract class, the `generateEmail()` method defines the fixed structure of the email generation process. It calls abstract methods like `getGreeting()`, `getBody()`, and `getClosing()`, which are implemented by subclasses to provide specific content for each type of customer. This ensures a consistent format across all customer emails while providing flexibility to tailor the content as needed.

## Features

The **Email Generation Application** includes the following key features:

1. **Personalized Emails for Different Customer Types**:
   - The system generates emails tailored specifically for different customer segments such as Business, Returning, Frequent, New, and VIP customers.

2. **Template Method Pattern**:
   - Utilizes the **Template Method Pattern** to maintain a consistent structure across all emails while allowing unique customization for each customer type.

3. **Scalable and Extendable**:
   - New customer types can easily be added by creating a new subclass of `EmailGenerator`, making the application highly scalable.

4. **Unit Tests**:
   - Comprehensive unit tests using **JUnit** ensure that each customer type receives the correct email format, and that new functionality can be verified easily.

5. **Maintainable Codebase**:
   - Adheres to clean code principles, ensuring that the project remains maintainable and easy for future developers to extend or modify.

## Expectations

1. **Flexibility**:
   - The system should be designed with flexibility in mind, allowing for the easy addition or removal of customer types, enabling future scalability.

2. **Maintainability and Understandability**:
   - The code should be well-organized, clearly commented, and adhere to best practices, making it easy for others to read and maintain.

3. **Avoidance of Duplication**:
   - Duplicated code should be minimized through the use of abstraction, inheritance, and other relevant design patterns.

4. **Design Pattern Application**:
   - The Template Method Pattern was applied to implement a structured and consistent email generation system for multiple customer types.

---
## Conclusion

The **Email Generation Application** is a flexible, scalable solution for generating personalized emails for various customer types. The use of the **Template Method Pattern** ensures a consistent and reusable structure for emails, making it easy to maintain and extend the system. The separation of concerns between the base email structure and the specific content for each customer type results in a modular design that is easy to understand and extend.

The choice of the **Template Method Pattern** has proven to be effective in achieving the project's goal of standardized email generation with personalized content. The well-defined template allows for easy onboarding of new customer types without requiring changes to the core logic, ultimately leading to a maintainable and efficient system. The project has met the requirements and demonstrates good practices in software design, adhering to principles such as **flexibility**, **simplicity**, and **code reusability**.

---




## Project Structure

```
src
├── main
│   └── java
│       └── edu
│           └── bu
│               └── met
│                   └── cs665
│                       ├── CustomerEmail
│                       │   ├── EmailGenerator.java
│                       │   ├── BusinessCustomerEmail.java
│                       │   ├── ReturningCustomerEmail.java
│                       │   ├── FrequentCustomerEmail.java
│                       │   ├── NewCustomerEmail.java
│                       │   └── VIPCustomerEmail.java
│                       └── Main.java
├── resources
└── test
    └── java
        └── edu
            └── bu
                └── met
                    └── cs665
                        └── EmailGeneratorTest.java

```

---

## Compilation & Execution

### Prerequisites
- **Java JDK 1.8**
- **Apache Maven** 4.0.0



---

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system.

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line:

```bash
mvn clean compile 
```

**Run the Project:**
After compiling, you can run the project by executing the `Main.java` class:
   ``` bash
   mvn exec:java -Dexec.mainClass="edu.bu.met.cs665.Main
   ```

## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```
---

## Spotbugs

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.



## Checkstyle

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`

## Example Output
```
Business Email:
Dear Valued Business Customer,

We appreciate your business and look forward to continued collaboration.

Best Regards,
The Company Team

Returning Customer Email:
Hello Returning Customer,

Thank you for trusting us again! We're here to provide the best service.

Warm regards,
The Company Team

Frequent Customer Email:
Hi Frequent Customer,

We value your frequent patronage and have exclusive offers just for you.

Sincerely,
The Company Team

New Customer Email:
Welcome New Customer!

Thank you for choosing us. We're excited to have you on board!

Cheers,
The Company Team

VIP Customer Email:
Dear VIP Customer,

As one of our most valued clients, we have tailored offers and services for you.

With appreciation,
The Company Team
```