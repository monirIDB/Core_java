/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;

public class TestPds {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Cow();
        Animal a3 = new Fiziun();
        System.out.println(a3.eat());
        System.out.println(a2.makeSound());
        //System.out.println(a1.eat());
        //System.out.println(a1.makeSound());

    }
}
