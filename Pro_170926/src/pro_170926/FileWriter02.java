/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170926;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriter02{
	public static void main(String[] args){
		try{
			String add="G:\\Core Java\\Pro_170926\\Created_file\\test3.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
			FileWriter fw=new FileWriter(myFile);
			char[] ca = {'M','o','h','a','m','m','a','d','\n','M','o','n','i','r'};
			fw.write(ca);
			fw.flush();
			fw.close();
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}
