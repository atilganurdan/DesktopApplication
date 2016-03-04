/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data.dto;

import java.util.Date;

/**
 *
 * @author uto
 */
public class User extends Person {

    private String uname;
    private String pwd;
    private Date uyelikTarihi;

    public User(Long id, String name, String surname) {
        super(id, name, surname);
    }

    public User() {
    }

    public User(String uname, String pwd, Date uyelikTarihi) {
        this.uname = uname;
        this.pwd = pwd;
        this.uyelikTarihi = uyelikTarihi;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getUyelikTarihi() {
        return uyelikTarihi;
    }

    public void setUyelikTarihi(Date uyelikTarihi) {
        this.uyelikTarihi = uyelikTarihi;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + super.getId() + ",uname=" + uname + ", pwd=" + pwd + ", uyelikTarihi=" + uyelikTarihi + '}';
    }
    
    
}
