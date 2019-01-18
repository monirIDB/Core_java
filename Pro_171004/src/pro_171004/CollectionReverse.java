/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_171004;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter value");
        int x=sc.nextInt();
	// this while loop entering the n number of velue into arrayList
        while(x!=-1){
            a.add(x);
            System.out.println("Enter value");
            x=sc.nextInt();
        }
        //This loop printing the value of arrayList
       for(int i=0; i<a.size(); i++){
        System.out.print(a.get(i)+ " ");
      } 
       System.out.println(" ");
      Collections.reverse(a);
      for(int i=0; i<a.size(); i++){
        System.out.print(a.get(i)+ " ");
      }
    }
}

