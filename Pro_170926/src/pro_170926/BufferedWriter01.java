/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170926;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class BufferedWriter01{
	public static void main(String[] args){
		try{
			String add="G:\\Core Java\\Pro_170926\\Created_file\\text1.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
			FileWriter fw=new FileWriter(myFile);
			BufferedWriter bw=new BufferedWriter(fw);
			char[] ca = {'M','o','h','a','m','m','a','d'};
			bw.write(ca,1,3);
			bw.newLine();
			bw.write(ca,4,3);
			bw.flush();
			bw.close();
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}