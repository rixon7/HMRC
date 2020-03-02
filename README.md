# HMRC
I have created this automation framework as per the exercise for your assessment. 
All the test scenarios are automated and can be run using one command. 
There is one feature file which has all the 4 test scenarios written using the BDD-cucumber in gherkin language.

#Prerequisites (Tools Used) :
Selenium Web driver
BDD-Cucumber (Gherkin) 
Maven
Java

#Below one command can be used to run all the test in command prompt (maven-surefire-plugin updated in pom.xml file) 
$mvn test
You can also execute the test using the testRunner file in Eclipse 

#Test Execution 
There is one test failed in the last scenario as expected which is also displayed in the report 
There are 2 Defects Found while running the test scenario 3 and 4.
  1.when a user selects the Highest Price the application keeps loading and teh Highest price product is not displayed, However In my test I've still found the highest element and managed to run the test
  2. The test scenario 4 will fail as the user is not able to see the product in the Cart after logging out and log in back again.
  
#Reports 
Cucumber Report for Test Execution can be checked using the index.html file in the target folder 
