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
public class Array2DPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrics dimession");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter value");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The value of 2D array is below");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(a[i][j] + ",");
            }
            System.out.println(" ");
        }
        System.out.println("The length of 2D array is "+a.length);
        //This part for print the difference of sum of digonal of matrics
        int rightD = 0;
        int leftD = 0;
        for(int i = 0; i < n; i++){
            leftD += a[i][i];
            rightD += a[i][n-i-1];
        }
        System.out.println("The difference of the sum of digonal is " + Math.abs(leftD - rightD));
    }
}
