/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;

import java.io.*;
//import java.util.Scanner;

public class Yellow {

    public static void main(String args[]) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        //Scanner sc=new Scanner(System.in);
        //int b=sc.nextInt();
        //File f=new File(b);
        //InputStreamReader isr= new InputStreamReader(f);
        //BufferedReader br=new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter No. of Seconds after which You want to shutdown your PC :");
        long a = Long.parseLong(br.readLine());

        Process proc = runtime.exec("shutdown -s -t " + a);
        // This propram used to shutdown the PC, so cearfuly used this program (Monir)

        System.exit(0);
    }
}
