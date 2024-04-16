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
    - [@BeforeClass](#04---)
    - [@AfterClass](#05---)
    - [@BeforeMethod](#06---)
    - [@AfterMethod](#07---)
    - [@Test](#08---)
    - [@DataProvider](#09---)
    - [@Factory](#10---)
    - [@Ignore](#11---)
    
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

[After Test](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java/blob/main/src/test/java/ebrahim/hossain/sqa/AfterTestExample.java)


### Acknowledgments
Special thanks to the contributors and the TestNG community for their valuable resources and tutorials.

### Contact
For questions or feedback, please feel free to reach out:

1. Maintainer: [Md. Ebrahim Hossain](https://github.com/ebrahimhossaincse)
2. Project Link:[TestNG-Annotations-Tutorials-Java](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java.git) 