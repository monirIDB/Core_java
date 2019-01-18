/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monir.concept;

import java.util.Scanner;

public class TimeConversion {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String time = in.next();
//        String[] parts = time.split(":");
//        for(String part: parts){
//            System.out.println(part);
//        }
//        int hours = Integer.parseInt(parts[0]);
//        String minutes = (parts[1]);
//        String[] last = parts[2].split("");
//
//        String seconds = last[0]+last[1];
//        String timeZ = last[2]+last[3];
//        String finalHour = "";
//        if(timeZ.equalsIgnoreCase("PM")) {
//            if(hours == 12) {
//                finalHour = Integer.toString(12);
//            }
//            else {
//                finalHour = Integer.toString(hours + 12);
//            }
//        }
//        else if(timeZ.equalsIgnoreCase("AM")) {
//            if(hours == 12) {
//                finalHour = "00";
//            }
//            else if(hours == 10 || hours == 11) {
//                finalHour = Integer.toString(hours);
//            }
//            else {
//                finalHour = "0"+hours;
//            }
//        }
//        System.out.println(finalHour+":"+minutes+":"+seconds);
//
//
//    }
    
//     public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String time = in.next();
//        int hours;
//        String hrs = time.substring(0,2);
//        hours = Integer.parseInt(hrs);
//        String mins = time.substring(3,5);
//        String secs = time.substring(6,8);
//        String am_pm = time.substring(time.length()-2,time.length());
//        if(am_pm.equalsIgnoreCase("PM") && !hrs.equalsIgnoreCase("12")){  
//            hours += 12;
//            hrs = Integer.toString(hours);
//        }
//        else if(am_pm.equalsIgnoreCase("AM") && hrs.equalsIgnoreCase("12")){
//            hours = 0;
//            hrs = "00";
//        }
//        System.out.println(hrs+":"+mins+":"+secs);
//    }
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();

    String[] sTime = time.split(":");

    int x = sTime[sTime.length - 1].contains("PM") ? 12 : 0 ;

    String val1 = (x == 12) ?  (Integer.parseInt(sTime[0]) + x) + "" :  (sTime[0].equals("12") ? "00" : sTime[0]);

    String result = val1 + ":" + sTime[1] + ":" + sTime[2].substring(0,2);
    System.out.println(result);
}
}

