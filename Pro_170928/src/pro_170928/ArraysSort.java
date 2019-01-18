/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170928;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a={0,25,3,5,7};
		int[] b={25,3,26,8,96};
		int[] c={2,58,4,15,3};
		int[] d={125,69,32,58,1};
		int[] e=new int[5];
                //this loop enter value in array e
		for(int q=0;q<e.length;q++){
			System.out.println("Enter value");
			e[q]=sc.nextInt();
		}
                //these are the sort method which used to sort an arrya
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);
		int[] c1=new int[5];
		int[] d1=new int[5];
		int i=0;
                // this loop used for reversed an array
		for(int j=c.length-1;j>=0;j--){
			c1[i]=c[j];
			i++;
		}
		int k=0;
                // this loop is also used for to reversed an array
		for(int j=c.length-1;j>=0;j--){
			d1[k]=d[j];
			k++;
		}
		int[][] a1={a,b,c1,d1,e};
		System.out.println("The two dimenssional array printed below");
                // this loop used for to print a two dimenssional array
		for(int p=0; p<a1.length; p++){
			for(int j=0; j<a1[p].length;j++){
				System.out.print(a1[p][j]+",");
			}
			System.out.println("");
		}
		
	}
}
