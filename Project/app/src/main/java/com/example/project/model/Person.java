package com.example.project.model;

public class Person {
    private Integer id;
    private String email;
    private String user;
    private String password;

    public Person(){

    }

    public void Person(Integer id, String email, String user, String password){
        this.id = id;
        this.email = email;
        this.user = user;
        this.password = password;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
