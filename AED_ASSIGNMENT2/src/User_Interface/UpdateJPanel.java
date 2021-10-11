/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;
import Management.UberCar;
import Management.UberCarInfo;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Date;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradyumnareddy
 */
public class UpdateJPanel extends javax.swing.JPanel {

    private JPanel UserContainer;
    private UberCarInfo Car_Info;
    private UberCar c;
    
    private Date date;
    private Timestamp timestamp;
    
    public static String Time;

    public static String getTime() {
        return Time;
    }

    public static void setTime(String Time) {
        UpdateJPanel.Time = Time;
    }
   
    public UpdateJPanel(JPanel userProcessContainer, UberCarInfo carinformationlist) {
        initComponents();
        this.UserContainer=userProcessContainer;
       this.Car_Info=carinformationlist;
       
       populateTable();
         
    }
     
    private void populateCarDetails(){
       
        int selectedrow =tblView.getSelectedRow();
        c = (UberCar) tblView.getValueAt(selectedrow, 0);
        txtYearofmanufactor.setText(String.valueOf(c.getManufactured_year()));
        txtBrand.setText(c.getBrand());
        txtCity.setText(c.getAvailble_city());
        txtMax_Seats.setText(String.valueOf(c.getMax_seats()));
        txtMin_Seats.setText(String.valueOf(c.getMin_seats()));
        txtModelNum.setText(c.getModel_num());
        txtSerialNumber.setText(String.valueOf(c.getSerial_num()));
        if(c.isAvailable()==true)
            rbYes_Availability.setSelected(true);
        
        else
            rbNo_Availability.setSelected(true);
        
        if(c.isMaintenance_certificate()==true)
            rbYes_Maintainance.setSelected(true);
        else
            rbNo_Maintainance.setSelected(true);   
         }
    
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblView.getModel(); 
        dtm.setRowCount(0);
        for (UberCar car : Car_Info.getCarList()){
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        rbNo_Availability = new javax.swing.JRadioButton();
        jLabelAvailability = new javax.swing.JLabel();
        txtYearofmanufactor = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        jLabelBrand = new javax.swing.JLabel();
        txtMax_Seats = new javax.swing.JTextField();
        jLabelYearofmanufacture = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabelMin_seats = new javax.swing.JLabel();
        txtMin_Seats = new javax.swing.JTextField();
        jLabelMax_seats = new javax.swing.JLabel();
        txtModelNum = new javax.swing.JTextField();
        jLabelSerial_no = new javax.swing.JLabel();
        rbYes_Maintainance = new javax.swing.JRadioButton();
        jLabelModel_no = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        rbNo_Maintainance = new javax.swing.JRadioButton();
        jLabelAvailable_city = new javax.swing.JLabel();
        rbYes_Availability = new javax.swing.JRadioButton();
        jLabelMaintainance_certificate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Manufacturing_Year", "Max_Seats", "Min_Seats", "Serial_Numb", "Model_Numb", "Available_City", "Availability", "Maintainance_Certificate", "Created_On"
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

        buttonGroup2.add(rbNo_Availability);
        rbNo_Availability.setText("No");
        rbNo_Availability.setEnabled(false);

        jLabelAvailability.setText("Availability");

        txtYearofmanufactor.setEnabled(false);

        txtBrand.setEnabled(false);

        jLabelBrand.setText("Brand");

        txtMax_Seats.setEnabled(false);

        jLabelYearofmanufacture.setText("Year of Manufacture");

        txtSerialNumber.setEnabled(false);

        jLabelMin_seats.setText("Min_Seats");

        txtMin_Seats.setEnabled(false);
        txtMin_Seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMin_SeatsActionPerformed(evt);
            }
        });

        jLabelMax_seats.setText("Max_Seats");

        txtModelNum.setEnabled(false);

        jLabelSerial_no.setText("Serial_No");

        buttonGroup1.add(rbYes_Maintainance);
        rbYes_Maintainance.setText("Yes");
        rbYes_Maintainance.setEnabled(false);
        rbYes_Maintainance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYes_MaintainanceActionPerformed(evt);
            }
        });

        jLabelModel_no.setText("Model_No");

        txtCity.setEnabled(false);

        buttonGroup1.add(rbNo_Maintainance);
        rbNo_Maintainance.setText("No");
        rbNo_Maintainance.setEnabled(false);

        jLabelAvailable_city.setText("Available_City");

        buttonGroup2.add(rbYes_Availability);
        rbYes_Availability.setText("Yes");
        rbYes_Availability.setEnabled(false);

        jLabelMaintainance_certificate.setText("Maintainance_Certificate");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBrand)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMin_seats)
                                    .addComponent(jLabelSerial_no)
                                    .addComponent(jLabelModel_no)
                                    .addComponent(jLabelAvailable_city)
                                    .addComponent(jLabelMaintainance_certificate)
                                    .addComponent(jLabelAvailability)
                                    .addComponent(jLabelYearofmanufacture)
                                    .addComponent(jLabelMax_seats))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtModelNum)
                                            .addComponent(txtSerialNumber)
                                            .addComponent(txtBrand)
                                            .addComponent(txtMax_Seats)
                                            .addComponent(txtYearofmanufactor)
                                            .addComponent(txtMin_Seats)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jButton1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYes_Maintainance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNo_Maintainance))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbYes_Availability)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbNo_Availability)))))
                        .addGap(191, 191, 191)
                        .addComponent(lblTime)
                        .addGap(0, 468, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1313, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(lblTime))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBrand))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelYearofmanufacture)
                                    .addComponent(txtYearofmanufactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdate)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMin_seats)
                                    .addComponent(txtMin_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelMax_seats)
                                    .addComponent(txtMax_Seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnSave)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSerial_no)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelModel_no)
                            .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAvailable_city)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMaintainance_certificate)
                            .addComponent(rbYes_Maintainance)
                            .addComponent(rbNo_Maintainance))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAvailability)
                            .addComponent(rbYes_Availability)
                            .addComponent(rbNo_Availability))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMin_SeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMin_SeatsActionPerformed
        
        
    }//GEN-LAST:event_txtMin_SeatsActionPerformed

    private void rbYes_MaintainanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYes_MaintainanceActionPerformed
        
    }//GEN-LAST:event_rbYes_MaintainanceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtBrand.setEnabled(true);
        txtCity.setEnabled(true);
        txtMax_Seats.setEnabled(true);
        txtMin_Seats.setEnabled(true);
        txtModelNum.setEnabled(true);
        txtSerialNumber.setEnabled(true);
        txtYearofmanufactor.setEnabled(true);
        rbNo_Availability.setEnabled(true);
        rbNo_Maintainance.setEnabled(true);
        rbYes_Availability.setEnabled(true);
        rbYes_Maintainance.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
         populateCarDetails();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        
        try{
            
            if(txtBrand.getText().equals("") || txtCity.getText().equals("") || txtModelNum.getText().equals(""))
        JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            
            else{
        c.setBrand(txtBrand.getText());
        c.setManufactured_year(Integer.parseInt(txtYearofmanufactor.getText()));
        c.setAvailble_city(txtCity.getText());
        c.setMax_seats(Integer.parseInt(txtMax_Seats.getText()));
        c.setMin_seats(Integer.parseInt(txtMin_Seats.getText()));
        if(rbNo_Availability.isSelected()==true)
            c.setAvailable(false);
        if(rbYes_Availability.isSelected()==true)
            c.setAvailable(true);
        if(rbNo_Maintainance.isSelected()==true)
            c.setMaintenance_certificate(false);
        if(rbYes_Maintainance.isSelected()==true)
            c.setMaintenance_certificate(true);
        c.setModel_num(txtModelNum.getText());
        c.setSerial_num(Integer.parseInt(txtSerialNumber.getText()));
        populateTable();
        JOptionPane.showMessageDialog(null,"Car Specifics Updated Successfully");
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        txtBrand.setEnabled(false);
        txtCity.setEnabled(false);
        txtMax_Seats.setEnabled(false);
        txtMin_Seats.setEnabled(false);
        txtModelNum.setEnabled(false);
        txtSerialNumber.setEnabled(false);
        txtYearofmanufactor.setEnabled(false);
        rbNo_Availability.setEnabled(false);
        rbNo_Maintainance.setEnabled(false);
        rbYes_Availability.setEnabled(false);
        rbYes_Maintainance.setEnabled(false);
        date =new Date();
        long Timme = date.getTime();
        timestamp= new Timestamp(Timme);
        Time= String.valueOf(timestamp);
        
        lblTime.setText(Time);
        
        
            }
        
        }catch(NumberFormatException c){JOptionPane.showMessageDialog(null, "Enter numeric value");}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        UserContainer.remove(this);
           CardLayout layout = (CardLayout) UserContainer.getLayout();
           layout.previous(UserContainer);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAvailability;
    private javax.swing.JLabel jLabelAvailable_city;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelMaintainance_certificate;
    private javax.swing.JLabel jLabelMax_seats;
    private javax.swing.JLabel jLabelMin_seats;
    private javax.swing.JLabel jLabelModel_no;
    private javax.swing.JLabel jLabelSerial_no;
    private javax.swing.JLabel jLabelYearofmanufacture;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rbNo_Availability;
    private javax.swing.JRadioButton rbNo_Maintainance;
    private javax.swing.JRadioButton rbYes_Availability;
    private javax.swing.JRadioButton rbYes_Maintainance;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMax_Seats;
    private javax.swing.JTextField txtMin_Seats;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearofmanufactor;
    // End of variables declaration//GEN-END:variables
}
