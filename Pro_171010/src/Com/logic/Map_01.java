/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.logic;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Map_01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one","1st");
        map.put("second",new Integer(2));
        map.put("third","3rd");
        //Overwrites the privious assignment
        map.put("third","III");
        //Returns set view of keys
        Set set1 = map.keySet();
        //Returns Collection view of values
        Collection collection = map.values();
        //Returns set view of key value mappings
        Set set2 =map.entrySet();
        System.out.println(set1 + "\n" + collection + "\n" + set2);
    }
}

