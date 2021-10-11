/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Management.UberCarInfo;
import javax.swing.JPanel;
import Management.UberCar;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradyumnareddy
 */
public class SearchJPanel extends javax.swing.JPanel {

   
    private JPanel User_Process;
    private UberCarInfo carinformationList;
    private ArrayList<String> brands;
     
    SearchJPanel(JPanel userProcessContainer, UberCarInfo carinformationList) {
        initComponents();
        this.User_Process=userProcessContainer;
        this.carinformationList= carinformationList;
      
        populateTable();
    
    }

    
 private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblView.getModel(); 
        dtm.setRowCount(0);
        for (UberCar car : carinformationList.getCarList()){
            Object[] row = new Object[10];
            row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
            brands= new ArrayList<>();
            brands.add(car.getBrand());
    }
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelsearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        jLabelmanufacturedate = new javax.swing.JLabel();
        jLabelenterdate = new javax.swing.JLabel();
        txtMfg_Date = new javax.swing.JTextField();
        btnMfgDate = new javax.swing.JButton();
        jLabelSerialno = new javax.swing.JLabel();
        jLabelSNO = new javax.swing.JLabel();
        txtSerial_No = new javax.swing.JTextField();
        btnSerialNumber = new javax.swing.JButton();
        jLabelBrand = new javax.swing.JLabel();
        jLabelEnterBrand = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        btnBrand = new javax.swing.JButton();
        jLabelModelno = new javax.swing.JLabel();
        jLabelEntermodelno = new javax.swing.JLabel();
        txtModel_No = new javax.swing.JTextField();
        btnModelNumber = new javax.swing.JButton();
        btnMaintainanceExpired = new javax.swing.JButton();
        jLabelAvailablebycity = new javax.swing.JLabel();
        jLabelEntercity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnCity = new javax.swing.JButton();
        txtMax_Seats = new javax.swing.JTextField();
        txtMin_Seats = new javax.swing.JTextField();
        jLabelmax_seat = new javax.swing.JLabel();
        jLabelmin_seat = new javax.swing.JLabel();
        btnMaxMin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelmin_max = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabelsearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelsearch.setText(" Search Engine");

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Manufacturing Year", "Max_Seats", "Min_Seats", "Serial_Numb", "Model_Numb", "Available_City", "Availability", "Maintainance_Certificate", "Created_On"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblView);

        jLabelmanufacturedate.setText("Search by Manufacturing Date:");

        jLabelenterdate.setText("Enter_Date");

