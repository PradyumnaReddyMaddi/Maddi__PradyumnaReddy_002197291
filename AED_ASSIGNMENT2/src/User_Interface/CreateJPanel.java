/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Management.UberCar;
import Management.UberCarInfo;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pradyumnareddy
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
   private JPanel UserContainer;
   private UberCarInfo Car_Info;

    CreateJPanel(JPanel userProcessContainer, UberCarInfo carinformationlist) {
       initComponents();
       this.UserContainer=userProcessContainer;
       this.Car_Info=carinformationlist;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreateCar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtYearofmanufacture = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtMax_Seats = new javax.swing.JTextField();
        txtSerial_No = new javax.swing.JTextField();
        txtMin_Seats = new javax.swing.JTextField();
        txtModel_No = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        rbYes_Maintainance = new javax.swing.JRadioButton();
        rbNo_Maintainance = new javax.swing.JRadioButton();
        rbYes_Availability = new javax.swing.JRadioButton();
        rbNo_Availability = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("DATA OF CAR");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCreateCar.setText("Create");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        jLabel2.setText("Brand");

        jLabel3.setText("Year_of_Manufacture");

        jLabel4.setText("Minimum_Seats");

        jLabel5.setText("Maximum_Seats");

        jLabel6.setText("Model_Number");

        jLabel7.setText("Serial_Number");

        jLabel8.setText("Available_City");

        jLabel9.setText("Maintainance_Certificate");

        jLabel10.setText("Availability");

        txtMax_Seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMax_SeatsActionPerformed(evt);
            }
        });

        txtMin_Seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMin_SeatsActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbYes_Maintainance);
        rbYes_Maintainance.setText("Yes");
        rbYes_Maintainance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYes_MaintainanceActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbNo_Maintainance);
        rbNo_Maintainance.setText("No");

        buttonGroup1.add(rbYes_Availability);
        rbYes_Availability.setText("Yes");

        buttonGroup1.add(rbNo_Availability);
        rbNo_Availability.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10)
                                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtModel_No, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtSerial_No, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtMax_Seats, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtYearofmanufacture)
                                        .addComponent(txtMin_Seats, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYes_Maintainance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNo_Maintainance))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYes_Availability)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNo_Availability))
                                    .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYearofmanufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMin_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMax_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSerial_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtModel_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rbYes_Maintainance)
                    .addComponent(rbNo_Maintainance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbYes_Availability)
                    .addComponent(rbNo_Availability))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCar)
                    .addComponent(btnBack))
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           UserContainer.remove(this);
           CardLayout layout = (CardLayout) UserContainer.getLayout();
           layout.previous(UserContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        String brand ="";
        String model_num="";
        String available_city="";
        
            
            if(txtBrand.getText().equals("") || txtModel_No.getText().equals("") || txtCity.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty");
            
            }
            else{
                 brand = txtBrand.getText();
                 model_num = txtModel_No.getText();
                 available_city=txtCity.getText();
            }
        try{    
        int manufactured_year = (Integer.parseInt(txtYearofmanufacture.getText()));
        int min_seats = Integer.parseInt(txtMin_Seats.getText());
        int max_seats = Integer.parseInt(txtMax_Seats.getText());
        int serial_num = Integer.parseInt(txtSerial_No.getText());
        
       if(buttonGroup2.getSelection()==null || buttonGroup1.getSelection()==null)
       { 
        JOptionPane.showMessageDialog(null, "Fields cannot be empty");
       }
       else {
        UberCar car = Car_Info.addCar();
        car.setBrand(brand);
        car.setManufactured_year(manufactured_year);
        car.setMax_seats(max_seats);
        car.setMin_seats(min_seats);
        car.setSerial_num(serial_num);
        car.setModel_num(model_num);
        car.setAvailble_city(available_city);
        
         if(rbYes_Availability.isSelected()){
            car.setAvailable(true);
        }else if(rbNo_Availability.isSelected()){
            car.setAvailable(false);
                }
         
         if(rbYes_Maintainance.isSelected()){
            car.setMaintenance_certificate(true);
        }else if(rbNo_Maintainance.isSelected()){
            car.setMaintenance_certificate(false);
        }
        JOptionPane.showMessageDialog(null, "Car Added Successfully");
        
        
        txtBrand.setText("");
        txtCity.setText("");
        txtMax_Seats.setText("");
        txtMin_Seats.setText("");
        txtModel_No.setText("");
        txtSerial_No.setText("");
        txtYearofmanufacture.setText("");
        }
        }catch(NumberFormatException c){ JOptionPane.showMessageDialog(null, "Enter Numeric value");}
        
        
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void txtMin_SeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMin_SeatsActionPerformed
        
    }//GEN-LAST:event_txtMin_SeatsActionPerformed

    private void rbYes_MaintainanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYes_MaintainanceActionPerformed
        
    }//GEN-LAST:event_rbYes_MaintainanceActionPerformed

    private void txtMax_SeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMax_SeatsActionPerformed
        
    }//GEN-LAST:event_txtMax_SeatsActionPerformed

    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbNo_Availability;
    private javax.swing.JRadioButton rbNo_Maintainance;
    private javax.swing.JRadioButton rbYes_Availability;
    private javax.swing.JRadioButton rbYes_Maintainance;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMax_Seats;
    private javax.swing.JTextField txtMin_Seats;
    private javax.swing.JTextField txtModel_No;
    private javax.swing.JTextField txtSerial_No;
    private javax.swing.JTextField txtYearofmanufacture;
    // End of variables declaration//GEN-END:variables
}
