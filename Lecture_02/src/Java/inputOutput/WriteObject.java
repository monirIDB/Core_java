/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.inputOutput;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;


public class WriteObject {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dog Name");
        String a=sc.next();
        System.out.println("Enter Dog Coloer");
        String b=sc.next();
        System.out.println("Enter Dog Food");
        String c=sc.next();
        
        Student rahim=new Student(103, "Rahim", "rahim@gmail.com", "01681146198","Male",true,5.2, new Date(12-05-2017));
        Student shibli=new Student(104, "Shibli", "Shibli@gmail.com", "01681146198","Male",true,5.2, new Date(12-05-2017));
        Student zaman=new Student(105, "Zaman", "zaman@gmail.com", "01681146198","Male",true,5.2, new Date(12-05-2017));
        Dog d1=new Dog(a,b,c);
        try{
            String path=new String("myFile_01.ser");
            File file=new File(path);
            FileOutputStream fos =new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(rahim);
            oos.writeObject(shibli);
            oos.writeObject(d1);
            System.out.println("File Created");
            oos.flush();
            oos.close();
            
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}

