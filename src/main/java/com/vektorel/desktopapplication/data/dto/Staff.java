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
public class Staff extends Person {
    private Long registerNo;
    private String address;
    private String officeAddress;
    private String phoneNumber;
    private Date birthDate;
    private Long city;
    private Long district;

    public Staff() {
    }

    public Staff(Long id, String name, String surname) {
        super(id, name, surname);
    }

    public Staff(String email, String address, String officeAddress, String phoneNumber, Long city, Long district, Long id, String name, String surname) {
        super(id, name, surname);
        this.address = address;
        this.officeAddress = officeAddress;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.district = district;
        this.setEmail(email);
    }
    

    public Long getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(Long registerNo) {
        this.registerNo = registerNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getDistrict() {
        return district;
    }

    public void setDistrict(Long district) {
        this.district = district;
    }
    
     public String toString() {
        return "Staff{" +super.toString()+ '}';
    }
    
}
