/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data.dto;

/**
 *
 * @author uto
 */
public class City {
    private Long id;
    private String cityName;

    public City() {
    }

    public City(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    
}
