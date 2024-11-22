package testcase;

import java.io.IOException;

/*import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;*/
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		//Step1:Create an object for workbook with help of class XSSFWorkbook and 
		//pass the path of the excel file to read the data
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//Step 2: Get into the work sheet using reference of workbook and by passing the sheet name as parameter
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		//step 3: Get the rows count using the sheet reference.
		int RowCount = sheet.getLastRowNum();
		System.out.println("Total no of rows excluding the header : "+RowCount);
		
/*		int RowCountwithHeader = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows including the header : "+RowCountwithHeader);
		
		// Step 4: get first row data using sheet reference
		XSSFRow row = sheet.getRow(1);
		//Step 5: get column count using the sheet ref and row ref
		
		int ColsCount = row.getLastCellNum();
		System.out.println("Total no of columns count :"+ColsCount);
		//Step 6: to get the first cell data using row ref
		XSSFCell cell = row.getCell(0);
		System.out.println("First Cell data : "+cell);
		
		// step 7: to skip step 4 & 5 as it is too lengthy program and no use of reference.
		//lets write the code in simple terms as below
		
	 //String cellValue = sheet.getRow(1).getCell(0).getStringCellValue();
	// System.out.println("Cell Value :"+cellValue);
	 //Step 8: now we need to read all the cell value from the sheet...
	 //instead of writing same code multiple times by changing the index value we can achieve it using the 
	 //for loop iteration*/
	 int Colcount = sheet.getRow(0).getLastCellNum();
	/* 
	 for (int i = 1; i < 3; i++) {
		 String cellValue = sheet.getRow(i).getCell(0).getStringCellValue();
		 System.out.println("Cell Value :"+cellValue);
	}*/
	 
	 //step 9: now to get and row value and columns value inside for loop we do one more loop
	 for (int i = 1; i <= RowCount; i++) {
		 for (int j = 0; j < Colcount; j++) {
			
	
		 String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
		 System.out.println("Cell Value :"+cellValue);
	}
		}
		wb.close();
	}


}
