package com.lan.controllor;

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
    @RequestMapping("/find/{id}")
    public String find(@PathVariable int id){
        try{
            return userMapper.search(id).toString();
        }catch (Exception e){
            e.printStackTrace();
            return "no user!";
        }
    }
}
