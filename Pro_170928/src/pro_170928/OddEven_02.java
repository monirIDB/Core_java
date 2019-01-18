/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170928;

import java.util.Scanner;

public class OddEven_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

}
