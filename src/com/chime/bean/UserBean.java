package com.chime.bean;

public class UserBean {
    private String username;
    private String passwd;
    private String grade;

    public UserBean() {
    }

    public UserBean(String username, String passwd, String grade) {
        this.username = username;
        this.passwd = passwd;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
