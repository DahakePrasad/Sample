package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider extends BaseClass {
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	
	
	public static String excelDataProvider(String Sheet,int row,int coloumn)
	{
		String path="C:\\Users\\MAULI\\eclipse-workspace\\HybridFramework\\ExcelData\\Data.png";
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String A=wb.getSheet(Sheet).getRow(row).getCell(coloumn).getStringCellValue();
		return A;
	}

}
