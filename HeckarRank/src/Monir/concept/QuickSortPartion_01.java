/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monir.concept;

import java.util.*;
public class QuickSortPartion_01 {
	 static void quickSort(int[] arr) {
	        int pivot=arr[0];
	        ArrayList<Integer>left=new ArrayList<Integer>();
	        ArrayList<Integer>right=new ArrayList<Integer>();
	        for(int j=0;j<arr.length;j++) {
	        	if(pivot>arr[j]) {
	        		left.add(arr[j]);
	        		}
	        	else if(pivot<arr[j]) {
	        		right.add(arr[j]);
	        	}
	        }
	     
	        for(int x:left) System.out.print(x+" ");
	        System.out.print(pivot+" ");
	        for(int x:right) System.out.print(x+" ");
	        }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        quickSort(arr);
	        in.close();
	    }
}
