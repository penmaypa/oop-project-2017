
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingapp;

/**
 *
 * @author x16333223
 */
public class Tickets {
   protected String departure;
   protected String destination;
   Booking myBooking;
   double  totalPrice;
   
    public Tickets(){
        totalPrice = 20.00;
     }
   
   
    //

    public String getDeparture() {
        return departure ;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    
    
}