package com.ERP.Testdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jdt.internal.compiler.ast.WhileStatement;

import com.ERP.Masters.Stocklib;

public class UomNotepad {

	public static void main(String[] args) throws IOException 
	{
        Stocklib SL=new Stocklib();
	
	String Res=SL.OpenApp("http://webapp.qedgetech.com");
        System.out.println(Res);
        Res= SL.AdmLogin("admin","master");
        System.out.println(Res);
	//test data path
     //   String Fpath="C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Testdata\\UOM.txt";
//creating for results
       // String Rpath="C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Results\\UOMres.txt";
  //purchase data path
        String Fpath="C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Testdata\\PURCHASE.txt";
        //creating for results path
        String Rpath="C:\\Users\\user07\\workspace\\ERP\\src\\com\\ERP\\Results\\PURCHASE.txt";
        String SD;
        FileReader FR=new FileReader(Fpath);
        BufferedReader BR=new BufferedReader(FR);
        String Sread=BR.readLine();
        System.out.println(Sread);

        FileWriter FW=new FileWriter(Rpath);
        BufferedWriter BW=new BufferedWriter(FW);
        BW.write(Sread+"$$$"+"Results");
        BW.newLine();

        	while ((SD=BR.readLine())!=null)
        		{
        		System.out.println(SD);
        		String[] SR=SD.split("###");
        		//String Uid=SR[0];
        	//	System.out.println(Uid);
        	//	String Udes=SR[1];
        	//	System.out.println(Udes);
     //purchases
        		String Supplierid=SR[0];
        		System.out.println(Supplierid);
        		String Notes=SR[1];
        		System.out.println(Notes);
        		String TotalAmount=SR[2];
        		System.out.println(TotalAmount);
        		String TotalPayment=SR[3];
        		System.out.println(TotalPayment);
        		

        		//Res=SL.UomMea(Uid,Udes);
        		//System.out.println(Res);
        		
        		Res=SL.Purchases(Supplierid, Notes, TotalAmount, TotalPayment);
        		System.out.println(Res);
    
        		//BW.write(Uid+"&&&"+Udes+"@@@"+Res);
        		
        		BW.write(Supplierid+"&&&"+Notes+"@@@"+TotalAmount+"$$$"+TotalPayment+"%%%"+Res);
        		BW.newLine();

        		}
        	BW.close();
        	FW.close();
	}

}
