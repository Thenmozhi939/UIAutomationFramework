# **UIAutomationFramework**

This UIAutomation framework is designed to test the application using Java,Selenium and TestNG using Maven

### **Requirements:**
* Java JDK11
* Maven

### **Technologies:**
* **Java:** Programming language for writing tests
* **Selenium:** For browser automation
* **TestNG:** Managing test suites
* **Maven:** Build automation tool
* **Extent reports:** For test reporting

### **Repository link**
Clone the repository git clone https://github.com/Thenmozhi939/UIAutomationFramework

### Packages in the framework:

#### Base:

In base class initialisation of driver, loading properties file, loading Excel file and handling synchronization issues.

#### Config package:

Configurations like which browser to run the tests, user defined here

#### Resources:

##### GlobalPackage:

It contains the common XPath and common methods which were used throughout the framework.

##### StaticPackage:

Defined the static variables which were used throughout the framework.

#### Utilities:

classes for storing evidences,reporting.

* Excel utility:It helps to retrieve the data from Excel and pass it to the scripts.
* Extent utility:It helps to generate the most informative reports with the help of IReporter.
* Screenshot utility:It helps to take the screenshot of the page of every testcase in unique directories.

#### Extent report:

will be generated and stored in defined location.

#### Test cases:

Test cases will be written under test/java folder.