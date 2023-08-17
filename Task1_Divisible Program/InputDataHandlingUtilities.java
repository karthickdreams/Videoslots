package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class InputDataHandlingUtilities 
{

	List<Object> listOfInput = new ArrayList<Object>();

	// Description: Function to read input data from an excel file in a given "sheet"
	// Parameters:
	// Input: strInputExcelPath - [String] - Specify the input excel path
	// Input : strSheetName - [String] - Specify the sheet name from where the data must be read
	// Output : List - [List] - returns the list of values from the column "A"

	public List inputFromExcel(String strInputExcelPath, String strSheetName) throws IOException 
	{
		//Initiate excel object and sheet object
		File inputExcelFileObject = new File(strInputExcelPath);
		FileInputStream ExcelInputStreamObject = new FileInputStream(inputExcelFileObject);
		Workbook workbookObject = new XSSFWorkbook(ExcelInputStreamObject);
		Sheet strSheetObject = workbookObject.getSheet(strSheetName);

		int intRowCount = strSheetObject.getPhysicalNumberOfRows();

		// Traverse row by row and add the values present in the excel into the list
		for (int inputRowNumber = 1; inputRowNumber < intRowCount; inputRowNumber++) 
		{
			Row currentIterationRowInputString = strSheetObject.getRow(inputRowNumber);
			Cell firstCellString = currentIterationRowInputString.getCell(0);
			listOfInput.add(firstCellString);
		}

		return listOfInput;
	}

	// Description: Function to write boolean data into an excel file in a given "sheet"
	// Parameters:
	// Input: strInputExcelPath - [String] - Specify the input/output excel path
	// Input : strSheetName - [String] - Specify the sheet name from where the data to be written
	// Input : boolOutputValue - [boolean] - Either True or false from the place of calling
	// Input : intOutputRownumber - [Integer] - Row number where the output to be written

	public void writeBooleanToExcel(String strInputExcelPath, String strSheetName, boolean boolOutputValue, int intOutputRownumber) throws IOException 
	{
		File outputExcelFileObject = new File(strInputExcelPath);
		FileInputStream excelInputStreamObject = new FileInputStream(outputExcelFileObject);
		Workbook workbookObject = new XSSFWorkbook(excelInputStreamObject);

		Sheet strSheetObject = workbookObject.getSheet(strSheetName);
		Row OutputResult = strSheetObject.getRow(intOutputRownumber);

		OutputResult.createCell(1).setCellValue(boolOutputValue);
		FileOutputStream excelOutputStreamObject = new FileOutputStream(outputExcelFileObject);
		workbookObject.write(excelOutputStreamObject);
	}

	// Description: Function to write Integer data into an excel file in a given "sheet"
	// Parameters:
	// Input: strInputExcelPath - [String] - Specify the input/output excel path
	// Input : strSheetName - [String] - Specify the sheet name from where the data to be written
	// Input : intResult - [Integer] - Result of the opertion to be written on the excel
	// Input : intOutputRownumber - [Integer] - Row number where the output to be written

	public void writeIntegerToExcel(String strInputExcelPath, String strSheetName, int intResult, int intOutputRownumber) throws IOException 
	{
		File outputExcelFileObject = new File(strInputExcelPath);
		FileInputStream excelInputStreamObject = new FileInputStream(outputExcelFileObject);
		Workbook workbookObject = new XSSFWorkbook(excelInputStreamObject);

		Sheet sheetNumberTestObject = workbookObject.getSheet(strSheetName);
		Row resultRowObject = sheetNumberTestObject.getRow(intOutputRownumber);
		resultRowObject.createCell(1).setCellValue(intResult);

		FileOutputStream excelOutputStreamObject = new FileOutputStream(outputExcelFileObject);
		workbookObject.write(excelOutputStreamObject);
	}
}
