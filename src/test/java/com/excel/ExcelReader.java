package com.excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	ExcelReader(String excelpath, String sheetname)
	{
		try
		{
		
		 workbook = new XSSFWorkbook(excelpath);
		 sheet = workbook.getSheet(sheetname);
		
	    } catch(Exception e){e.printStackTrace();}
		
	}

 public static int getRowCount()
 {
	int rowcount = sheet.getPhysicalNumberOfRows();
	return rowcount;
 }
 
 public static int getColCount()
 {
	
	int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
	return colcount;
	 
 }
 
 public static String getStringCellData(int rownum, int colnum)
 {
	String celldata = null;	
	celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	return celldata;
	
 }
 
 
	/*String excelpath = "C://Users//Abhinav//workspace//webdriverMavenGit//ExcelFolder//datasheet.xlsx";
	XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
	XSSFSheet sheet = workbook.getSheet("Sheet1");*/
 
}
