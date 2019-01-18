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
public class IntroCondStatment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if ( (N % 2 == 1 ) || (N % 2 == 0 && N >= 5 && N <= 20) ){
            System.out.println("Weird");
        } else  {
            System.out.println("Not Weird");
        }
    }
}
