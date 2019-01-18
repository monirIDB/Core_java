/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.transiction;

public class Transiction_01{
	public static void main(String[] args){
		Account myAcct;
		myAcct=new Account("me");
		myAcct.balance=200.0;
		myAcct.deposit(300.0);
		myAcct.withdraw(100.0);
		double myBalance;
		myBalance=myAcct.getBalance();
		System.out.println(myBalance);
	}
}
