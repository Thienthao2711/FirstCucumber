# Summary
This project demonstrate the Automation Project use Cucumber and Selenium wiht PageObject pattern 
On the Cucumber project we have four main parts
+ **Feture file** is used to decribe about what testcase will be executed. It is a text file with .feature extension and as normally it will be stored in resource folder.
+ **PageObject** is a class was used to describe about the WebElement was present on Webpage. Each webpage have a corresponding class.
+ **StepDefinition** is a set of steps use Selenium command to manupulate with Element on webpate was decribed by Page objects.
+ **CucumberRunner** is a class used to provide some configurations for test execution.

## Feature File ##
The feature file is a testcase file for each function on automation test. We use the Gherkin language to describe the testcase which have to implement. Some of keywords are:
- Feature: Decribe about the feature on automated project
- Scenario: Decribe about the specific scenario - testcase which we have to answer about feature status
- Given, When, Then: Is a set of keywords used to decribe about step on each testcase
