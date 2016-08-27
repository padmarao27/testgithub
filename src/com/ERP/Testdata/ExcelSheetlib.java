package com.ERP.Testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ERP.Masters.Stocklib;

public class ExcelSheetlib {
	
	private static final String SL = null;

	public static void main(String[] args) throws IOException
	{
		Stocklib lib=new Stocklib();
		FileInputStream Fis=new FileInputStream("C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Testdata\\UOM creation.xlsx");
		//workbook creation
	
			XSSFWorkbook WB=new XSSFWorkbook(Fis);
		//sheet
			XSSFSheet WS=WB.getSheet("UOMdata");
			//row
	           /*  XSSFRow WR=WS.getRow(1);
	             //Column
	                XSSFCell WC=WR.getCell(0);
	                Res=WC.getStringCellValue();
	             System.out.println(Res);*/
			//Row count
			//Stocklib sl=new Stocklib();
			lib.OpenApp("http://webapp.qedgetech.com");
			lib.AdmLogin("admin", "master");
			int RC=WS.getLastRowNum();
			for(int i=1;i<=RC;i++)
			{
				XSSFRow WR=WS.getRow(i);
				XSSFCell WC=WR.getCell(0);
				XSSFCell WC1=WR.getCell(1);
				XSSFCell WC2=WR.createCell(2);
				
				String UOMid=WC.getStringCellValue();
				String UOMdes=WC1.getStringCellValue();
				
				System.out.println(UOMid+"   "+UOMdes);
				
				String res=lib.UomMea(UOMid, UOMdes);
					
			
			
			WC2.setCellValue(res);
	
			}
		FileOutputStream Fos=new FileOutputStream("C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Results\\UOMrs.xlsx");
		WB.write(Fos);
		
		WB.close();
	}
	
}
