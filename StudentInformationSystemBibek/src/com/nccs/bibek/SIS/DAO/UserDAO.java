/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.bibek.SIS.DAO;

import com.nccs.bibek.SIS.DTO.UserDTO;
import com.nccs.bibek.SIS.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 * @author dipesh
 */
public class UserDAO {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public UserDAO() {
        con = new ConnectionFactory().getConnection();

    }

    public void addUser(UserDTO user) {
        String query = "INSERT INTO usertable VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getUserId());
            ps.setString(2, user.getUserName());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getMiddleName());
            ps.setString(5, user.getLastName());
            ps.setString(6, user.getPassword());
            ps.setString(7, user.getPermanentAddress());
            ps.setString(8, user.getTemporaryAddress());
            ps.setString(9, user.getContact());
            ps.setString(10, user.getEmail());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record inserted sucessfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet getQueryResult() {
        String query = "SELECT userId,username,firstname,middlename,lastname,peraddress,tempaddress,contact,email FROM usertable";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public DefaultTableModel builtTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        //for heading 1dimensional so...
        Vector<String> columnName = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnName.add(metaData.getColumnName(column));
        }
        //for data 2dimensional so...
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnName);

    }

    public UserDTO editUser(JTable table) {
        UserDTO user = new UserDTO();
        user.setUserId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        user.setUserName((String) table.getValueAt(table.getSelectedRow(), 1));
        user.setFirstName((String) table.getValueAt(table.getSelectedRow(), 2));
        user.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 3));
        user.setLastName((String) table.getValueAt(table.getSelectedRow(), 4));
        user.setTemporaryAddress((String) table.getValueAt(table.getSelectedRow(), 5));
        user.setPermanentAddress((String) table.getValueAt(table.getSelectedRow(), 6));
        user.setContact((String) table.getValueAt(table.getSelectedRow(), 7));
        user.setEmail((String) table.getValueAt(table.getSelectedRow(), 8));
        return user;
    }

    public void UpdateUser(UserDTO user) {
        String query = "UPDATE usertable set firstname=?,middlename=?,lastname=?,peraddress=?,tempaddress=?,contact=?,email=? WHERE userId = ?";
        try {
            ps = con.prepareStatement(query);

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getMiddleName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getTemporaryAddress());
            ps.setString(5, user.getPermanentAddress());
            ps.setString(6, user.getContact());
            ps.setString(7, user.getEmail());
            ps.setInt(8, user.getUserId());
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String value) {
        String query1 = "DELETE FROM usertable WHERE userid = ?";
        try {
            ps = con.prepareStatement(query1);
            ps.setInt(1, Integer.parseInt(value));
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One recorded deleted sucessfully");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Vector<String> getColumnNames(ResultSet rs) {
        Vector<String> columnName = new Vector<String>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnName.add(metaData.getColumnName(column));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;

    }

    public ResultSet searchUser(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("userid")) {
            query = "SELECT userId,username,firstname,middlename,lastname,peraddress,tempaddress, contact,email FROM usertable WHERE "+name+"=" +value;
        } else {
            query = "SELECT userId,username,firstname,middlename,lastname,peraddress,tempaddress, contact,email FROM usertable WHERE " +name+"='"+value+"'";
        }
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Search not found");
            } else {

                rs.beforeFirst();
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return rs;

    }
    boolean isOkay;
    public boolean changePassword(String username,String oldPassword, String newPassword){
           isOkay = false;
           String query1 = "Update usertable set password=? WHERE username=? and password=?";
           try{
               ps = con.prepareStatement(query1);
               ps.setString(1, newPassword);
               ps.setString(2, username);
               ps.setString(3, oldPassword);
               if(ps.executeUpdate() > 0){
                   isOkay = true;
               }
           }catch(Exception e){
               e.printStackTrace();
           }
           return isOkay;
        
    }
}
