/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170928;

import java.util.Scanner;
public class CompareThreeValue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter MCQ mark");
		int a=sc.nextInt();
		System.out.println("Enter Written mark");
		int b=sc.nextInt();
		System.out.println("Enter Evidance mark");
		int c=sc.nextInt();
		int sum=0;
		if(a>=50 && b>=15 && c>=30){
			sum=a+b+c;
			System.out.println("You are passed and Your mark is: "+sum);
		}else{
			System.out.println("Failed");
		}
	}
}
