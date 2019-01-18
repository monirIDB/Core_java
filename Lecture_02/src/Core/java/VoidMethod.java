/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core.java;

/**
 *
 * @author MonirBUET
 */
public class VoidMethod {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        

        // Invoke the swap method
        sumFunction(a, b);

    }

    public static void sumFunction(int a, int b) {
        int m = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is: " + m);
    }
}
