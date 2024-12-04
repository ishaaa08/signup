package com.learning.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoginDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String name;
    private String place;
    private long phoneNo;

    //setter
    public void setId(int id){
        this.id=id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String  password){
        this.password=password;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPlace(String place){
        this.place=place;
    }

    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }

    //getter
    public int getId(){
        return this.id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.name;
    }

    public String getPlace(){
        return this.place;
    }

    public long getPhoneNo(){
        return this.phoneNo;
    }

}