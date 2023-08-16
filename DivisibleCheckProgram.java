package Demo;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import Demo.InputDataHandlingUtilities;
import Demo.NumericalOperations;

public class DivisibleCheckProgram {

	public static void main(String[] args) throws IOException {
		// variables declaration
		String strInputExcelPath = "C:\\Users\\karth\\eclipse-workspace\\neweclipse\\two\\DataFromExcel\\InputOutput.xlsx";
		String strDivisbleCheckSheetName = "DivisibleCheck";
		int intIterationCounter = 0;
		
		//Objects instances
		InputDataHandlingUtilities inputDataHandlingUtilities = new InputDataHandlingUtilities();
		List inputFromExcelListObject = inputDataHandlingUtilities.inputNumberFromExcel(strInputExcelPath,strDivisbleCheckSheetName);
		
		//Iteration based on the data from the excel input
		for (Object currentRowExcelObject : inputFromExcelListObject)
		{
			intIterationCounter++;

			String ObjectToString = currentRowExcelObject.toString();
			String[] arrInputString = ObjectToString.split(",");
			NumericalOperations numbericalOperationsObject = new NumericalOperations();

			//Divisible check using a reusable function and write it back into the excel
			int intCountOfDivisibleElementsInArray = numbericalOperationsObject.countOfDivisibleByTwoNumbers(arrInputString, 4, 6);
			inputDataHandlingUtilities.resultToExcel(intCountOfDivisibleElementsInArray, intIterationCounter);
		}
	}
}
