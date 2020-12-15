package com.visionit.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLXSDataProvider {
	// load the workbook
	XSSFWorkbook wb;
	// create a constructor of a class 
	public XLXSDataProvider() {
		try {
			// load the file and create a reference of that object
		File fs	=new File("./TestData/testData.xlsx");
		// read excel data
		FileInputStream fins= new FileInputStream(fs);
		// load the workbook
		wb = new XSSFWorkbook(fins);
	}
		catch(Exception e) {
			System.out.println("Excel file not found >>" +e.getMessage());
			
		}

}
	// create action data and read the string data from excel sheet
	public String getStringCellData(String sheetname,int row,int col) {
		
		return wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
		
	}
	//read the integer data from excel sheet
	public int getNumericCellData(String sheetname,int row,int col) {
		return (int)wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
		
	}
	public String getStringCellData(int sheetIndex,int row,int col) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		
	}
	public int getNumericCellData(int sheetIndex,int row,int col) {
		return (int)wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getNumericCellValue();
		
	}
	public Object[][] excelTestData(String sheetname) {
		
		XSSFSheet sheet= wb.getSheet(sheetname);
		// to get how many number of rows
		int rowCount = sheet.getLastRowNum();
		// to get how many number of columns
		int colCount = sheet.getRow(0).getLastCellNum();
		// create object of a 2D array
		Object[][]data = new Object[rowCount][colCount];
		//iterate the data from row..for one row how many columns are there that we will 
		//going to iterate.
		//inner for loop for no. of columns
		//outer for loop for no. of rows
		for(int i = 0; i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				//String method return you boolean data
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
			
		}
		return data;
	}
}

