//

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
 * Coded by Penuel Maypa
 * 
 GITHUB
 * https://github.com/penmaypa/oop-project-2017/branches
 */
//
public class BookingApp extends Booking{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Booking myBooking = new Booking();
       
        
        myBookingGUI.setVisible(true);
       */
         BookingGUI myBookingGUI = new BookingGUI();
         Booking myBooking = new Booking();
         Tickets myTickets = new Tickets();
         
         myBookingGUI.setVisible(true);
         
         
        
         
         /*JOptionPane.showMessageDialog(null, "Running on main " + myBooking.departure);*/
    
   
    }
    
}


/*
    

*/
