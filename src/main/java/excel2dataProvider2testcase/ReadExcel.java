package excel2dataProvider2testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelMethod(String filename) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./data/"+filename+".xlsx");//get into workbook
		System.out.println("Identidied test data sheet :" +filename);
		XSSFSheet sheet = wb.getSheet("sheet1");//get into the sheet name mention inside workbook
		int lastRowNum = sheet.getLastRowNum();//gets total no of rows present in sheet 1 of  workbook ignoring the header
		System.out.println("Total no.of rows identified : "+lastRowNum);
		int lastCellNum = sheet.getRow(0).getLastCellNum();// gets total no of columns present in sheet 1 of workbook with help of row index.
		System.out.println("Total no of column present : "+lastCellNum);
		String[][] data=new String[lastRowNum][lastCellNum];
		for(int i=1; i<=lastRowNum;i++) {
			for(int j=0;j<lastCellNum;j++) {
				String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("The Cell value is : "+CellValue);
				data[i-1][j]=CellValue;
				
			}
		}
		
		wb.close();
		return data;
	}

}
