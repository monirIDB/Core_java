/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monir.concept;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MonirBUET
 */
public class ArraySumMinMax {

    public static void main(String[] args) {
        // This method works well
//        Scanner in = new Scanner(System.in);
//        long min,max,sum=0;
//        min=in.nextLong();
//        max=min;
//        sum=min;
//        for(int i=0;i<4;i++){
//             long a = in.nextLong();
//            sum+=a;
//            if(a<min){
//                min=a;
//            }
//            if(a>max){
//                max=a;
//            }
//        }
//        System.out.print((sum-max)+" "+(sum-min));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of array");
            arr[i] = scanner.nextInt();
        }
        int min = 0;
        int max = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            min += arr[i];
            max += arr[i + 1];
        }
        System.out.println("The max of array sum is "+max);
        System.out.println("The min of array sum is "+min);
    }
}
