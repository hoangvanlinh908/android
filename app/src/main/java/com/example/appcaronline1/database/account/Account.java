package com.example.appcaronline1.database.account;

public class Account {
    private String userName_422,passWord_422,name_422,phoneNumber_422,email_422;
    private int gioiTinh_422;
    public static Account AccountLogin;

    public Account() {
    }
    public Account(String passWord_422){
        this.passWord_422 = passWord_422;
    }

    public String getName_422() {
        return name_422;
    }

    public void setName_422(String name_422) {
        this.name_422 = name_422;
    }

    public int getGioiTinh_422() {
        return gioiTinh_422;
    }

    public void setGioiTinh_422(int gioiTinh_422) {
        this.gioiTinh_422 = gioiTinh_422;
    }

    public String getPhoneNumber_422() {
        return phoneNumber_422;
    }

    public void setPhoneNumber_422(String phoneNumber_422) {
        this.phoneNumber_422 = phoneNumber_422;
    }

    public String getEmail_422() {
        return email_422;
    }

    public void setEmail_422(String email_422) {
        this.email_422 = email_422;
    }

    public String getUserName_422() {
        return userName_422;
    }

    public void setUserName_422(String userName_422) {
        this.userName_422 = userName_422;
    }

    public String getPassWord_422() {
        return passWord_422;
    }

    public void setPassWord_422(String passWord_422) {
        this.passWord_422 = passWord_422;
    }
}
