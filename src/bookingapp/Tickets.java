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
   protected Booking b ;
   protected String departure;
   protected String destination ;
   
    
    public Tickets(){
        b = new Booking();
        departure = "";
        destination = "";
    }
    
    public Tickets(String departure, String destination, Booking b){
        this.departure = departure;
        this.destination = destination;
   
    }
    
    

    
}
