package com.mvc.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Classname User
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-03 21:51
 * @Version 1.0
 **/
public class User {
    @NotEmpty
    private String username;

    @Range(min = 1, max = 130)
    private Integer age;

    @NotEmpty
    @Email
    private String email;

    public User(){}

    public User(String username, Integer age, String email){
        this.username = username;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
