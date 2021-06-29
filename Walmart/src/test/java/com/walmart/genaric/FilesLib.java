package com.walmart.genaric;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FilesLib {
	public String readPropData(String path,String key) throws Throwable {
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key,"incerect Key");
		return propValue;
	}
	
	public void readDataFromExcelcell(String excelpath,String Sheet) throws Throwable  {
		System.out.println("Enter the Excel path");
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		System.out.println("Enter the Name of the Sheet");
		Sheet sh= wb.getSheet(Sheet);
		int ro=sh.getLastRowNum();
		int cl=sh.getRow(1).getLastCellNum();
		for(int i=0;i<ro;i++) {
			Row row=sh.getRow(i);
			for(int j=0;j<cl;j++) {
				Cell cel=row.getCell(j);
				switch(cel.getCellType()) {
				case STRING: System.out.print(cel.getStringCellValue()); break;
				case NUMERIC: System.out.print(cel.getNumericCellValue()); break;
				case BOOLEAN:System.out.print(cel.getBooleanCellValue()); break; 
				}
			}
		}
	}
				
				
					

}
