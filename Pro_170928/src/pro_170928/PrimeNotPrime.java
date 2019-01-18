/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170928;

import java.util.Scanner;
public class PrimeNotPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
                //this loop is for determine factorial of a number
		for(int i=1; i<=a; i++){
			fact=fact*i;
		}
		System.out.println("The factorial of "+a+" is: "+fact);
		int c=0;
                //this loop can determined prime not prime
		for(int i=1; i<=a; i++){
			int b=a%i;
			if(b==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("The number "+a+" is a prime number");
		}else{
			System.out.println("The number "+a+" is not a prime number");
		}
                // this is the end of deterrmining prime not prime
                // this is for determining odd even
		if(a/2==0){
			System.out.println("The number "+a+" is a even number");
		}else{
			System.out.println("The number "+a+" is a odd number");
		}
	}
}
