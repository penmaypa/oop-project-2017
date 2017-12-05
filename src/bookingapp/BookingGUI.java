/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bookingapp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author x16382003 - Penuel Maypa
 * @author x15044734 - Lawrence Bernabat
 * @author x16333223 - Rehan Naeem
 */

/*
This GUI was created by Penuel and Lawrence.
The GUI was partly designed and coded by Lawrence and partly by Penuel.
*/
public class BookingGUI extends javax.swing.JFrame {
    String departure = "" ;
    Booking booking;
    Tickets myTickets;
    String destination;
    String adult;
    String child;
    String infant;
    String seatType;
    String fName;
    String lName;
    
    Economy myEconomy; 
    Business myBusiness;
    First myFirst ;
    
    private ArrayList<Tickets> ticks;//declare ArrayList of type Module
    
    
    /**
     * Creates new form BookingGUI
     */
    public BookingGUI() {
        initComponents();
        booking = new Booking();
        myTickets = new Tickets();
        myEconomy = new Economy();
        myBusiness = new Business();
        myFirst = new First();
        ticks = new ArrayList<>();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        seatLS = new javax.swing.JList<>();
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        displayBT = new javax.swing.JButton();
        addBT = new javax.swing.JButton();
        seatCB = new javax.swing.JComboBox<>();
        valueTestBT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fNameTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lNameTF = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

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

        seatLS.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Economy", "Business", "First Class" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        seatLS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seatLS.setSelectedIndex(0);
        jScrollPane1.setViewportView(seatLS);

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

        nextBT.setText("Review");
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

        jLabel2.setText("5. Choose your class");

        displayBT.setText("Display");
        displayBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTActionPerformed(evt);
            }
        });

        addBT.setText("Add");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });

        seatCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First" }));
        seatCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatCBActionPerformed(evt);
            }
        });

        valueTestBT.setText("Value Test");
        valueTestBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueTestBTActionPerformed(evt);
            }
        });

        jLabel6.setText("First Name");

        fNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTFActionPerformed(evt);
            }
        });

        jLabel7.setText("Last Name");

        jLabel8.setText("6. Enter Your Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(seatCB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(112, 112, 112)
                                        .addComponent(fNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(nextBT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addBT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(displayBT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(valueTestBT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                    .addComponent(infantLBL)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel7)))
                                .addGap(13, 13, 13)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayBT, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueTestBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departCBActionPerformed
           // TODO add your handling code here:
           

    }//GEN-LAST:event_departCBActionPerformed

    private void nextBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTActionPerformed
        
     /*
        PAIR PROGRAMMING: Penuel & Lawrence
        Writer - Penuel
        Observer - Lawrence
     */
   
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
      
      seatType = seatCB.getSelectedItem().toString();
      booking.setSeatType(seatType);
      
      //booking.getTotalPrice();
    
     myTickets.setTotalPrice(booking.getTotalPrice());
     
      fName = fNameTF.getText();
      myTickets.setfName(fName);
      
      lName = lNameTF.getText();
      myTickets.setlName(lName);
      
      
       /*
        PAIR PROGRAMMING: Penuel & Lawrence
        Writer - Lawrence
        Observer - Rehan
     */
     
     //booking.getTotalPrice();
    // myTickets.setTotalPrice(booking.getTotalPrice());
     //myTickets.setSnacks(myTickets.getSnacks());
        myTickets.getDeparture();
        myTickets.getDestination();
        myEconomy.setDestination(myTickets.destination);
        myEconomy.setDeparture(myTickets.departure);
        myBusiness.setDestination(myTickets.destination);
        myBusiness.setDeparture(myTickets.departure);
        myFirst.setDestination(myTickets.destination);
        myFirst.setDeparture(myTickets.departure);
     
        if (seatType.equals("Economy")){
            JOptionPane.showMessageDialog(null, "\n -- Economy Class --\n"
            + "\n Passenger Name: " + myTickets.fName + " " + myTickets.lName
            + "\n Departing from " + myEconomy.getDeparture()
            + "\n Destination to " + myEconomy.getDestination()
            + "\n You booked a seat for " + booking.getAdult() + " Adult, " + booking.getChild() + " Child , and " + booking.getInfant() + " Infant"
            + "\n In Flight Snack: " + myEconomy.getSnacks());
        }else if(seatType.equals("Business")){
            JOptionPane.showMessageDialog(null, "\n -- Business Class --\n"
                + "\n Passenger Name: " + myTickets.fName + " " + myTickets.lName
                + "\n Departing from " + myBusiness.getDeparture()
                + "\n Destination to " + myBusiness.getDestination()
                + "\n You booked a seat for " + booking.getAdult() + " Adult, " + booking.getChild() + " Child , and " + booking.getInfant() + " Infant"
                + "\n In Flight Snack: " + myBusiness.getSnacks()
                + "\n In Flight Meal: " + myBusiness.getMeal()
            );
        }else{
               JOptionPane.showMessageDialog(null, "\n -- First Class --\n"
                + "\n Passenger Name: " + myTickets.fName + " " + myTickets.lName
                + "\n Departing from " + myFirst.getDeparture()
                + "\n Destination to " + myFirst.getDestination()
                + "\n You booked a seat for " + booking.getAdult() + " Adult, " + booking.getChild() + " Child , and " + booking.getInfant() + " Infant"
                + "\n In Flight Snack: " + myFirst.getSnacks()
                + "\n In Flight Meal: " + myFirst.getMeal()
                + "\n In Flight Meal: " + myFirst.getDrink()
               );   
            }
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

    private void displayBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTActionPerformed
        // TODO add your handling code here:
        for (Tickets i : ticks) {

              JOptionPane.showMessageDialog(null, i.getTotalPrice() + ", " + i.getDeparture() + ", " + i.getDestination() + i.getDestination() );
        }
        
    }//GEN-LAST:event_displayBTActionPerformed

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        // TODO add your handling code here:
        ticks.add(myTickets);
        writeToFile();
    }//GEN-LAST:event_addBTActionPerformed

    private void seatCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatCBActionPerformed

    private void valueTestBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueTestBTActionPerformed
        // TODO add your handling code here:
        
        // This is coded by Penuel
        // The purpose of this is to test that all the get method returns the correct values
          JOptionPane.showMessageDialog(null, "\n Booking:  "
              +"Booking n/ Your are departing from " + booking.getDeparture() + " "+ booking.getDepPrice()
             + " \n You are going to  " + booking.getDestination() + " " + booking.getDesPrice()
             +" \n Adults selected are " + booking.getAdult() 
              +" \n Childs amount is "+ booking.getChild()  
              + "\n Infant amount is: "+ booking.getInfant() 
             + " \n get.TotalPrice " + booking.getTotalPrice()
              + "\n totalPrice = " + booking.totalPrice
      );
     
      
        
       JOptionPane.showMessageDialog(null, "\n Tickets: \n Departure = " + myTickets.departure
              + "\n Tickets >Destination = " + myTickets.destination
               + "\n Tickets > totalPrice = " + myTickets.totalPrice
               + "\n Tickets > getTotalPrice = " + myTickets.getTotalPrice()
               +"\n Tickets > testPrice = " + myTickets.testPrice
               + "\n Tickets > getTestPrice() = " + myTickets.getTestPrice()
               + "\n Tickets > fName = " + myTickets.fName
               + "\n Tickets > getfName() = " + myTickets.getfName()
         );
       
       myEconomy.setDestination(myTickets.destination);
       myFirst.setDestination(myTickets.destination);
       myBusiness.setDestination(myTickets.destination);
       
       JOptionPane.showMessageDialog(null, "Economy: "
              + "\n Economy > getDeparture =   " + myEconomy.getDeparture()
               + "\n Economy > getDestination =   " + myEconomy.getDestination()
               +"\n Economy > totalPrice = " + myEconomy.totalPrice
               + "\n Economy > getTotalPrice = " + myEconomy.getTotalPrice()
               +"\n myEconomy.getTestPrice = " + myEconomy.getTestPrice()
               +"\n myEconomy.snacks = " + myEconomy.snacks
               +"\n myEconomy.getSnacks = " + myEconomy.getSnacks()
               + "\n myEconomy> fName = " + myEconomy.fName
               + "\n myEconomy > getfName() = " + myEconomy.getfName()
               
               + "\n \n Business: "
               + "\n Business > totalPrice = " + myBusiness.totalPrice
               + "\n Business > getSnacks = " + myBusiness.getSnacks()
               + "\n Business > meal = " + myBusiness.meal
               + "\n Business > getMeal = " + myBusiness.getMeal()
               
               + "\n \n First: "
               + "\n First > totalPrice = " + myFirst.totalPrice
               + "\n First > getSnacks = " + myFirst.getSnacks()
                + "\n First> getMeal = " + myFirst.getMeal()
               +"\n First > getDestination" + myFirst.getDestination()
        );
    }//GEN-LAST:event_valueTestBTActionPerformed

    private void fNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTFActionPerformed

    public void writeToFile() {
        try {
            File f = new File("tickets.dat");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);

            oStream.writeObject(ticks);
            oStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
     public void readFromFile() {
        try {
            File f = new File("tickets.dat");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);

            ticks = (ArrayList<Tickets>) oStream.readObject();
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }
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
    private javax.swing.JButton addBT;
    private javax.swing.JComboBox<String> adultCB;
    private javax.swing.JLabel adultLBL;
    private javax.swing.JComboBox<String> childCB;
    private javax.swing.JLabel childLBL;
    private javax.swing.JComboBox<String> departCB;
    private javax.swing.JComboBox<String> destinCB;
    private javax.swing.JButton displayBT;
    private javax.swing.JLabel displayLB;
    private javax.swing.JTextField fNameTF;
    private javax.swing.JComboBox<String> infantCB;
    private javax.swing.JLabel infantLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lNameTF;
    private javax.swing.JButton nextBT;
    private javax.swing.JComboBox<String> onereturnCB;
    private javax.swing.JLabel onereturnLBL;
    private javax.swing.JComboBox<String> seatCB;
    private javax.swing.JList<String> seatLS;
    private javax.swing.JButton valueTestBT;
    // End of variables declaration//GEN-END:variables
}
