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

    - [@BeforeSuite](#00---)
    - [@AfterSuite](#01---)
    - [@BeforeTest](#02---)
    - [@AfterTest](#03---)
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

### 00 - Before Suite TestNG Annotation 
- 00 - 00 []() 


### 10 - Form WebElement Commands
- 10 - 00 [Sendkeys](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/formwebelementcommands/SendKeysMethod.java)
- 10 - 01 [Clear](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/formwebelementcommands/ClearMethod.java)
- 10 - 02 [Click](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/formwebelementcommands/ClickMethod.java)
- 10 - 03 [Submit](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/formwebelementcommands/SubmitMethod.java)

### 11 - Mouse Events In Selenium
- 11 - 00 [Click](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/Click.java)
- 11 - 01 [Click And Hold](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/ClickAndHold.java)
- 11 - 02 [Double Click](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/DoubleClick.java)
- 11 - 03 [Drag And Drop](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/DragAndDrop.java)
- 11 - 04 [Drag And Drop By Offset](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/DragAndDropByOffset.java)
- 11 - 05 [Move By Offset](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/MoveByOffset.java)
- 11 - 06 [Move To Element](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/MoveToElement.java)
- 11 - 07 [Right Click](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/mouseevents/RightClick.java)

### 12 - Keyboard Events In Selenium
- 12 - 00 [Keyboard Events](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/keyboardevents/KeyboardEvents.java)

### 13 - Browser Tab
- 13 - 00 [Create New Tab](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/tabhandling/CreateNewTab.java)
- 13 - 01 [Count The Tabs](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/tabhandling/CountTheTabs.java)
- 13 - 02 [Switch To New Tab](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/tabhandling/SwitchToNewTab.java)
- 13 - 03 [Switching One Tab To Another](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/tabhandling/SwitchingOneTabToAnother.java)

### 14 - Browser Window
- 14 - 00 [Create New Window](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/windowhandling/CreateNewWindow.java)
- 14 - 01 [Count The Window](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/windowhandling/CountTheWindows.java)
- 14 - 02 [Switch To New Window](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/windowhandling/SwitchToNewWindow.java)
- 14 - 03 [Switching One Window To Another](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/windowhandling/SwitchingOneWindowToAnother.java)

### 15 - Frame In Selenium
- 15 - 00 [Count The Total Number Of IFrames](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/CountTotalNumberOfIFrames.java)
- 15 - 01 [Switch To Frames By ID](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/SwitchToFramesByID.java)
- 15 - 02 [Switch To Frames By Index](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/SwitchToFramesByIndex.java)
- 15 - 03 [Switch To Frames By Name](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/SwitchToFramesByName.java)
- 15 - 04 [Switch To Frames By WebElement](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/SwitchToFramesByWebElement.java)
- 15 - 05 [Switch Back To Default](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/iframehandling/SwitchBackToMainPage.java)

### 16 - Assertion
- 16 - 00 [Assert Equals](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/AssertEquals.java)
- 16 - 01 [Assert False](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/AssertFalse.java)
- 16 - 02 [Assert Not Equals](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/AssertNotEquals.java)
- 16 - 03 [Assert Not Null](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/AssertNotNull.java)
- 16 - 04 [Assert True](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/AssertTrue.java)
- 16 - 05 [Soft Assertion](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/assertions/SoftAssertion.java)

### 17 - Web Table
- 17 - 00 [Fetch Table Heading](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webtablehandling/FetchTableHeading.java)
- 17 - 01 [Count Number Of Rows And Columns](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webtablehandling/NumberOfRowsAndColumns.java)
- 17 - 02 [Fetch Cell Value Of Particular Row And Column](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webtablehandling/FetchCellValueOfParticularRowAndColumn.java)
- 17 - 03 [Get Maximum Price In Column](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webtablehandling/GetMaximumPriceInColumn.java)

### Acknowledgments
Special thanks to the contributors and the TestNG community for their valuable resources and tutorials.

### Contact
For questions or feedback, please feel free to reach out:

1. Maintainer: [Md. Ebrahim Hossain](https://github.com/ebrahimhossaincse)
2. Project Link:[Selenium-Tutorials-Java](https://github.com/ebrahimhossaincse/TestNG-Annotations-Tutorials-Java.git) 