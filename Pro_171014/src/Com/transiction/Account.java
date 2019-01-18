/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.transiction;

public class Account {

    String customar;
    double balance;

    public Account(String name) {
        customar = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance = balance + sum;
        }
    }

    public void withdraw(double sum) {
        if (sum <= balance && sum > 0) {
            balance = balance - sum;
        }
    }

    public String getCustomer() {
        return customar;
    }

    public String getDetails() {
        return "Type :" + "Account\n"
                + "Customar:" + customar + "\n"
                + "Balance  :" + balance;
    }
}
