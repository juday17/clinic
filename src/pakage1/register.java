package pakage1;

import config.login_db;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pakage1.loginForm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }
    public static String link = " ";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        register = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        arrows = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(183, 30, 30));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/logo3.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 100, 100);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLINIC APPOINTMENT SYSTEM");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 60, 380, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Register as:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 450, 170, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lastname:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 290, 170, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 330, 170, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone No.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 370, 170, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 410, 170, 40);

        firstname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(firstname);
        firstname.setBounds(300, 250, 450, 30);

        lastname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(lastname);
        lastname.setBounds(300, 290, 450, 30);

        username.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(username);
        username.setBounds(300, 330, 450, 30);

        jPanel2.setBackground(new java.awt.Color(183, 30, 30));
        jPanel2.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/logo3.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(180, 40, 100, 100);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTER");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 10, 140, 32);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Re-type Password:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 390, 190, 40);

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CLINIC APPOINTMENT SYSTEM");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(300, 80, 212, 19);

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Firstname:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(40, 190, 190, 30);

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lastname:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(40, 229, 190, 30);

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 270, 190, 40);

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Phone No.");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(40, 310, 190, 40);

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Password:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 350, 190, 40);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(230, 310, 310, 30);
        jPanel2.add(jTextField6);
        jTextField6.setBounds(230, 190, 310, 30);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(230, 230, 310, 30);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(230, 270, 310, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        no.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(no);
        no.setBounds(300, 370, 450, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 540, 130, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Firstname:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(130, 250, 170, 30);

        register.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretary", "Doctor" }));
        jPanel1.add(register);
        register.setBounds(300, 450, 450, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(300, 410, 450, 30);

        arrows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/arrow2.png"))); // NOI18N
        arrows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowsMouseClicked(evt);
            }
        });
        jPanel1.add(arrows);
        arrows.setBounds(20, 10, 50, 50);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("__");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(790, 10, 40, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("X");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(820, 10, 50, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD PHOTO");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(130, 120, 150, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection conn;
        
        if (firstname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Firstname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (lastname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Lastname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Username!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (no.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Contact!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (password.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Password!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String fname = firstname.getText();
        String lname = lastname.getText();
        String uname = username.getText();
        String cont = no.getText();
        String pass = String.valueOf(password.getPassword());
        String hashedpassword = BCrypt.hashpw(pass, BCrypt.gensalt());

        PreparedStatement ps;

        String registerUserQuery = "INSERT INTO `user_db`(`u_firstname`, `u_lastname`, `u_username`, `u_contact`, `u_password`, `u_pic`) VALUES (?,?,?,?,?,?)";
        
        try {

//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicappointment", "root", "");
//            PreparedStatement statement = conn.prepareStatement("select * from user_db where u_username = '"+username+"'");
//            ResultSet rs = statement.executeQuery();
            ps = login_db.getConnection().prepareStatement(registerUserQuery);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, cont);
            ps.setString(5, hashedpassword);
            ps.setString(6, link.replace("\\", "\\\\"));

//            if(rs.next()){
//                
//            }
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }

        loginForm lo = new loginForm();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arrowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowsMouseClicked
        loginForm lo = new loginForm();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrowsMouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JFileChooser browseImageFile = new JFileChooser();
        FileNameExtensionFilter fnaf = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnaf);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION);
        File selectedImageFile = browseImageFile.getSelectedFile();
        String selectedImagePath = selectedImageFile.getAbsolutePath();
        link = selectedImagePath;
        JOptionPane.showMessageDialog(null, selectedImagePath);

        ImageIcon ii = new ImageIcon(selectedImagePath);

        Image image = ii.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        jLabel2.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrows;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField no;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}