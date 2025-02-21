package com.example.mainproject;

public class data3 {
    String email,username,password,schoolname;

    public data3(String email, String username, String password, String schoolname) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.schoolname = schoolname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
}
