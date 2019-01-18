/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monir.concept;

import java.util.Scanner;

/**
 *
 * @author MonirBUET
 */
public class ArrayPlusMinus {
    static void plusMinus(int[] arr) {
    double p=0,n=0,z=0;
    int al = arr.length;
    for(int i=0;i<al;i++)
    {
        if(arr[i]>0)
        {
            p++;
        }
        else if(arr[i]<0)
        {
            n++;
        }
        else if (arr[i]==0)
        {
            z++;
        }

    }
    System.out.println("Total posetive number into the Array is "+p);
    System.out.printf("Ratio of Posetive Number", p/al);
    System.out.println("Total negative number into the Array is "+n);
    System.out.printf("Ratio of negative Number" ,n/al);
    System.out.println("Total zero into the Array is "+z);
    System.out.printf("Ratio of Zero", z/al);
}                  

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the length of Array");
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int arr_i = 0; arr_i < n; arr_i++){
        System.out.println("Enter the value of A6rray");
        arr[arr_i] = in.nextInt();
    }
    plusMinus(arr);
    in.close();
}
}
