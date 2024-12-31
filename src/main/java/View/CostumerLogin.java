/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controler.ClientController;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mahdi
 */
public class CostumerLogin extends javax.swing.JFrame {

    ClientController fa;
    static String username;
    static String password;

    public CostumerLogin() {

        initComponents();
        fa = new ClientController();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new app.bolivia.swing.JCTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new Color(242,242,242, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 121, 38));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 121, 37));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 40));

        jButton1.setBackground(new java.awt.Color(51, 0, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 127, 40));

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setPlaceholder("Enter your Username");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 40));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Forget password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 210, 30));

        jCheckBox2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jCheckBox2.setText("Show Password");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 540, 360));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahdi\\Downloads\\G7CHocPDfEqzHbxVZiVNjA-1200-80.jpg")); // NOI18N
        jLabel4.setText(",mmf");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        username = jTextField1.getText().trim();
        char[] pass= jPasswordField1.getPassword();
        password= new String(pass);
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "username or password don't match");
            return;
        }
        if (fa.checkUser(username, password) == true) {
            this.setVisible(true);
            BookAtickets ti = new BookAtickets();
            ti.setVisible(true);
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "username or password don't match");
            jTextField1.setText("");
            jPasswordField1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
           if (jCheckBox2.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(CostumerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostumerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostumerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostumerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CostumerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private app.bolivia.swing.JCTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
