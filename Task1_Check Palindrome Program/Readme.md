Videoslots Test Assessment

Author:Karthick Monishraj Soundararajan
Date :17-08-2023
Description Overview: This document is regarding technical challenge for Software QA Specialist to work with Videoslots
Task1 Description: 
  Given the below distinct requirements:
      1.	Create a function that takes an array of numbers as a parameter and returns the number of values that are a 
          multiplier of either 4 or 6(or, of course both)
        
  Solution Steps as follows:
    1.  The script is handled in core Java
    2.  Created a file with reusable functions – NumericalOperations.java
    •	countOfDivisible – could be used for just 4 or just 6 or any other number
    •	countOfDivisibleByTwoNumbers
    3. Created another file for Input data handling reusable functions-InputDataHandlingUtilities.java
    •	inputFromExcel
    •	writeBooleanToExcel
    •	writeIntegerToExcel
    4. Created an input excel with possible combinations to test the Divisible method functionality – attached the same 
        – InputOutput.xlsx
    5. Created a java file – DivisibleCheckProgram.java
      - Gets the input from the InputOutput.xlsx and checks all possible combinations for the method – 
        countofDivisibleByTwoNumbers
      - Update the test result to InputOutput.xlsx with the count of the divisibles
    6. This package is executed by using any IDE with java standard installation

