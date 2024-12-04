package com.learning.learning.model;


public class DataBase {
    private String name;
    private String email;
    private String password;
    private long phoneNo;
    private String place;
    private int age;

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public void setPlace(String place){
        this.place=place;
    }
    public void setAge(int age){
        this.age=age;
    }

    //getter

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public long getPhoneNo(){
        return this.phoneNo;
    }
    public String getPlace(){
        return this.place;
    }
    public int getAge(){
        return this.age;
    }
}
