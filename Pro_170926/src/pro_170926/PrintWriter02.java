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
import java.io.PrintWriter;
import java.util.Scanner;
public class PrintWriter02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		String s=sc.nextLine();
		try{
			String add="G:\\Core Java\\Pro_170926\\Created_file\\test5.txt";
			File myFile=new File(add);
			boolean b1=myFile.createNewFile();
			if(b1){
				System.out.println("File is created succesfully");
			}else{
				System.out.println("File not is created");
			}
			FileWriter fw=new FileWriter(myFile);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			//char[] ca = {'M','o','h','a','m','m','a','d'};
		
			
			bw.write("Name is: "+s);
			bw.flush();
			bw.close();
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
	}
}
