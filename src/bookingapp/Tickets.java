
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
public class Tickets extends Booking {
   protected Booking myBooking ;
   protected String departure;
   protected String destination;
   
   
    public Tickets(){
        myBooking = new Booking();
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
 
    //
    
}