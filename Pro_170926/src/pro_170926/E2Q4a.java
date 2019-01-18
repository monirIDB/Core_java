/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170926;

import java.util.Scanner;
public class E2Q4a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int i=0;
		int[] a=new int[i];
		a[i]=sc.nextInt();
		while(a[i]!=-1){
			//a[i]=sc.nextInt();
			i++;
			System.out.println("Enter value");
			a[i]=sc.nextInt();
		}
	}
}

 /*this is not working, below error is showing
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at pro_170926.E2Q4a.main(E2Q4a.java:15)
*/