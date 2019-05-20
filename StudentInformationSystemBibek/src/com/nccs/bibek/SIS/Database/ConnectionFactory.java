/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.bibek.SIS.Database;

import java.sql.*;

/**
 *
 * @author dipesh
 */
public class ConnectionFactory {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    boolean isTrue = false;

    public ConnectionFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsis", "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM usertable WHERE username=? " + "AND password=?";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                isTrue = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isTrue;
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsis", "root", "");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
