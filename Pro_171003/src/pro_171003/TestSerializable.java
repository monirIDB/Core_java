/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_171003;




import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
    public static void main(String[] args){
		SaveObject s1=new SaveObject();
		File d1=new File("abc.txt");
         
		try{
                 FileOutputStream f1=new FileOutputStream("abc.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(f1);
                 System.out.println("File save successfuly");
				oos.writeObject(d1);
                oos.flush();
                oos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                
	}
}

