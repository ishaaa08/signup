package com.learning.learning.controller;

import com.learning.learning.model.DataBase;
import com.learning.learning.service.ServiceLayer;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ControllerLayer {

    private ServiceLayer serviceLayer=new ServiceLayer();




    @GetMapping("/api/hello")
    public String hello(){
        return "Hello World";
    }

//    @GetMapping("/api/login")
//    public String emailPassword(@RequestParam String email, @RequestParam String password){
//        String result=email+"\t"+password;
//        return result;
//
//    }
//
//    @GetMapping("/api/signup")
//    public String signUp(@RequestParam(required = false) Integer id, @RequestParam String name, @RequestParam String email, @RequestParam String password,@RequestParam(required = false) long phoneNo, @RequestParam(required = false) String place){
//
//        String result=id+"\t"+name+"\t"+email+"\t"+password+"\t"+phoneNo+"\t"+place;
//        return result;
//    }
    
    @PostMapping("/api/signup")
    public String saveDetails(@RequestBody DataBase db){
        return serviceLayer.saveDetails( db);
        
    }
    
    @PostMapping("/api/change-details")
    public String changeDetails(@RequestParam String email, @RequestParam String password){
        return serviceLayer.changeDetails(email,password);
        
    }

    @PostMapping("api/view-all-details")
    public Map<String, DataBase> viewAllDetails(){
        return serviceLayer.viewAllDetails();
    }
    
    @PostMapping("/api/fetch-details")
    public String fetchDetails(@RequestParam String email){
        return serviceLayer.fetchDetails(email);

    }



}
