/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.threads;

public class TestThreads {

   public static void main(String args[]) {
      RunbleDemo R1 = new RunbleDemo( "Thread-1");
      R1.start();
      
      RunbleDemo R2 = new RunbleDemo( "Thread-2");
      R2.start();
     
   }   
}