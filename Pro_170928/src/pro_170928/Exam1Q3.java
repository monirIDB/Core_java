/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_170928;

public class Exam1Q3{
	public static void main(String[] args){
		double y=10;
		double p=1000;
		double i=1.05;
		double s=0;
		double sum=1;
		for(int j=0; j<y; j++){
			sum=sum*i;
		}
		s=p*sum;
		System.out.println(s);
	}
}
