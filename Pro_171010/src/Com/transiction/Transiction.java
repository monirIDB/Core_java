/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.transiction;

public class Transiction{
	public static void main(String[] args){
		//Account myAcct;
		Account myAcct=new Account("Anis");
		myAcct.balance=200.0;
		myAcct.deposit(300.0);
		myAcct.withdraw(100.0);
		double myBalance;
		myBalance=myAcct.getBalance();
                String myDetails;
                myDetails=myAcct.getDetails();
                double myBalance02;
                myBalance02=myAcct.getBalance02();
                System.out.println("Befor withdraw balance is: "+myBalance02);
		System.out.println("After withdraw balance is: "+myBalance);
                System.out.println(myDetails);
	}
}
