package com.excel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	/*public static void main(String[] args) {
		String excelpath="C://Users//Abhinav//workspace//webdriverMavenGit//ExcelFolder//datasheet.xlsx";
		testdata(excelpath, "sheet1");
	}*/
	
	@Test(dataProvider = "gettingdatafromsheet")
	public void test(String username, String password)
	{
		System.out.println("Username is "+username+" Password is "+password);
	}
	@DataProvider(name="gettingdatafromsheet")
	public static Object[][] gettingdatafromDataProvider()
	{
		String excelpath="C://Users//Abhinav//workspace//webdriverMavenGit//ExcelFolder//datasheet.xlsx";
		Object[][] ob = testdata(excelpath, "Sheet1");
		return ob;
	}
	
	
	
	
	
	public static Object[][] testdata(String excelpath, String sheetname)
	{
		
		ExcelReader xls = new ExcelReader(excelpath,sheetname);
		int rc =xls.getRowCount();System.out.println(rc);
		int cc = xls.getColCount();System.out.println(cc);
		
		Object[][] data = new Object[rc-1][cc];
		
		for(int i=1;i<rc;i++)
		{
			for(int j=0;j<cc;j++)
			{
				String celldata =xls.getStringCellData(i, j);
				data[i-1][j]=celldata;
			}
			System.out.println();
		}
		
		return data;
	}
	
	
}
