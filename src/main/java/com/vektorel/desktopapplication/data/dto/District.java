/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data.dto;

/**
 *
 * @author uto
 */
public class District {
    private Long id;
    private Long cityId;
    private String districtName;

    public District() {
    }

    public District(Long id, Long cityId, String districtName) {
        this.id = id;
        this.cityId = cityId;
        this.districtName = districtName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    
    
}
