/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.transiction;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadStudent_01 {
    public static void main(String[] args) {
        String path= "myfile.ser";
        File f1= new File(path);
        try {
            FileInputStream fis=new FileInputStream(f1);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student_01 s1=(Student_01)ois.readObject();
            System.out.println(s1);
            
        } catch (IOException e) {
        }catch(ClassNotFoundException cnfe){
        
        }
    }
}
