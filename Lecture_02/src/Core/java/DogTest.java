/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core.java;

public class DogTest {

    public static void main(String args[]) {
        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();
        Dog c = new Dog();// Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move(); // runs the method in Dog class
//      b.bark(); 
        c.bark();
    }
}
