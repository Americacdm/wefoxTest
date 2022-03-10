#Lego Test 

Tests made based on specifications of a test for wefox. 

#Architecture 

Solution composed of the following frameworks to automate the test case associated with the LEGO front: 

1. Selenium 

2. Cucumber 

3. JUnit 

Selenium allows raising different instances of browsers, in this case chrome, and accesses the elements of the application's html code, to simulate any possible human action. 

Through Cucumber, Behavior Driven Development (BDD) coding is possible, offering a way to write tests in the gherkin language. These tests are automatically transferred to the application, where they are completed using JAVA methods. In addition, it shows a report of the result of the test cases. 

Through JUnit, the execution of the test cases is carried out in the defined browser (Chrome), it also allows the creation of assertions, annotations and the validation of the results at the end of the execution of the test scenario. It has a configuration module, where through Selenium the defined browser is started. This browser is included in the execution environment where the application is hosted. Subsequently, Cucumber implements a global runner for the application, in which it executes the defined feature. 

The definition of the steps refer to the previously described feature, it uses the methods implemented in the Page Objects to which they refer. In the steps the functionality is extended depending on the requirement. You have PageObjects, which are oriented towards functional programming, where web pages are represented as classes, and the various elements of the page are defined as variables in the class, elements, or locators. All possible user interactions can be implemented as methods on the class. Finally, there is the BasePage, which is used as a wrapper where selenium methods are created to later be used or extended in the Page Object.

#Running the test suit

The test suit runs from the TestRunner through the Chromedriver of chrome browser found in the src path. 

