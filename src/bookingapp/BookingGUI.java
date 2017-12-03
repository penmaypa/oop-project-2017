/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;
import javax.swing.JOptionPane;
/**
 *
 * @author x16382003
 */
public class BookingGUI extends javax.swing.JFrame {
    String departure = "" ;
    Booking booking;
    Tickets myTickets;
    String destination;
    String adult;
    String child;
    String infant;
    Economy myEconomy; 
    Business myBusiness;
    
    
    /**
     * Creates new form BookingGUI
     */
    public BookingGUI() {
        initComponents();
        booking = new Booking();
        myTickets = new Tickets();
        myEconomy = new Economy();
        myBusiness = new Business();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        departCB = new javax.swing.JComboBox<>();
        displayLB = new javax.swing.JLabel();
        destinCB = new javax.swing.JComboBox<>();
        nextBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        onereturnLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adultLBL = new javax.swing.JLabel();
        infantLBL = new javax.swing.JLabel();
        childLBL = new javax.swing.JLabel();
        adultCB = new javax.swing.JComboBox<>();
        childCB = new javax.swing.JComboBox<>();
        infantCB = new javax.swing.JComboBox<>();
        onereturnCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        classLS = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btn = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Ryan Air -- Booking Tickets");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("2.  Select Destination");

        departCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dublin", "Cork" }));
        departCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departCBActionPerformed(evt);
            }
        });

        displayLB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        destinCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        destinCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "London", "Paris" }));
        destinCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinCBActionPerformed(evt);
            }
        });

        nextBT.setText("Next");
        nextBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("1.  Select Departure");

        onereturnLBL.setText("3. Oneway or Return");

        jLabel4.setText("4. Quantity ");

        adultLBL.setText("Adult(16+)");

        infantLBL.setText("Infant(0-2)");

        childLBL.setText("Child(3-15)");

        adultCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        adultCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultCBActionPerformed(evt);
            }
        });
        adultCB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                adultCBPropertyChange(evt);
            }
        });

        childCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        childCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childCBActionPerformed(evt);
            }
        });

        infantCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        infantCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infantCBActionPerformed(evt);
            }
        });

        onereturnCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oneway", "Return" }));
        onereturnCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onereturnCBActionPerformed(evt);
            }
        });

        classLS.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Economy", "Business", "First Class" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        classLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        classLS.setSelectedIndex(0);
        jScrollPane1.setViewportView(classLS);

        jLabel2.setText("5. Choose your class");

        btn.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(onereturnCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adultLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(adultCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(childLBL)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(childCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(infantCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(infantLBL)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(departCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(destinCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(onereturnLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayLB, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator4)))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(nextBT, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adultLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(childLBL)
                            .addComponent(infantLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(childCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infantCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adultCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(onereturnLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onereturnCB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departCBActionPerformed
           // TODO add your handling code here:
           

    }//GEN-LAST:event_departCBActionPerformed

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        // TODO add your handling code here:
 
      departure= departCB.getSelectedItem().toString();
      booking.setDeparture(departure);
      myTickets.setDeparture(departure);
      destination= destinCB.getSelectedItem().toString();
      booking.setDestination(destination);
      myTickets.setDestination(destination);
      
     // myTickets.setDestination(destination);
      
      adult = adultCB.getSelectedItem().toString();
      booking.setAdult(Integer.parseInt(adult));
     
      child= childCB.getSelectedItem().toString();
      booking.setChild(Integer.parseInt(child));
      
      infant= infantCB.getSelectedItem().toString();
      booking.setInfant(Integer.parseInt(infant));
      
      //booking.getTotalPrice();
      //myTickets.setTotalPrice(booking.totalPrice);
      
     // myTickets.setTotalPrice(booking.getTotalPrice());
      
      
      JOptionPane.showMessageDialog(null, "Your are departing from " + booking.getDeparture() + " "+ booking.getDepPrice()
             + " \n You are going to  " + booking.getDestination() + " " + booking.getDesPrice()
             +" \n Adults selected are " + booking.getAdult() 
              +" \n Childs amount is "+ booking.getChild()  
              + "\n Infant amount is: "+ booking.getInfant() 
             + " \n Your total price is " + booking.getTotalPrice()
      );
      btn.setText("Hello");
      
        
       JOptionPane.showMessageDialog(null, "\n The value of Ticket variables are \n Departure = " + myTickets.departure
              + "\n Destination = " + myTickets.destination
               + "\n Tickets > totalPrice = " + myTickets.totalPrice
               + "\n Tickets > TotalPrice = " + myTickets.TotalPrice()
         );
       
       myEconomy.setDestination(myTickets.destination);
       
       JOptionPane.showMessageDialog(null, "This the value from Economy: "
               + "\n Economy > destination" + myTickets.destination
              + "\n Economy > getDestination =   " + myEconomy.getDestination()
               
               + "\n \n This the value under Business"
               + "\n The value of Business > totalPrice = " + myBusiness.totalPrice
               + "\n The value of Business > meal = " + myBusiness.meal
        );
    }//GEN-LAST:event_nextBTActionPerformed

    private void onereturnCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onereturnCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onereturnCBActionPerformed

    private void childCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_childCBActionPerformed

    private void infantCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infantCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infantCBActionPerformed

    private void destinCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinCBActionPerformed

    private void adultCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultCBActionPerformed

    private void adultCBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_adultCBPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_adultCBPropertyChange

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
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adultCB;
    private javax.swing.JLabel adultLBL;
    private javax.swing.JLabel btn;
    private javax.swing.JComboBox<String> childCB;
    private javax.swing.JLabel childLBL;
    private javax.swing.JList<String> classLS;
    private javax.swing.JComboBox<String> departCB;
    private javax.swing.JComboBox<String> destinCB;
    private javax.swing.JLabel displayLB;
    private javax.swing.JComboBox<String> infantCB;
    private javax.swing.JLabel infantLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextBT;
    private javax.swing.JComboBox<String> onereturnCB;
    private javax.swing.JLabel onereturnLBL;
    // End of variables declaration//GEN-END:variables
}
