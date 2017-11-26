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
public class BookingApp extends Booking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Booking b = new Booking();
        
        JOptionPane.showMessageDialog(null, b.price);
    }
    
}
