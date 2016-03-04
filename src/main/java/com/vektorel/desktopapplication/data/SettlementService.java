/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data;

import com.vektorel.desktopapplication.data.dto.City;
import com.vektorel.desktopapplication.data.dto.District;
import com.vektorel.desktopapplication.util.DbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uto
 */
public class SettlementService {

    Connection conn = DbConnector.getConnection();

    public List<City> getAllCity() {
        List<City> cityList = new ArrayList<City>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,tanim from il");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String cityName = rs.getString("tanim");
                cityList.add(new City(id, cityName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cityList;
    }

    public List<District> getAllDistrict() {
        List<District> districtList = new ArrayList<District>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,il_id, tanim from ilce");
            while (rs.next()) {
                Long id = rs.getLong("id");
                Long cityId = rs.getLong("il_id");
                String districtName = rs.getString("tanim");
                districtList.add(new District(id, cityId, districtName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return districtList;
    }

    public List<District> getDistrictsByCityId(Long cityId) {

        List<District> districtList = new ArrayList<District>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,il_id, tanim from ilce where il_id=" + cityId);
            while (rs.next()) {
                Long id = rs.getLong("id");
                Long cityIdDb = rs.getLong("il_id");
                String districtName = rs.getString("tanim");
                districtList.add(new District(id, cityIdDb, districtName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return districtList;
    }

    public List<District> getDistrictsByCityName(String cityName) {
        List<District> districtList = new ArrayList<District>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select ic.id, ic.il_id, ic.tanim from il i, ilce ic where i.id = ic.il_id and i.tanim = '" + cityName + "'");
            while (rs.next()) {
                Long id = rs.getLong("id");
                Long cityIdDb = rs.getLong("il_id");
                String districtName = rs.getString("tanim");
                districtList.add(new District(id, cityIdDb, districtName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return districtList;
    }

    public District getDistrict(Long dstId) {

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select ic.id, ic.il_id, ic.tanim from ilce ic where ic.id= " + dstId);
            while (rs.next()) {
                Long id = rs.getLong("id");
                Long cityIdDb = rs.getLong("il_id");
                String districtName = rs.getString("tanim");
                return new District(id, cityIdDb, districtName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public City getCity(Long cityId) {

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,tanim from il  where id= " + cityId);
            while (rs.next()) {
                Long id = rs.getLong("id");

                String cityName = rs.getString("tanim");
                return new City(id, cityName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
