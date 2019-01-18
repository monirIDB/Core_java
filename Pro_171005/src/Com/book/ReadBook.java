/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadBook {

    public static void main(String[] args) {
        String f = new String("BookInfo_01.txt");
        File f1 = new File(f);
        try {
            FileInputStream fs = new FileInputStream(f1);
            ObjectInputStream os = new ObjectInputStream(fs);
            Book s1 = (Book) os.readObject();
            System.out.print("Book ID: " + s1.getId() + " Book Name: " + s1.getName() + " Book Name: " + s1.getPrise());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class not found");
        }
    }
}