        btnMfgDate.setText("Search");
        btnMfgDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMfgDateActionPerformed(evt);
            }
        });

        jLabelSerialno.setText("Search by Serial Number:");

        jLabelSNO.setText("Enter_SNo");

        txtSerial_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerial_NoActionPerformed(evt);
            }
        });

        btnSerialNumber.setText("Search");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        jLabelBrand.setText("Search by Brand:");

        jLabelEnterBrand.setText("Enter_Brand");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        btnBrand.setText("Search");
        btnBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandActionPerformed(evt);
            }
        });

        jLabelModelno.setText("Search by ModelNumber:");

        jLabelEntermodelno.setText("Enter_Model_No:");

        txtModel_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModel_NoActionPerformed(evt);
            }
        });

        btnModelNumber.setText("Search");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        btnMaintainanceExpired.setText("Cars with Expired Maintainance Certificate");
        btnMaintainanceExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintainanceExpiredActionPerformed(evt);
            }
        });

        jLabelAvailablebycity.setText("Search Car Availability by City");

        jLabelEntercity.setText("Enter_City:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnCity.setText("Search");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        jLabelmax_seat.setText("Max_Seats");

        jLabelmin_seat.setText("Min_Seats");

        btnMaxMin.setText("Search");
        btnMaxMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxMinActionPerformed(evt);
            }
        });

        jButton1.setText(" Manufacturers List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelmin_max.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelmin_max.setText("Search by Max and Min seats");

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBrand)
                            .addComponent(jLabelModelno)
                            .addComponent(jLabelAvailablebycity)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEntercity)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEntermodelno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtModel_No, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCity)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModelNumber)
                                        .addGap(246, 246, 246)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabelSerialno)
                            .addComponent(jLabelmanufacturedate)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSerial_No, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelenterdate)
                                            .addGap(34, 34, 34)
                                            .addComponent(txtMfg_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelSNO))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSerialNumber)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelmin_seat)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnMfgDate)
                                                .addGap(197, 197, 197)
                                                .addComponent(jLabelmax_seat)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMax_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMin_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)
                                        .addComponent(btnMaxMin))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEnterBrand)
                                .addGap(154, 154, 154)
                                .addComponent(btnBrand))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMaintainanceExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jLabelmin_max)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(252, 252, 252))
            .addGroup(layout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(jLabelsearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelmin_max)
                .addGap(2, 2, 2)
                .addComponent(jLabelmanufacturedate)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelenterdate)
                            .addComponent(txtMfg_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMfgDate)
                            .addComponent(txtMax_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelmax_seat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelmin_seat)
                            .addComponent(txtMin_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnMaxMin)))
                .addGap(8, 8, 8)
                .addComponent(jLabelSerialno)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSNO)
                    .addComponent(txtSerial_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSerialNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBrand)
                    .addComponent(btnMaintainanceExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnterBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrand)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabelModelno)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntermodelno)
                    .addComponent(txtModel_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModelNumber)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jLabelAvailablebycity)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntercity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCity))
                .addGap(295, 295, 295))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMfgDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMfgDateActionPerformed
      
      
        try{
        int manufactured_year = (Integer.parseInt(txtMfg_Date.getText()));
        ArrayList<UberCar> result = carinformationList.getMfgList(manufactured_year);
        
        
        if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Year");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
            row[0]= car;
            row[1]= car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]= car.getSerial_num();
            row[5]= car.getModel_num();
            row[6]= car.getAvailble_city();
            row[7]= car.isAvailable();
            row[8]= car.isMaintenance_certificate();
            row[9]= car.getCreatedOn();
            dtm.addRow(row);
     }
    }//GEN-LAST:event_btnMfgDateActionPerformed
        }catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid Year");
        }
        }
        
        
        
    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed
       
        
        try{
        int serial_num = (Integer.parseInt(txtSerial_No.getText()));
        ArrayList<UberCar> result = carinformationList.getSerialList(serial_num);
        if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Serial Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
             row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    }             
        }catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Invalid Serial Number");}  
    }//GEN-LAST:event_btnSerialNumberActionPerformed

    private void txtSerial_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerial_NoActionPerformed

    }//GEN-LAST:event_txtSerial_NoActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
       
    }//GEN-LAST:event_txtBrandActionPerformed

    private void btnBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandActionPerformed
        
        String brand = txtBrand.getText();
        ArrayList<UberCar> result = carinformationList.getBrandList(brand);
        
        if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Brand");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    }             
    }//GEN-LAST:event_btnBrandActionPerformed

    private void txtModel_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModel_NoActionPerformed
        
    }//GEN-LAST:event_txtModel_NoActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        
        String model_num = txtModel_No.getText();
        ArrayList<UberCar> result = carinformationList.getModelList(model_num);
        
          if (result.equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    } 
    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void btnMaintainanceExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintainanceExpiredActionPerformed
        
         ArrayList<UberCar> result = carinformationList.getMaintainanceCertificate();
        
          if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    } 
        
    }//GEN-LAST:event_btnMaintainanceExpiredActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        
         String availble_city = txtCity.getText();
        ArrayList<UberCar> result = carinformationList.getAvailableCarsbyCity(availble_city);
        
          if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
     }
    } 
        
        
    }//GEN-LAST:event_btnCityActionPerformed

    private void btnMaxMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxMinActionPerformed
        
        try{
        
        int max_seats = (Integer.parseInt(txtMax_Seats.getText()));
        int min_seats = (Integer.parseInt(txtMin_Seats.getText()));
        ArrayList<UberCar> result = carinformationList.getMaxMinList(max_seats, min_seats);
        
        
            if (result==null){
            JOptionPane.showMessageDialog(null, "Invalid Model Number");
        }
        else {
      DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for(UberCar car : result){
           Object[] row = new Object[10];
           row[0] = car;
            row[1] = car.getManufactured_year();
            row[2]= car.getMax_seats();
            row[3]= car.getMin_seats();
            row[4]=car.getSerial_num();
            row[5]=car.getModel_num();
            row[6]=car.getAvailble_city();
            row[7]=car.isAvailable();
            row[8]=car.isMaintenance_certificate();
            row[9]=car.getCreatedOn();
            dtm.addRow(row);
            
            
     }
            }     
        }catch(NumberFormatException c){JOptionPane.showMessageDialog(null, "Invalid entry");} 
    }//GEN-LAST:event_btnMaxMinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        ArrayList<String> car = carinformationList.getAllBrands();
        Set<String> setString = new HashSet<String>(car);
        ArrayList<String> finalList = new ArrayList<>(setString);
        
        
        DefaultTableModel dtm = (DefaultTableModel) tblView.getModel();
       dtm.setRowCount(0);
       for (String c : finalList)
       {
       Object[] row = new Object [10];
       row[0]=c;
       dtm.addRow(row);
       
       }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        User_Process.remove(this);
           CardLayout layout = (CardLayout) User_Process.getLayout();
           layout.previous(User_Process);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnMaintainanceExpired;
    private javax.swing.JButton btnMaxMin;
    private javax.swing.JButton btnMfgDate;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelAvailablebycity;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelEnterBrand;
    private javax.swing.JLabel jLabelEntercity;
    private javax.swing.JLabel jLabelEntermodelno;
    private javax.swing.JLabel jLabelModelno;
    private javax.swing.JLabel jLabelSNO;
    private javax.swing.JLabel jLabelSerialno;
    private javax.swing.JLabel jLabelenterdate;
    private javax.swing.JLabel jLabelmanufacturedate;
    private javax.swing.JLabel jLabelmax_seat;
    private javax.swing.JLabel jLabelmin_max;
    private javax.swing.JLabel jLabelmin_seat;
    private javax.swing.JLabel jLabelsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMax_Seats;
    private javax.swing.JTextField txtMfg_Date;
    private javax.swing.JTextField txtMin_Seats;
    private javax.swing.JTextField txtModel_No;
    private javax.swing.JTextField txtSerial_No;
    // End of variables declaration//GEN-END:variables
}
