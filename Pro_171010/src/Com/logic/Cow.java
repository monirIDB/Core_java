/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;

public class Cow extends Animal {
    @Override
    public String eat() {
        return "cow eat grass";
    }
    @Override
    public String makeSound() {
        return "Cow says Hambaa..";
    }
}
