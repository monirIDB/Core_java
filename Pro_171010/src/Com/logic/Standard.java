/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Standard {
    public static void main(String[] args) {
         String s;
         InputStreamReader ir=new InputStreamReader(System.in);
         BufferedReader in=new BufferedReader(ir);
         System.out.println("Unix: Type ctrl-d to exit."+"\nWindows:Type ctrl-z to exit");
         try{
             s=in.readLine();
             while(s!=null){
             System.out.println("Read: "+s);
             s=in.readLine();
             }
             //while ((s=in.readLine())!=null){
           //System.out.println("Read: "+s);
        // }
             
             
             
             
         }catch(IOException e){
             e.printStackTrace();
         }
         
         
         
    }
        
}

