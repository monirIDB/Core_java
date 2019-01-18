/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.inputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        File f1 = new File("myFile_01.ser");
        try {
            FileInputStream fis = new FileInputStream(f1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = (Student) ois.readObject();
            Student s2 = (Student) ois.readObject();
            //Dog s3 = (Dog) ois.readObject();
            //Student s3=(Student)ois.readObject();
            System.out.println("Student Name is: " + s1.getName());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class not found");
        }
    }
}
