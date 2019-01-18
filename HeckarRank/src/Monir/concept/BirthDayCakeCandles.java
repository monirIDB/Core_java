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
public class BirthDayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age");
        int n = in.nextInt();
        int tallest = 0;
        int frequency = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value");
            int height = in.nextInt();

            if (height > tallest) {
                tallest = height;
                frequency = 1;
            } else if (height == tallest) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
