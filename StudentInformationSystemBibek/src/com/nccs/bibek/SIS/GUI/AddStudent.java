/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nccs.bibek.SIS.GUI;

import com.nccs.bibek.SIS.DAO.StudentDAO;

import com.nccs.bibek.SIS.DTO.StudentDTO;
import javax.swing.ButtonGroup;

/**
 *
 * @author Punam
 */
public class AddStudent extends javax.swing.JPanel {

    ButtonGroup grp;
    String gender;
    String semester;

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
        grp = new ButtonGroup();
        grp.add(maleRadio);
        grp.add(femaleRadio);
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

        studentidlbl = new javax.swing.JLabel();
        studentIdText = new javax.swing.JTextField();
        firstnamelbl = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        middlenamelbl = new javax.swing.JLabel();
        middleNameText = new javax.swing.JTextField();
        lastnamelbl = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        genderlbl = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        peraddresslbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        permanentAddressText = new javax.swing.JTextField();
        tempaddresslbl = new javax.swing.JLabel();
        temporaryAddressText = new javax.swing.JTextField();
        emaillbl = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        mobilelbl = new javax.swing.JLabel();
        mobileText = new javax.swing.JTextField();
        programlbl = new javax.swing.JLabel();
        programText = new javax.swing.JTextField();
        semesterlbl = new javax.swing.JLabel();
        semesterCombo = new javax.swing.JComboBox<>();
        sectionlbl = new javax.swing.JLabel();
        sectionText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        scrollpane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        studentidlbl.setText("StudentID");

        firstnamelbl.setText("FirstName");

        middlenamelbl.setText("MiddleName");

        lastnamelbl.setText("LastName");

        genderlbl.setText("Gender");

        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setText("Female");
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        peraddresslbl.setText("PermanentAddress");

        tempaddresslbl.setText("TempraryAddress");

        emaillbl.setText("Email");

        mobilelbl.setText("Mobile");

        programlbl.setText("Program");

        semesterlbl.setText("Semester");

        semesterCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","First","Second","Third","Fourth","Fifth","Sixth","Sevent","Eighth" }));
        semesterCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboActionPerformed(evt);
            }
        });

        sectionlbl.setText("Section");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");

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
        scrollpane.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(firstnamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(studentidlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                    .addComponent(genderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(middlenamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(peraddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addComponent(emaillbl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(programText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                        .addComponent(permanentAddressText, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tempaddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(mobilelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(semesterlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(editButton)
                                                    .addGap(39, 39, 39)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(addButton)
                                                .addGap(157, 157, 157)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(mobileText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(temporaryAddressText, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sectionlbl)
                                                    .addComponent(lastnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(deleteButton)
                                                .addGap(45, 45, 45)
                                                .addComponent(clearButton))))))
                            .addComponent(programlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(sectionText))
                            .addComponent(cancelButton))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentidlbl)
                    .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelbl)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middlenamelbl)
                    .addComponent(middleNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnamelbl)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlbl)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peraddresslbl)
                    .addComponent(jLabel7)
                    .addComponent(permanentAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempaddresslbl)
                    .addComponent(temporaryAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilelbl)
                    .addComponent(mobileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(programlbl)
                    .addComponent(programText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterlbl)
                    .addComponent(semesterCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectionlbl)
                    .addComponent(sectionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton)
                    .addComponent(cancelButton))
                .addGap(18, 18, 18)
                .addComponent(scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        gender = "male";
    }//GEN-LAST:event_maleRadioActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed
        gender = "female";
    }//GEN-LAST:event_femaleRadioActionPerformed

    private void semesterComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboActionPerformed
        semester = semesterCombo.getSelectedItem().toString();
    }//GEN-LAST:event_semesterComboActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        StudentDTO student = new StudentDTO();
        student.setStidId(Integer.parseInt(studentIdText.getText()));
        student.setFirstName(firstNameText.getText());
        student.setMiddleName(middleNameText.getText());
        student.setLastName(lastNameText.getText());
        student.setGender(gender);
        student.setPerAddress(permanentAddressText.getText());
        student.setTempAddress(temporaryAddressText.getText());
        student.setEmail(emailText.getText());
        student.setMobile(mobileText.getText());
        student.setProgram(programText.getText());
        student.setSemester(semester);
        student.setSection(sectionText.getText());

        new StudentDAO().addStudent(student);
        loadData();

    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        StudentDTO student = new StudentDTO();
        if (editButton.getText().equalsIgnoreCase("Edit")) {
            editButton.setText("Update");
            student = new StudentDAO().editStudent(table);
            studentIdText.setText(String.valueOf(student.getStidId()));
            studentIdText.setEditable(false);
            firstNameText.setText(student.getFirstName());
            middleNameText.setText(student.getMiddleName());
            lastNameText.setText(student.getLastName());
            permanentAddressText.setText(student.getPerAddress());
            temporaryAddressText.setText(student.getTempAddress());
            emailText.setText(student.getEmail());
            mobileText.setText(student.getMobile());
            programText.setText(student.getProgram());
            sectionText.setText(student.getSection());
            if (student.getGender().equalsIgnoreCase("Male")) {
                maleRadio.setSelected(true);

            } else {
                femaleRadio.setSelected(true);
            }
        } else {
            editButton.setText("Edit");
            student.setStidId(Integer.parseInt(studentIdText.getText()));
            student.setFirstName(firstNameText.getText());
            student.setMiddleName(middleNameText.getText());
            student.setLastName(lastNameText.getText());
            student.setPerAddress(permanentAddressText.getText());
            student.setTempAddress(temporaryAddressText.getText());
            student.setEmail(emailText.getText());
            student.setMobile(mobileText.getText());
            student.setProgram(programText.getText());
            student.setSection(sectionText.getText());
            if(maleRadio.isSelected()){
                gender="male";
            }else{
                gender="female";
            }
            student.setGender(gender);
            semester = semesterCombo.getSelectedItem().toString();
            student.setSemester(semester);
            
            
        
        
            

            new StudentDAO().UpdateStudent(student);
            studentIdText.setEditable(true);
            loadData();
            clearField();

        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        new StudentDAO().delete(String.valueOf(table.getValueAt(table.getSelectedRow(),0)));
        loadData();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearField();
    }//GEN-LAST:event_clearButtonActionPerformed
    private void loadData() {
        StudentDAO user = new StudentDAO();
        try {
            table.setModel(user.builtTableModel(user.getQueryResult()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearField() {
        studentIdText.setText("");
        firstNameText.setText("");
        middleNameText.setText("");
        lastNameText.setText("");
        permanentAddressText.setText("");
        temporaryAddressText.setText("");
        emailText.setText("");
        programText.setText("");
        sectionText.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel firstnamelbl;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel lastnamelbl;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField middleNameText;
    private javax.swing.JLabel middlenamelbl;
    private javax.swing.JTextField mobileText;
    private javax.swing.JLabel mobilelbl;
    private javax.swing.JLabel peraddresslbl;
    private javax.swing.JTextField permanentAddressText;
    private javax.swing.JTextField programText;
    private javax.swing.JLabel programlbl;
    private javax.swing.JScrollPane scrollpane;
    private javax.swing.JTextField sectionText;
    private javax.swing.JLabel sectionlbl;
    private javax.swing.JComboBox<String> semesterCombo;
    private javax.swing.JLabel semesterlbl;
    private javax.swing.JTextField studentIdText;
    private javax.swing.JLabel studentidlbl;
    private javax.swing.JTable table;
    private javax.swing.JLabel tempaddresslbl;
    private javax.swing.JTextField temporaryAddressText;
    // End of variables declaration//GEN-END:variables
}