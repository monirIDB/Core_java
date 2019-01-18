/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;

import java.util.Scanner;

public class PrimeNotPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }
        }
        if (i == n) {
            System.out.println("prime");
        }
    }
}
