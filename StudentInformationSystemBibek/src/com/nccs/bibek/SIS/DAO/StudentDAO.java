/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.bibek.SIS.DAO;

import com.nccs.bibek.SIS.DTO.StudentDTO;

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
 * @author dipesh
 */
public class StudentDAO {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public StudentDAO() {
        con = new ConnectionFactory().getConnection();

    }

    public void addStudent(StudentDTO user) {
        String query = "INSERT INTO studenttable VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getStidId());
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getMiddleName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getPerAddress());
            ps.setString(7, user.getTempAddress());
            ps.setString(8, user.getEmail());
            ps.setString(9, user.getMobile());
            ps.setString(10, user.getProgram());
            ps.setString(11, user.getSemester());
            ps.setString(12, user.getSection());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record inserted sucessfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ResultSet getQueryResult() {
        String query = "SELECT * FROM studenttable";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public StudentDTO editStudent(JTable table) {
        StudentDTO student = new StudentDTO();
        student.setStidId((Integer) table.getValueAt(table.getSelectedRow(), 0));

        student.setFirstName((String) table.getValueAt(table.getSelectedRow(), 1));
        student.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 2));
        student.setLastName((String) table.getValueAt(table.getSelectedRow(), 3));
        student.setGender((String) table.getValueAt(table.getSelectedRow(), 4));
        student.setPerAddress((String) table.getValueAt(table.getSelectedRow(), 5));
        student.setTempAddress((String) table.getValueAt(table.getSelectedRow(), 6));
        student.setEmail((String) table.getValueAt(table.getSelectedRow(), 7));
        student.setMobile((String) table.getValueAt(table.getSelectedRow(), 8));
        student.setProgram((String) table.getValueAt(table.getSelectedRow(), 9));

        return student;
    }

    public void UpdateStudent(StudentDTO student) {
        String query = "UPDATE studenttable set firstname=?,middlename=?,lastname=?,gender=?,permanentAddress=?,temporaryAddress=?,email=?,mobile=?,program=?,semester=?,section=? WHERE studentId = ?";
        try {
            ps = con.prepareStatement(query);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getMiddleName());
            ps.setString(3, student.getLastName());
            ps.setString(4, student.getGender());
            ps.setString(5, student.getPerAddress());
            ps.setString(6, student.getTempAddress());
            ps.setString(7, student.getEmail());
            ps.setString(8, student.getProgram());
            ps.setString(9, student.getMobile());
            ps.setString(10, student.getSemester());
            ps.setString(11, student.getSection());
            ps.setInt(12, student.getStidId());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record updated");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String value) {
        String query1 = "DELETE FROM studenttable WHERE userid = ?";
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

    public ResultSet searchStudent(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("userid")) {
            query = "SELECT * FROM studenttable WHERE " + name + "=" + value;
        } else {
            query = "SELECT * FROM studenttable WHERE " + name + "='" + value + "'";
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

}
