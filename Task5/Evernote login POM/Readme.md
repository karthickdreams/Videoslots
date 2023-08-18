I have implemented the Page object model for Login functionality with self exploration. I try to explain the structure below, 

Entire structure is divided as standard Page object model in Cucumber.

1. feature:
   - The Login functionality is described on the top
   - The Cucumber standard implemetation on BDD is scripted like - Given, When, And, Then & But
   - The data is taken from the external excel file
2. pages
   - Two pages are created as classes
   - Each page contains the objects identification with id and xpath
   - Relevant operations / keywords are created as reusable functions
3. resources
    - data file is present in this folder
4. runner
    - Contains the test runner file
    - It contains information on the step definition script and glue referring the folder structure
5. steps
    - Contains the Step definition file
    - The scenarios written in feature file are called and scripted here
    - Actual test is driven based on the script in this stepdefinition file referring the sequence in feature file


   Execution sequence:
   - Test runner is the place to trigger the execution
   - Based on the features and glue specified in the test runner file, the framework starts to work
   - The feature file acts as a driver of sequence of executions in the BDD
   - Data file is referred at this point and the values are passed to the stepdefinition file
   - Stepdefinition file is used next to perform the steps scripted in it
   - Results are created and stored in standard html format in Cucumber BDD
  
I have implemented only for Evernote login functionality; Likewise we can use this framework approach to other test cases.
