# **TestNG Annotations Tutorials with Java**
### Table of Contents

1. [Overview](#Overview)
2. [Getting Started](#Getting-Started)

    - [Prerequisites](#prerequisites)
    - [Installation](#installation)

      - [Java JDK](#java-jdk)
      - [IDE](#ide)
      - [Apache Maven](#apache-maven)

    - [Setting Up Java JDK](#setting-up-java-jdk)
    - [Setting Up Spring Tools](#setting-up-spring-tools)
    - [Installing Apache Maven](#installing-apache-maven)

11. [Built With](#built-with)
12. [Installation Steps](#installation-steps)   
21. [Step Wise Details](#step-wise-details)

    - [@BeforeSuite](#00---beforeSuite-annotation)
    - [@AfterSuite](#01---afterSuite-annotation)
    - [@BeforeTest](#02---beforeTest-annotation)
    - [@AfterTest](#03---afterTest-annotation)
    - [@BeforeClass](#04---beforeClass-annotation)
    - [@AfterClass](#05---afterClass-annotation)
    - [@BeforeMethod](#06---beforeMethod-annotation)
    - [@AfterMethod](#07---afterMethod-annotation)
    - [@Test](#08---test-annotation)
    - [@DataProvider](#09---dataProvider-annotation)
    - [@Factory](#10---factory-annotation)
    - [@Ignore](#11---ignore-annotation)
    
38. [Acknowledgments](#acknowledgments)
39. [Contact](#contact)

### Overview
Welcome to the TestNG Annotations Tutorials with Java repository! This repository serves as a comprehensive guide to working with TestNG annotations in Java. Whether you're new to TestNG or an experienced developer looking to enhance your testing skills, this repository covers various TestNG annotations and their usage in test automation.

### Getting Started
Follow these steps to set up your development environment and start using TestNG with Java.

### Prerequisites

1. [Java JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
2. Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi)

### Installation

1. Java JDK
    - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) page.
    - Run the installer and set up the JDK.
2. IDE
    - Download and install your preferred IDE.
3. Apache Maven
    - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
    - Follow installation instructions.
  
### Setting Up Java JDK

1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
         - Open System Properties.
         - Navigate to Environment Variables.
         - Add JAVA_HOME with the JDK installation path.
         - Update the PATH variable to include %JAVA_HOME%\bin.
4. Verify Java installation by running java --version in a terminal.

### Setting Up Spring Tools

1. Download Spring Tools from the [official website](https://spring.io/tools).
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

### Installing Apache Maven

1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
    - Create M2_HOME and point it to the Maven installation directory.
    - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal.

### Built With

1. [Java JDK](https://www.oracle.com/java/) - Java Development Kit
2. [Spring Tools](https://spring.io/tools/) - IDE for Spring applications
3. [Apache Maven](https://maven.apache.org/) - Dependency Management

### Installation Steps
To start using the framework:

1. [Fork](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java.git) the repository.
2. Clone, i.e, download your copy of the repository to your local machine using
```
git clone https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java.git
```
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, or Spring Tools).
4. Make any desired changes or additions to the project.

##### Maven Dependencies

###### Selenium TestNG Webdriver Manager

```xml
<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.13.0</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.5.3</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.8.0</version>
			<scope>test</scope>
		</dependency>
		
	</dependencies>
```

## Step Wise Details

### 00 - BeforeSuite Annotation 
The @BeforeSuite annotation in TestNG is used to indicate that a specific method will be executed before the execution of all tests in the suite. This annotation is typically used to perform setup activities that are required for the entire test suite.

### **Usage:**

- Initializing global resources required for the entire test suite.
- Configuring environment settings such as database connections, web server setup, etc.
- Preparing test data that will be used across multiple test cases.

### **Note:**

- There can only be one method annotated with @BeforeSuite in a test suite. If multiple methods are annotated with @BeforeSuite, TestNG will throw an exception.
- The @BeforeSuite method is executed only once before the entire test suite runs.

### **Example:**
[Before Suite](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/BeforeSuiteExample.java) 

### 01 - AfterSuite Annotation 
The @AfterSuite annotation in TestNG is used to indicate that a specific method will be executed after the execution of all tests in the suite has completed. This annotation is typically used to perform cleanup activities or actions that need to be done once after the entire suite has finished running.

### **Usage:**

- Closing resources or connections that were opened for the entire suite.
- Releasing memory or performing finalization tasks.
- Generating test reports or sending notifications after all tests have finished.

### **Note:**

- There can only be one method annotated with @AfterSuite in a test suite. If multiple methods are annotated with @AfterSuite, TestNG will throw an exception.
- The @AfterSuite method is executed only once after the entire test suite has run.

### **Example:**
[After Suite](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/AfterSuiteExample.java)

### 02 - BeforeTest Annotation 
The @BeforeTest annotation in TestNG is used to indicate that a specific method will be executed before each test method in a test class. This annotation is typically used to perform setup activities that are required before each individual test method runs.

### **Usage:**

- Initializing test-specific resources or data.
- Setting up preconditions required for individual test methods.
- Preparing the environment for each test method.

### **Note:**

- Each test class can have multiple methods annotated with @BeforeTest. All these methods will be executed before each test method in the class.
- The @BeforeTest methods are executed in the order they are defined in the test class.

### **Example:**
[Before Test](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/BeforeTestExample.java)

### 03 - AfterTest Annotation 
The @AfterTest annotation in TestNG is used to indicate that a specific method will be executed after each test method in a test class has completed its execution. This annotation is typically used to perform cleanup activities or actions that need to be done after each individual test method finishes.

### **Usage:**

- Closing resources or connections that were opened for a specific test.
- Releasing memory or performing finalization tasks after each test.
- Logging or reporting after each test is completed.

### **Note:**

- Each test class can have multiple methods annotated with @AfterTest. All these methods will be executed after each test method in the class.
- The @AfterTest methods are executed in the reverse order of how they are defined in the test class.

### **Example:**
[After Test](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/AfterTestExample.java)

### 04 - BeforeClass Annotation 
The @BeforeClass annotation in TestNG is used to indicate that a specific method will be executed once before the first test method in the current class runs. This annotation is typically used to perform setup activities that are shared by all test methods in the class.

### **Usage:**

- Initializing class-level resources or data.
- Setting up preconditions shared by all test methods in the class.
- Performing setup tasks that are common to all test methods in the class.

### **Note:**

- Each test class can have only one method annotated with @BeforeClass. If multiple methods are annotated with @BeforeClass, TestNG will throw an exception.
- The @BeforeClass method is executed only once before any test method in the class runs.

### **Example:**
[Before Class](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/BeforeClassExample.java)

### 05 - AfterClass Annotation 
The @AfterClass annotation in TestNG is used to indicate that a specific method will be executed once after all the test methods in the current class have completed their execution. This annotation is typically used to perform cleanup activities or actions that need to be done once after all test methods in the class have run.

### **Usage:**

- Closing resources or connections that were opened for the entire class.
- Releasing memory or performing finalization tasks for the entire class.
- Generating class-level reports or performing class-level cleanup.

### **Note:**

- Each test class can have only one method annotated with @AfterClass. If multiple methods are annotated with @AfterClass, TestNG will throw an exception.
- The @AfterClass method is executed only once after all test methods in the class have run.

### **Example:**
[After Class](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/AfterClassExample.java)

### 06 - BeforeMethod Annotation 
The @BeforeMethod annotation in TestNG is used to indicate that a specific method will be executed before each test method in a test class. This annotation is typically used to perform setup activities that are required before each individual test method runs.

### **Usage:**

- Initializing method-specific resources or data.
- Setting up preconditions required for individual test methods.
- Preparing the environment for each test method.

### **Note:**

- Each test class can have multiple methods annotated with @BeforeMethod. All these methods will be executed before each test method in the class.
- The @BeforeMethod methods are executed in the order they are defined in the test class.

### **Example:**
[Before Method](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/BeforeMethodExample.java)

### 07 - AfterMethod Annotation 
The @AfterMethod annotation in TestNG is used to indicate that a specific method will be executed after each test method in a test class has completed its execution. This annotation is typically used to perform cleanup activities or actions that need to be done after each individual test method finishes.

### **Usage:**

- Closing resources or connections opened for a specific test method.
- Releasing memory or performing finalization tasks after each test method.
- Logging or reporting after each test is completed.

### **Note:**

- Each test class can have multiple methods annotated with @AfterMethod. All these methods will be executed after each test method in the class.
- The @AfterMethod methods are executed in the reverse order of how they are defined in the test class.

### **Example:**
[After Method](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/AfterMethodExample.java)

### 08 - Test Annotation 
The @Test annotation in TestNG is used to indicate that a specific method is a test method. This annotation is typically used to define the actual test cases that should be executed.

### **Usage:**

- Defining the test logic that should be executed.
- Running specific test cases within a test class.

### **Note:**

- Each method annotated with @Test is considered a separate test case.
- TestNG executes the test methods in the order they are defined in the test class.
- TestNG provides various assertions (assert, assertEquals, assertTrue, etc.) to validate the test results.

### **Example:**
[Test](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/TestExample.java)

### 09 - DataProvider Annotation 
The @DataProvider annotation in TestNG is used to supply test methods with data. It allows you to separate the data from the test methods, making it easier to maintain and reuse test data across multiple test cases

### **Usage:**

- Supplying test methods with different sets of test data.
- Executing the same test method with multiple input data.
- Parameterizing tests to cover various scenarios.

### **Note:**

- The test method that uses the @DataProvider annotation should have parameters that match the data provided.
- The test method will be executed multiple times, once for each set of data provided by the data provider.

### **Example:**
[Data Provider](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/DataProviderExample.java)

### 10 - Factory Annotation 
The @Factory annotation in TestNG is used to create a test class instance multiple times with different sets of data or parameters. This annotation is particularly useful when you need to create instances of a test class dynamically, each with its own set of input data.

### **Usage:**

- Creating multiple instances of a test class with different inputs.
- Running the same test method with various parameters or data sets.
- Parameterizing tests dynamically.

### **Note:**

- The @Factory method must return an array of objects or Object[].
- Each object in the array will be considered an instance of the test class and will execute the test method(s) defined in the test class.
- TestNG creates a new instance of the test class for each object returned by the @Factory method.

### **Example:**
[Factory](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/FactoryExample.java)

### 11 - Ignore Annotation 
The @Ignore annotation in TestNG is used to temporarily disable a test method or a test class. This annotation is helpful when you want to skip certain tests without deleting them, such as when a test is failing due to an issue that needs to be fixed later.

### **Usage:**

- Temporarily skipping a test method or class.
- Marking tests that are currently failing or not ready for execution.
- Preventing certain tests from running in specific scenarios.

### **Note:**

- The @Ignore annotation can be applied to both test methods and test classes.
- When a test method is ignored, TestNG will not execute it, and the method will be marked as "skipped" in the test report.
- Ignored tests will not contribute to the pass or fail status of the overall test suite.

### **Example:**
[Ignore](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/IgnoreExample.java)

### Acknowledgments
Special thanks to the contributors and the TestNG community for their valuable resources and tutorials.

### Contact
For questions or feedback, please feel free to reach out:

1. Maintainer: [Md. Ebrahim Hossain](https://github.com/ebrahimhossaincse)
2. Project Link:[TestNG-Annotations-Tutorials-Java](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java.git) 