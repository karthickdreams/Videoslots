package Demo;

import java.io.IOException;
import java.util.List;

import Demo.InputDataHandlingUtilities;

import Demo.StringUtilities;

public class checkPalindromeInText {

	public static void main(String[] args) throws IOException {
		// Initiate objects from Utilities library
		InputDataHandlingUtilities InputDataHandlingUtilityObject = new InputDataHandlingUtilities();
		StringUtilities StringUtilitiesObject = new StringUtilities();
		String strInputExcelPath = "C:\\Users\\karth\\eclipse-workspace\\neweclipse\\two\\DataFromExcel\\InputOutput.xlsx";
		String strSheetName = "PalindromeTest";
		List inputFromExcelListObject = InputDataHandlingUtilityObject.inputFromExcel(strInputExcelPath, strSheetName);
		

		for (int indexofOutputString = 1; indexofOutputString < inputFromExcelListObject.size(); indexofOutputString++) {
			
			Object inputTextObjectFromExcel = inputFromExcelListObject.get(indexofOutputString);
			boolean checkPalindrome = StringUtilities.checkPalindrome(inputTextObjectFromExcel);
			
			
			if (checkPalindrome == true) {
				InputDataHandlingUtilityObject.ExportToExcel(checkPalindrome, indexofOutputString);
			} else {
				InputDataHandlingUtilityObject.ExportToExcel(checkPalindrome, indexofOutputString);
			}

		}

	}
}