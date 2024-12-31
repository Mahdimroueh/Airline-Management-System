/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controler.Admin1Controller;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class AddFlight extends javax.swing.JFrame {

    Admin1Controller fa;

    public AddFlight() {
        initComponents();
        fa = new Admin1Controller();
        for (int i = 0; i < fa.getAllAirplaneID().size(); i++) {
            airplaneTxt.addItem(fa.getAllAirplaneID().get(i));
        }

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TravelTimeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PriceTxt = new javax.swing.JTextField();
        TravelDateTxt = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        airplaneTxt = new javax.swing.JComboBox<>();
        DestinationAirportTxt = new javax.swing.JComboBox<>();
        DepartureAirportTxt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Departure airport");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Destination Airport");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Travel time");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Travel Date");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Price");

        PriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTxtActionPerformed(evt);
            }
        });
        PriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceTxtKeyTyped(evt);
            }
        });

        TravelDateTxt.setDateFormatString("dd/MM/yyyy");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Airplane ID");

        DestinationAirportTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rafic Hariri International Airport (Beirut, Lebanon)", "Hartsfield-Jackson Atlanta International Airport (United States)", "Heathrow Airport (United Kingdom)", "Dubai International Airport (United Arab Emirates)", "Beijing Capital International Airport (China)", "Los Angeles International Airport (United States)", "Tokyo Haneda Airport (Japan)", "O'Hare International Airport (Chicago, United States)", "Charles de Gaulle Airport (Paris, France)", "Frankfurt Airport (Germany)", "Amsterdam Airport Schiphol (Netherlands)", "Singapore Changi Airport (Singapore)", "King Abdulaziz International Airport (Jeddah, Saudi Arabia)", "Hamad International Airport (Doha, Qatar)", "King Khalid International Airport (Riyadh, Saudi Arabia)", "Istanbul Airport (Turkey)", "Suvarnabhumi Airport (Bangkok, Thailand)", "Sydney Airport (Australia)", "Indira Gandhi International Airport (New Delhi, India)", "Leonardo da Vinci–Fiumicino Airport (Rome, Italy)", "King Fahd International Airport (Dammam, Saudi Arabia)", "King Abdulaziz International Airport (Dammam, Saudi Arabia)", "Cairo International Airport (Egypt)", "Dubai International Airport (United Arab Emirates)", "Abu Dhabi International Airport (United Arab Emirates)" }));

        DepartureAirportTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rafic Hariri International Airport (Beirut, Lebanon)", "Hartsfield-Jackson Atlanta International Airport (United States)", "Heathrow Airport (United Kingdom)", "Dubai International Airport (United Arab Emirates)", "Beijing Capital International Airport (China)", "Los Angeles International Airport (United States)", "Tokyo Haneda Airport (Japan)", "O'Hare International Airport (Chicago, United States)", "Charles de Gaulle Airport (Paris, France)", "Frankfurt Airport (Germany)", "Amsterdam Airport Schiphol (Netherlands)", "Singapore Changi Airport (Singapore)", "King Abdulaziz International Airport (Jeddah, Saudi Arabia)", "Hamad International Airport (Doha, Qatar)", "King Khalid International Airport (Riyadh, Saudi Arabia)", "Istanbul Airport (Turkey)", "Suvarnabhumi Airport (Bangkok, Thailand)", "Sydney Airport (Australia)", "Indira Gandhi International Airport (New Delhi, India)", "Leonardo da Vinci–Fiumicino Airport (Rome, Italy)", "King Fahd International Airport (Dammam, Saudi Arabia)", "King Abdulaziz International Airport (Dammam, Saudi Arabia)", "Cairo International Airport (Egypt)", "Dubai International Airport (United Arab Emirates)", "Abu Dhabi International Airport (United Arab Emirates)" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 431, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TravelTimeTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PriceTxt)
                                    .addComponent(TravelDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DestinationAirportTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DepartureAirportTxt, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(airplaneTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepartureAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DestinationAirportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TravelTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TravelDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airplaneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 760, 450));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\mahdi\\Downloads\\fly-high-and-explore-the-great-sky-above-us-9tx93wzcazaih94b.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -4, 750, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (airplaneTxt.getSelectedObjects().length == 0) {
            JOptionPane.showMessageDialog(null, "there is No airlines for the Flight");
            return;
        }

        try {
            String Departure = DepartureAirportTxt.getSelectedItem().toString();
            String Destination = DestinationAirportTxt.getSelectedItem().toString();
            String DepartureTime = TravelTimeTxt.getText();
            java.util.Date utilDate = TravelDateTxt.getDate();
            java.sql.Date DepartureDate = new java.sql.Date(utilDate.getTime());
            String AirplaneID = airplaneTxt.getSelectedItem().toString();
            int price = Integer.parseInt(PriceTxt.getText());
            if(DepartureDate.toLocalDate().isBefore(LocalDate.now())){
                JOptionPane.showMessageDialog(null, "Invalid Date ");
                return;
            }
            if (TravelTimeTxt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter the Flight Time");
                return;
            }
            if (Departure.equalsIgnoreCase(Destination)) {
                JOptionPane.showMessageDialog(null, "Destination and Departure should not be Equal");
                return;
            }
            int result = fa.addFlight(Departure, Destination, DepartureDate, DepartureTime, price, AirplaneID);
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "The Airplane Have a flight in the Given Date");
            } else if (result > 0) {
                JOptionPane.showMessageDialog(null, "added Succesfuly");
                TravelTimeTxt.setText("");
                TravelDateTxt.setDate(null);
                PriceTxt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "failure");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Enter a Date");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter a Price");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTxtActionPerformed

    }//GEN-LAST:event_PriceTxtActionPerformed

    private void PriceTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceTxtKeyTyped
        char g = evt.getKeyChar();
        if (!Character.isDigit(g)) {
            evt.consume();
        }
    }//GEN-LAST:event_PriceTxtKeyTyped
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DepartureAirportTxt;
    private javax.swing.JComboBox<String> DestinationAirportTxt;
    private javax.swing.JTextField PriceTxt;
    private com.toedter.calendar.JDateChooser TravelDateTxt;
    private javax.swing.JTextField TravelTimeTxt;
    private javax.swing.JComboBox<String> airplaneTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
