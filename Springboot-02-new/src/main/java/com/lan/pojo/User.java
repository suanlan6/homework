package com.lan.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    public String toString(){
            return "{id:" + id + ",name:" + name + "}";
    }
}
