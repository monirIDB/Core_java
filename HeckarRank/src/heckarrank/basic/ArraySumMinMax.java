/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckarrank.basic;

import java.util.Scanner;

/**
 *
 * @author MonirBUET
 */
public class ArraySumMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while(scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        scan.close();
        
        System.out.println((sum - max) + " " + (sum - min));
    }
}
