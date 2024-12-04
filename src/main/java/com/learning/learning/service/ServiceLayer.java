package com.learning.learning.service;

import com.learning.learning.model.DataBase;
import com.learning.learning.repository.SaveDetails;

import java.util.Map;

public class ServiceLayer {
    private SaveDetails savedetails=new SaveDetails();
//    public String saveLoginDetails(String email, String password) {
//
//    }
    
    public String saveDetails( DataBase db) {
        return savedetails.savedetails( db);

    }
    
    public String changeDetails(String email,String password) {
        return savedetails.changeDetails(email,password);
    }

    public Map<String, DataBase> viewAllDetails() {
        return savedetails.viewAllDetails();
    }
    public String fetchDetails(String email) {
        return savedetails.fetchDetails(email);
    }
}
