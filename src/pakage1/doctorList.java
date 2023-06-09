/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

import config.dbconfig;
import java.awt.Component;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import static pakage1.patientList.patienttable;

/**
 *
 * @author HP
 */
public class doctorList extends javax.swing.JFrame {

    /**
     * Creates new form newTable
     */
    public doctorList() {
        initComponents();
         displayData();
         doctable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         TableColumnModel columnModel =  doctable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
    }
        public void displayData(){
       
        try{
       
            dbconfig dbc = new dbconfig();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_doctor");
            doctable.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel)doctable.getModel();
            String[] columnIdentifiers = {"ID", "LastName", "FirstName", "MiddleName", "Gender", "Status", ""
                  +  "Address", "Contact","Email" };
             model.setColumnIdentifiers(columnIdentifiers);
             rs.close();
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);    
        } 
    }
        public void reset(){
        id.setText("");
        lastname.setText("");
        firstname.setText("");
        middle.setText("");
        gender.clearSelection();
        status.setSelectedIndex(1);
        address.setText("");
        contact.setText("");
        email.setText("");
        
        
        
     
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        status = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        arrows = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middle = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctable = new javax.swing.JTable();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Engaged", "Married", "Widow" }));
        jPanel1.add(status);
        status.setBounds(540, 330, 290, 30);

        jPanel2.setBackground(new java.awt.Color(183, 30, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("__");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 30));

        arrows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/arrow2.png"))); // NOI18N
        arrows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowsMouseClicked(evt);
            }
        });
        jPanel2.add(arrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 34, 31));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DOCTOR APPOINTMENT LIST");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 50));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 880, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCTOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 60, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 490, 60, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 330, 120, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Lastname:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 370, 120, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Firstname:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 410, 120, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Middle:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 450, 120, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 490, 80, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Status:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 330, 60, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 370, 60, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Contact:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(480, 450, 60, 30);

        id.setEditable(false);
        id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(id);
        id.setBounds(130, 330, 290, 30);

        lastname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lastname);
        lastname.setBounds(130, 370, 290, 30);

        firstname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(firstname);
        firstname.setBounds(130, 410, 290, 30);

        middle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(middle);
        middle.setBounds(130, 450, 290, 30);

        contact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(contact);
        contact.setBounds(540, 450, 290, 30);

        email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(email);
        email.setBounds(540, 490, 290, 30);

        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(183, 30, 30));
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print);
        print.setBounds(80, 290, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 60, 110, 30);
        jPanel1.add(text);
        text.setBounds(360, 60, 230, 30);

        male.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(male);
        male.setText("Male");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, male, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), male, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jPanel1.add(male);
        male.setBounds(130, 490, 80, 30);

        female.setBackground(new java.awt.Color(255, 255, 255));
        gender.add(female);
        female.setText("Female");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, female, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), female, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        jPanel1.add(female);
        female.setBounds(220, 490, 100, 30);

        doctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(doctable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 100, 860, 170);

        insert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(183, 30, 30));
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert);
        insert.setBounds(230, 290, 110, 30);

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(183, 30, 30));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(380, 290, 110, 30);

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(183, 30, 30));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(680, 290, 110, 30);

        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(183, 30, 30));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(530, 290, 110, 30);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(540, 370, 290, 80);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(740, 60, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        reset();
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = doctable.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = doctable.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure to delete ID: " +id+" ?");
                    if(a==JOptionPane.YES_OPTION){  
                            dbconfig dbc = new dbconfig();
                               int r_id = Integer.parseInt(id);
                dbc.deleteData(Integer.parseInt(id));
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          try{ 
        int rowIndex = doctable.getSelectedRow();
            if(rowIndex < 0){
                JOptionPane.showMessageDialog(null, "Please Select an Item!");
            }else{
        
        dbconfig dbc = new dbconfig();
        int num = dbc.updateData("UPDATE tbl_doctor "
                + "SET d_lastname = '"+lastname.getText()+"', d_firstname='"+firstname.getText()+"', "
                        + "d_middle ='"+middle.getText()+"', d_gender='"+gender.getSelection().getActionCommand()+"',d_status='"+status.getSelectedItem().toString()+ "',d_address='"+address.getText()+ "',d_contact='"+contact.getText()+ "',d_email='"+email.getText()+"'"                              
                                + "WHERE d_id = '"+id.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }}
          }catch(Exception e){}
    }//GEN-LAST:event_updateActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
      
        if (lastname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Lastname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(firstname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Firstname", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if (middle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Middle Name!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(gender.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please type your Gender!", "Error", JOptionPane.ERROR_MESSAGE);
            return;      
        }else if(status.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Status!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(address.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Address!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(contact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Contact No!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        dbconfig dbc = new dbconfig();
        dbc.insertData("INSERT INTO tbl_doctor (d_lastname, d_firstname, d_middle, d_gender, d_status, d_address, d_contact, d_email)"
                + "VALUES ('"+lastname.getText()+"', '"+firstname.getText()+"','"+middle.getText()+"','"+gender.getSelection().getActionCommand()+"','"+status.getSelectedItem().toString()+"','"+address.getText()+"','"+contact.getText()+"','"+email.getText()+"')");
        
        displayData();
        reset();
    }//GEN-LAST:event_insertActionPerformed

    private void doctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctableMouseClicked
        int rowIndex = doctable.getSelectedRow();
        if(rowIndex < 0){
            
        }else{
            TableModel model = doctable.getModel();
            id.setText(""+model.getValueAt(rowIndex,0));
            lastname.setText(""+model.getValueAt(rowIndex,1));
            firstname.setText(""+model.getValueAt(rowIndex,2));
            middle.setText(""+model.getValueAt(rowIndex,3));
              String rb = model.getValueAt(rowIndex, 4).toString();
                        switch(rb){
                            case "Male":
                                male.setSelected(true);
                                break;
                            default:
                                female.setSelected(true);
                                break;
                        }
            String cb = model.getValueAt(rowIndex, 5).toString();
                        if(cb.equals("Single")){
                           status.setSelectedIndex(0);
                        }else if(cb.equals("Engaged")){
                           status.setSelectedIndex(1);
                        }
                        else if(cb.equals("Married")){
                          status.setSelectedIndex(2);
                        }else{
                           status.setSelectedIndex(3);
                        }
            address.setText(""+model.getValueAt(rowIndex,6));
            contact.setText(""+model.getValueAt(rowIndex,7));
            email.setText(""+model.getValueAt(rowIndex,8));
           
        }
        
    }//GEN-LAST:event_doctableMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void arrowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowsMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrowsMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
          printPage1 pp = new printPage1();
int selectedRow = doctable.getSelectedRow();

    if (selectedRow != -1) {
        try {
            DefaultTableModel model = (DefaultTableModel) doctable.getModel();
            int columnCount = model.getColumnCount();
            StringBuilder rowData = new StringBuilder();

            // Append data for selected row
            String[] columnHeaders = {"ID", "Last Name", "First Name", "Middle Name", "Gender", "Status", ""
                    + "Address", "Contact","Email" };
            String[] rowDataValues = new String[columnCount];

            for (int column = 0; column < columnCount; column++) {
                rowDataValues[column] = model.getValueAt(selectedRow, column).toString();
            }

            String header = "            \t\tMEDICAL APPOINTMENT\n\n";

            String details = "Doctor Details:\n\n\n";
            rowData.append(header);
            rowData.append(details);

            for (int i = 0; i < columnHeaders.length; i++) {
                rowData.append(columnHeaders[i]).append(": ").append(rowDataValues[i]).append("\n");
                rowData.append("\n"); // Add spacing after each detail
            }
            pp.setVisible(true);
            pp.area1.setText(rowData.toString());

            // Center align the text in the JTextArea
            pp.area1.setAlignmentX(Component.CENTER_ALIGNMENT);
            pp.area1.setAlignmentY(Component.CENTER_ALIGNMENT);

            // Set the font style and size
            Font font = new Font("Times New Roman", Font.PLAIN, 13);
            pp.area1.setFont(font);
            this.dispose();
            // Print the JTextArea content
           // pp.area1.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "No row selected.");
    }
    
    }//GEN-LAST:event_printActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)doctable .getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        doctable.setRowSorter(tr);

        String selectedMajor = text.getText().trim();
        tr.setRowFilter(RowFilter.regexFilter(selectedMajor));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        text.setText("");
        DefaultTableModel model = (DefaultTableModel)doctable .getModel();
        TableRowSorter<DefaultTableModel> tr = (TableRowSorter<DefaultTableModel>) doctable.getRowSorter();

        if (tr != null && tr.getRowFilter() != null) {
            tr.setRowFilter(null); // Remove the existing row filter
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(doctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctorList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctorList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel arrows;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTable doctable;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField middle;
    private javax.swing.JButton print;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField text;
    private javax.swing.JButton update;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
