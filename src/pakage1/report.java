/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

import config.dbconfig;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;
import static pakage1.patientList.patienttable;
/**
 *
 * @author SCC-PC19
 */
public class report extends javax.swing.JFrame {

    /**
     * Creates new form report
     */
    public report() {
        initComponents();
       
        displayData1();
        reptable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         TableColumnModel columnModel =  reptable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        ImageIcon icon2= new ImageIcon(getClass().getResource("arrow2.png"));
         Image img2= icon2.getImage().getScaledInstance(arrows1.getWidth(), arrows1.getHeight(), Image.SCALE_SMOOTH);
         arrows1.setIcon(new ImageIcon(img2)); 
        
    }

    
     public void displayData(){
       
        try{
       
            dbconfig dbc = new dbconfig();
            ResultSet rs = dbc.getData("SELECT tbl_doctor.d_id,tbl_doctor.d_lastname,tbl_doctor.d_firstname,"
                    + "tbl_doctor.d_contact,tbl_patient.p_id,tbl_patient.p_lastname,tbl_patient.p_firstname,"
                    + "tbl_patient.p_contact,tbl_patient.p_date,tbl_patient.p_time,tbl_patient.p_remark "
                    + "FROM tbl_appointment LEFT JOIN tbl_doctor ON tbl_appointment.d_id = tbl_doctor.d_id "
                    + "LEFT JOIN tbl_patient ON tbl_appointment.p_id = tbl_patient.p_id");
            reptable.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
       public void displayData1(){
       
        try{
       
            dbconfig dbc = new dbconfig();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_patient");
            reptable.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel)reptable.getModel();
            
              String[] columnIdentifiers = {"ID", "LastName", "FirstName", "MiddleName", "Gender", "Status", ""
                    + "Email", "Address", "Contact","Date", "Time","Remarks" };
             model.setColumnIdentifiers(columnIdentifiers);
             rs.close();
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);    
        } 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Print = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        arrows1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        report_table = new javax.swing.JScrollPane();
        reptable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(null);

        Print.setBackground(new java.awt.Color(255, 255, 255));
        Print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Print.setForeground(new java.awt.Color(204, 0, 0));
        Print.setText("PRINT");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel2.add(Print);
        Print.setBounds(400, 500, 100, 50);

        Refresh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Refresh.setForeground(new java.awt.Color(204, 0, 0));
        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel2.add(Refresh);
        Refresh.setBounds(250, 500, 130, 50);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        arrows1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/arrow2.png"))); // NOI18N
        arrows1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrows1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("__");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        report.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("REPORTS FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(arrows1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrows1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 530, 60);

        reptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reptableMouseClicked(evt);
            }
        });
        report_table.setViewportView(reptable);

        jPanel2.add(report_table);
        report_table.setBounds(10, 80, 510, 190);

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 510, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        try {
            area1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_PrintActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
    displayData();
    
    
    
// TODO add your handling code here:
    }//GEN-LAST:event_RefreshActionPerformed

    private void arrows1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrows1MouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrows1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void reptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reptableMouseClicked
         int selectedRow = reptable.getSelectedRow();

    if (selectedRow != -1) {
        try {
            DefaultTableModel model = (DefaultTableModel) reptable.getModel();
            int columnCount = model.getColumnCount();
            StringBuilder rowData = new StringBuilder();

            // Append data for selected row
             String[] columnHeaders = {"DocID", "D.LastName", "D.FirstName", "D.Contact", "PatientID", "P.LastName", ""
                  +  "P.FirstName", "P.Contact","P.Date", "P.Time", "P.Remarks" };
            String[] rowDataValues = new String[columnCount];

            for (int column = 0; column < columnCount; column++) {
                rowDataValues[column] = model.getValueAt(selectedRow, column).toString();
            }

            String header = "            \t\tMEDICAL APPOINTMENT\n\n";

            String details = "Appointment Details:\n\n\n";
            rowData.append(header);
            rowData.append(details);

            for (int i = 0; i < columnHeaders.length; i++) {
                rowData.append(columnHeaders[i]).append(": ").append(rowDataValues[i]).append("\n");
                rowData.append("\n"); // Add spacing after each detail
            }
          
            area1.setText(rowData.toString());

            // Center align the text in the JTextArea
            area1.setAlignmentX(Component.CENTER_ALIGNMENT);
            area1.setAlignmentY(Component.CENTER_ALIGNMENT);

            // Set the font style and size
            Font font = new Font("Times New Roman", Font.PLAIN, 13);
            area1.setFont(font);
           
            // Print the JTextArea content
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No row selected.");
    }
    }//GEN-LAST:event_reptableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Print;
    private javax.swing.JButton Refresh;
    private javax.swing.JTextArea area1;
    private javax.swing.JLabel arrows1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel report;
    private javax.swing.JScrollPane report_table;
    public static javax.swing.JTable reptable;
    // End of variables declaration//GEN-END:variables
}
