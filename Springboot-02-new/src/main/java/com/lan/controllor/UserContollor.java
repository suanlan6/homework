package com.lan.controllor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UserContollor {
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value="/find/{id}",produces = "application/json;charset=utf-8")
    public String find(@PathVariable int id){
        try{
            ObjectMapper om=new ObjectMapper();
            return om.writeValueAsString(userMapper.search(id));
        }catch (Exception e){
            e.printStackTrace();
            return "no user!";
        }
    }
}
