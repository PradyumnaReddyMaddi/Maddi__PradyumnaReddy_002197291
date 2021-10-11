/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_Interface;

import Management.UberCar;
import Management.UberCarInfo;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradyumnareddy
 */
public class ViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJpanel
     */
    private JPanel User_Container;
    private UberCarInfo Car_Info;
    private int manufactured_year;
    //private ArrayList<Car> totalavailable;
    
    ViewJpanel(JPanel userProcessContainer, UberCarInfo carinformationlist) {
        initComponents();
        lbltimestamp.setText(UpdateJPanel.Time);
        this.User_Container=userProcessContainer;
        this.Car_Info=carinformationlist;
       
       populateTable();   
       
       Total_Available();
      
    }
    
    
    private void Total_Available(){
        ArrayList<UberCar> totalavailable = new ArrayList<>();
        totalavailable = Car_Info.getTotalAvailable();
        
        
        ArrayList<UberCar> totalUnavailable = new ArrayList<>();
        totalUnavailable = Car_Info.getTotalUnAvailable();
        int total = totalavailable.size();
        
        String S = Integer.toString(total);
        
        int totalN = totalUnavailable.size();
        
        String SS = Integer.toString(totalN);
     
       txtAvailable_Total.setText(S);
       txtUnvailable_Total.setText(SS);
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

        maintBtnGrp = new javax.swing.ButtonGroup();
        avaiBtnGrp = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtAvailable_Total = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtUnvailable_Total = new javax.swing.JTextField();
        btnFirstAvailable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbltimestamp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("VIEW CARS");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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
        if (tblView.getColumnModel().getColumnCount() > 0) {
            tblView.getColumnModel().getColumn(1).setResizable(false);
            tblView.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel12.setText("Functionalities:");

        btnSearch.setText("Custom_Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel13.setText("Number of Available cars");

        txtAvailable_Total.setEnabled(false);
        txtAvailable_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailable_TotalActionPerformed(evt);
            }
        });

        jLabel14.setText("Number of Unavailable cars");

        txtUnvailable_Total.setEnabled(false);
        txtUnvailable_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnvailable_TotalActionPerformed(evt);
            }
        });

        btnFirstAvailable.setText("First_Available_Car");
        btnFirstAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Updated On:");

        lbltimestamp.setText("  ");

        jButton1.setText("Refresh Table");
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
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtAvailable_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtUnvailable_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltimestamp, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(424, 424, 424)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFirstAvailable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(251, 251, 251)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAvailable_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtUnvailable_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(jLabel3)
                        .addComponent(lbltimestamp)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnFirstAvailable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addGap(121, 121, 121))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
           User_Container.remove(this);
           CardLayout layout = (CardLayout) User_Container.getLayout();
           layout.previous(User_Container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       SearchJPanel panel = new SearchJPanel(User_Container,Car_Info);
       User_Container.add("SearchJPanel", panel);
        CardLayout layout = (CardLayout) User_Container.getLayout();
        layout.next(User_Container);
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRow = tblView.getSelectedRow();
        if(selectedRow>=0){
         int dialogButton = JOptionPane.YES_NO_OPTION;
            int selectedDialog = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if (selectedDialog == JOptionPane.YES_OPTION){
                UberCar car = (UberCar) tblView.getValueAt(selectedRow, 0);
                Car_Info.deleteCar(car);
                populateTable();
                
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAvailable_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailable_TotalActionPerformed

    }//GEN-LAST:event_txtAvailable_TotalActionPerformed

    private void txtUnvailable_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnvailable_TotalActionPerformed
        
    }//GEN-LAST:event_txtUnvailable_TotalActionPerformed

    private void btnFirstAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableActionPerformed
     
        
        ArrayList<UberCar> result = Car_Info.getFirstAvailable();
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
        
        
    }//GEN-LAST:event_btnFirstAvailableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup avaiBtnGrp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirstAvailable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltimestamp;
    private javax.swing.ButtonGroup maintBtnGrp;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAvailable_Total;
    private javax.swing.JTextField txtUnvailable_Total;
    // End of variables declaration//GEN-END:variables
}
