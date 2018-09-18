package com.example.demo.entity;

import javax.persistence.*;
/**
 * Created by xjw on 9/16/18.
 */

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "uid")
    private int uid;

    @Column(name = "uname")
    private String uname;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    public User(String uname, String password, String email) {
        this.uname = uname;
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
