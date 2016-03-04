/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.desktopapplication.data;

import com.vektorel.desktopapplication.data.dto.Staff;
import com.vektorel.desktopapplication.util.DbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author uto
 */
public class StaffService implements IDataService<Staff> {

    Connection conn = DbConnector.getConnection();

    public Staff save(Staff object) {
        try {
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate("insert into staff(id, name, surname, email,address,phone,officeaddress,city_id,district_id)"
                    + "values(nextVal('sq_staff'),'" + object.getName() + "','" + object.getSurname() + "','" + object.getEmail() + "','" + object.getAddress() + "','"+ object.getPhoneNumber()+"','" + object.getOfficeAddress() + "'," + object.getCity() + "," + object.getDistrict() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Staff update(Staff object) {
         try {
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate("update staff set name = '"+object.getName()
                                +"', surname = '" + object.getSurname() + "', email = '"
                                + object.getEmail() + "',address = '" + object.getAddress()
                                + "',phone = '"+ object.getPhoneNumber()+"',officeaddress = '" +
                                object.getOfficeAddress() + "',city_id = " + object.getCity()
                                + ",district_id=" + object.getDistrict()+" where id= "+object.getId());
                   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
    }

    public Boolean delete(Staff object) {
        try {
            Statement stmt = conn.createStatement();
            int affectedRows = stmt.executeUpdate("delete from staff where id =" + object.getId());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Staff> getAll() {
        List<Staff> staffList = new ArrayList<Staff>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,name,surname from staff");

            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                staffList.add(new Staff(id, name, surname));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return staffList;
    }

    public Staff getById(Long id) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,name,surname,email,address,phone,officeaddress,city_id,district_id from staff where id=" + id);
            while (rs.next()) {
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String offAddr = rs.getString("officeaddress");
                Long cityId = rs.getLong("city_id");
                Long distId = rs.getLong("district_id");
                
                
                return new Staff(email ,address,offAddr,phone,cityId,distId,id, name, surname);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
