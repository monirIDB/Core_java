/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.textDB;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.Date;




public class DbConnection {
    public static void main(String[] args) {
        DbConnection dBconnection=new DbConnection();
        dBconnection.doSave();
    }
    private void doSave(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mySql://localhost:3306/db1";
            String user="root";
            String pass="apcl1234";
            Connection con=DriverManager.getConnection(url,user,pass);
            String st="insert into student(id,name,email,height,admit_date) values(?,?,?,?,?)";
            PreparedStatement pstm1=con.prepareStatement(st);
            pstm1.setInt(1,500);
            pstm1.setString(2, "Monir");
            pstm1.setString(3, "monir@gmail.com");
            pstm1.setFloat(4, 5.5f);
            
            Calendar c=Calendar.getInstance();
            c.set(1995,11,31);
            Date sDate=c.getTime();
            
            java.sql.Date d=new java.sql.Date(sDate.getTime());
            
            pstm1.setDate(5, d);
            
            int i1=pstm1.executeUpdate();
            if(i1>0){
                System.out.println("Insert succesfull");
            }else{
                System.out.println("Inserte failed");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

