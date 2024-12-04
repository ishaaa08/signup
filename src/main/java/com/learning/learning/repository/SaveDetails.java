package com.learning.learning.repository;

import com.learning.learning.model.DataBase;

import java.util.HashMap;
import java.util.Map;

public class SaveDetails {

    Map<String, DataBase> dataBaseMap = new HashMap<>();

    public String savedetails( DataBase db) {
        dataBaseMap.put(db.getEmail(), db);
        return "successfully saved";
    }
    public String changeDetails(String email,String password) {
        DataBase db= dataBaseMap.get(email);
        if(db!=null) {

            db.setPassword(password);
            return "successfully password changed";
        }
        return "email does not match";
    }

    public Map<String, DataBase> viewAllDetails() {
        return dataBaseMap;

    }

    public String fetchDetails(String email) {
        DataBase db = dataBaseMap.get(email);
        String result = db.getPassword()+"\t"+db.getName()+"\t"+db.getEmail()+"\t"+db.getPlace()+"\t"+db.getAge()+"\t"+db.getPhoneNo();
        return result;
    }

}