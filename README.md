# cucumber_test
How to use Cucumber + Java + WebDriver Selenium

This example use Cucumber (https://cucumber.io/) + Selenium WebDriver (http://www.seleniumhq.org/projects/webdriver/)
This is test case modified to be applicated with BDD (https://en.wikipedia.org/wiki/Behavior-driven_development) process.

# Set up
1 - Download WebDriver from http://www.seleniumhq.org/download/

2 - Download Selenium Client from http://www.seleniumhq.org/download/

3 - Configure this project on Eclipse IDE to see all classes from Selenium client

4 - Go to  cucumber_test/src/main/java/com/github/fr3d3rico/cucumber/ConfigCucumber.java class and Configure the variable plugin on anotation @CucumberOptions for report location at your preference.

# Run Tests
1 - Go to Eclipse IDE and right-click to open context menu and choose "Run as Junit Test" or "Debug..."

2 - You will see the console log starting and then Firefox WebDriver being opened!

3 - Junit window on Eclipse IDE will show up the result like the image bellow.
![alt tag](https://github.com/fr3d3rico/cucumber_test/blob/master/images/cucumber_report.png)

4 - The report configured on step 4 above, show html page simple to see and understand.
![alt tag](https://github.com/fr3d3rico/cucumber_test/blob/master/images/cucumber_test.png)

# Tips
1 - The @Given, @Before and @After annotations located in SuperTest.java is performed for each scenario. ;)
The class with steps like @Then, @When and @And do not extends another class with @-'steps'.
