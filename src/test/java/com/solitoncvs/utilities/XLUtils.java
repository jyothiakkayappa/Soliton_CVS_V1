package com.solitoncvs.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String xlfile,String xlsheet ) throws IOException 
	{
		fi=new FileInputStream(xlfile); //get excel file
		wb=new XSSFWorkbook(fi);  //get workbook from excel file
		ws=wb.getSheet(xlsheet);  //get xl sheet from workbook
		int rowcount=ws.getLastRowNum(); // get the last row number , so that we can get how many rows are there
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	public static int getCellCount(String xlfile,String xlsheet, int rownum) throws IOException 
	{
		fi=new FileInputStream(xlfile); //get excel file
		wb=new XSSFWorkbook(fi);  //get workbook from excel file
		ws=wb.getSheet(xlsheet);  //get xl sheet from workbook
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String xlfile,String xlsheet, int rownum,int colnum) throws IOException 
	{
		fi=new FileInputStream(xlfile); //get excel file
		wb=new XSSFWorkbook(fi);  //get workbook from excel file
		ws=wb.getSheet(xlsheet);  //get xl sheet from workbook
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try
		{
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		}
		catch(Exception e)
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public static void setCellData(String xlfile,String xlsheet, int rownum,int colnum,String data) throws IOException 
	{
		fi=new FileInputStream(xlfile); //get excel file
		wb=new XSSFWorkbook(fi);  //get workbook from excel file
		ws=wb.getSheet(xlsheet);  //get xl sheet from workbook
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
	
	
	

}
