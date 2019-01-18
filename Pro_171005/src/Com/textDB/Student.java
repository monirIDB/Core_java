/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.textDB;

import java.util.Date;

/**
 *
 * @author MonirBUET
 */
public class Student {
    int id;
    String name;
    String email;
    float height;
    Date date;

    public Student() {
    }

    public Student(int id, String name, String email, float height, Date date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.height = height;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
