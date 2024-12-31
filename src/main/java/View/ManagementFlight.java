/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author mahdi
 */
public class ManagementFlight extends javax.swing.JFrame {

    public ManagementFlight() {
        initComponents();
        jPanel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(242, 242, 242));
        jLabel10.setText("Home Page");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 220, 60));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton12.setText("ADD FLIGHT");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 60));

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton13.setText("UPDATE FLIGHT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 60));

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton14.setText("ADD AIRPLANE");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 60));

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton15.setText("PRINT INFORMATION");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 60));

        jButton1.setBackground(new java.awt.Color(51, 0, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 220, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 216, 560));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 5, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 50));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Airlines Management System");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 320, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome Admin");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 250, 50));

        jButton2.setText("______");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahdi\\Downloads\\debt-sourcing-page-01.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        new AddFlight().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        new UpdateFlight().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        new AddAirlines().setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        new PrintInformation().setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jPanel3.isVisible()) {
            jPanel3.setVisible(false);
        } else {
            jPanel3.setVisible(true);
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
            java.util.logging.Logger.getLogger(ManagementFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create; m   and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton12;
    javax.swing.JButton jButton13;
    javax.swing.JButton jButton14;
    javax.swing.JButton jButton15;
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
