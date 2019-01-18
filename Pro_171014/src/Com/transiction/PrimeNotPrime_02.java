/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.transiction;

import java.util.Scanner;

public class PrimeNotPrime_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " is a not prime Number");
                break;
            }
        }
        if (i == a) {
            System.out.println(a + " is a Prime Number");
        }
    }
}
