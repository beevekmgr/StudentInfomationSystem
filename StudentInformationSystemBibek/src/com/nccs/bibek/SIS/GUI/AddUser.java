/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.bibek.SIS.GUI;

import com.nccs.bibek.SIS.DAO.UserDAO;
import com.nccs.bibek.SIS.DTO.UserDTO;

/**
 *
 * @author Punam
 */
public class AddUser extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        useridlbl = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        firstnamelbl = new javax.swing.JLabel();
        middlenamelbl = new javax.swing.JLabel();
        lastnamelbl = new javax.swing.JLabel();
        peraddresslbl = new javax.swing.JLabel();
        tempaddress = new javax.swing.JLabel();
        contactlbl = new javax.swing.JLabel();
        emaillbl = new javax.swing.JLabel();
        userIdTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        middleNameTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        permanentAddressTxt = new javax.swing.JTextField();
        temporaryAddressTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        useridlbl.setText("User ID");

        usernamelbl.setText("UserName");

        passwordlbl.setText("Password");

        firstnamelbl.setText("FirstName");

        middlenamelbl.setText("MiddleName");

        lastnamelbl.setText("LastName");

        peraddresslbl.setText("Permanent Address");

        tempaddress.setText("Temporaray Address");

        contactlbl.setText("Contact");

        emaillbl.setText("Email");

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addbutton)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(contactlbl)
                                                .addGap(176, 176, 176)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(peraddresslbl)
                                            .addGap(18, 18, 18)
                                            .addComponent(permanentAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tempaddress)
                                    .addComponent(emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deletebutton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(useridlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(firstNameTxt))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(middlenamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(userNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(middleNameTxt))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lastnamelbl)
                                                .addGap(18, 18, 18)
                                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(temporaryAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(191, 191, 191))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelbutton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(useridlbl)
                            .addComponent(usernamelbl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstnamelbl)
                                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(middlenamelbl))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lastnamelbl)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordlbl)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempaddress)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(peraddresslbl)
                        .addComponent(permanentAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(temporaryAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(contactlbl))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emaillbl)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbutton)
                    .addComponent(editButton)
                    .addComponent(deletebutton)
                    .addComponent(cancelbutton))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        UserDTO user = new UserDTO();
        if (editButton.getText().equalsIgnoreCase("Edit")) {
            editButton.setText("Update");
            user = new UserDAO().editUser(table);
            userIdTxt.setText(String.valueOf(user.getUserId()));
            userIdTxt.setEditable(false);
            userNameTxt.setText(user.getUserName());
            userNameTxt.setEditable(false);
            firstNameTxt.setText(user.getFirstName());
            middleNameTxt.setText(user.getMiddleName());
            lastNameTxt.setText(user.getLastName());
            permanentAddressTxt.setText(user.getPermanentAddress());
            temporaryAddressTxt.setText(user.getTemporaryAddress());
            contactTxt.setText(user.getContact());
            passwordTxt.setText("*******");
            emailTxt.setText(user.getEmail());
            passwordTxt.setEditable(false);
        } else {
            editButton.setText("Edit");
            user.setUserId(Integer.parseInt(userIdTxt.getText()));
            user.setFirstName(firstNameTxt.getText());
            user.setMiddleName(middleNameTxt.getText());
            user.setLastName(lastNameTxt.getText()); 
            user.setPermanentAddress(permanentAddressTxt.getText());
            user.setTemporaryAddress(temporaryAddressTxt.getText());
            user.setContact(contactTxt.getText());
            user.setEmail(emailTxt.getText());
            
            new UserDAO().UpdateUser(user);
            
            userIdTxt.setEditable(true);
            userNameTxt.setEditable(true);
            passwordTxt.setEditable(true);
            loadData();
            clearField();
            
            
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        UserDTO user = new UserDTO();
        user.setUserId(Integer.parseInt(userIdTxt.getText()));
        user.setUserName(userNameTxt.getText());
        user.setFirstName(firstNameTxt.getText());
        user.setMiddleName(middleNameTxt.getText());
        user.setLastName(lastNameTxt.getText());
        user.setPassword(passwordTxt.getText());
        user.setPermanentAddress(permanentAddressTxt.getText());
        user.setTemporaryAddress(temporaryAddressTxt.getText());
        user.setContact(contactTxt.getText());
        user.setEmail(emailTxt.getText());

        new UserDAO().addUser(user);


    }//GEN-LAST:event_addbuttonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
//       if(BttnValidate()){
        new UserDAO().delete(String.valueOf(table.getValueAt(table.getSelectedRow(),0)));
        loadData();
//        else{
//                JOptionPane.showMessageDialog(null,"Invalid");
//                }
        
    }//GEN-LAST:event_deletebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JLabel contactlbl;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel firstnamelbl;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel lastnamelbl;
    private javax.swing.JTextField middleNameTxt;
    private javax.swing.JLabel middlenamelbl;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel peraddresslbl;
    private javax.swing.JTextField permanentAddressTxt;
    private javax.swing.JTable table;
    private javax.swing.JLabel tempaddress;
    private javax.swing.JTextField temporaryAddressTxt;
    private javax.swing.JTextField userIdTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel useridlbl;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
private void loadData() {
        UserDAO user = new UserDAO();
        try {
            table.setModel(user.builtTableModel(user.getQueryResult()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearField() {
        userIdTxt.setText("");
        userNameTxt.setText("");
        firstNameTxt.setText("");
        middleNameTxt.setText("");
        lastNameTxt.setText("");
        passwordTxt.setText("");
        permanentAddressTxt.setText("");
        temporaryAddressTxt.setText("");
        contactTxt.setText("");
        emailTxt.setText("");
    }
}
