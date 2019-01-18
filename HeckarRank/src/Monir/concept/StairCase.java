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
public class StairCase {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            builder.append(" ");
//        }
//        int j = 0;
//
//        for (int i = 1; i <= n; i++) {
//            builder.replace(builder.length() - i,
//                    builder.length() - j, "#");
//            System.out.println(builder);
//            j++;
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //char c = '#';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
